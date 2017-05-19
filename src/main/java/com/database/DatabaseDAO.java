package com.database;

/**
 * Created by Rekdon on 19.05.2017.
 */

import com.myclass.impliments.plane.Plane;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rekdon on 19.05.2017.
 */
public class DatabaseDAO implements StorageDAO {

    private static String URL = "jdbc:postgresql://localhost:5433/postgres";
    private static String USER = "postgres";
    private static String PASSWORD = "Vlad1998";

    private static DatabaseDAO instance;

    public static DatabaseDAO getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseDAO();
        }
        return instance;
    }

    private DatabaseDAO() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private Connection connection;

    @Override
    public void savePlane(Plane plane) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO plane (name,speednow,mass,numberofpassengers,numberofwheels,numberofpilots,id)" +
                        " VALUES (?,?,?,?,?,?,?)");
        ps.setString(1, plane.getName());
        ps.setInt(2, plane.getSpeed());
        ps.setInt(3, plane.getMass());
        ps.setInt(4, plane.getNumberOfPassengers());
        ps.setInt(5, plane.getNumberOfWheels());
        ps.setInt(6, plane.getNumberOfPilots());
        ps.setInt(7, plane.getId());
        ps.execute();
        ps.close();
    }

    @Override
    public List<Plane> allPlane() throws SQLException {
        List<Plane> result = new ArrayList<Plane>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT name,speednow,mass,numberofpassengers,numberofwheels,numberofpilots,id FROM plane");
        while (rs.next()) {
            result.add(new Plane(
                    rs.getString("name"),
                    rs.getInt("speednow"),
                    rs.getInt("mass"),
                    rs.getInt("numberofpassengers"),
                    rs.getInt("numberofwheels"),
                    rs.getInt("numberofpilots"),
                    rs.getInt("id")));
        }
        //join пошукати
        return result;
    }

    @Override
    public boolean deletePlane(Plane plane) throws SQLException {
        String delete = "DELETE FROM plane where id = ?";
        PreparedStatement statement = connection.prepareStatement(delete);
        statement.setInt(1, plane.getId());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        return rowDeleted;
    }

    @Override
    public void updatePlane(Plane plane, int id) throws SQLException {
        String sql = "UPDATE plane SET title = ?, price = ?, page = ?, year = ?,id = ?";
        sql += " where id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, plane.getName());
        statement.setInt(2, plane.getSpeed());
        statement.setInt(3, plane.getMass());
        statement.setInt(4, plane.getNumberOfPassengers());
        statement.setInt(5, plane.getNumberOfWheels());
        statement.setInt(6, plane.getNumberOfPilots());
        statement.setInt(7, plane.getId());


        statement.close();
    }

    @Override
    public Plane getPlane(int id) throws SQLException {
        Plane plane = null;
        String sql = "SELECT * FROM plane WHERE id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            String name = rs.getString("name");
            int speed = rs.getInt("speednow");
            int mass = rs.getInt("mass");
            int passengers = rs.getInt("numberofpassengers");
            int wheels = rs.getInt("numberofwheels");
            int pilots = rs.getInt("numberofpilots");
            int id1 = rs.getInt("id");

            plane = new Plane(name,speed,mass,passengers,wheels,pilots,id1);
        }

        rs.close();
        statement.close();

        return plane;
    }

}