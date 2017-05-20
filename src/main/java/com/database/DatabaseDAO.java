package com.database;

/**
 * Created by Rekdon on 19.05.2017.
 */

import com.myclass.impliments.plane.Plane;
import org.postgresql.util.PSQLException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rekdon on 19.05.2017.
 */
public class DatabaseDAO implements StorageDAO {

    private static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static String USER = "postgres";
    private static String PASSWORD = "Vlad1998";

    private static DatabaseDAO instance;

    public static DatabaseDAO getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseDAO();
        }
        return instance;
    }

    public DatabaseDAO() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private Connection connection;

    @Override
    public void savePlane(Plane plane) throws SQLException,PSQLException {
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO plane (name,speed,mass,numberOfPassengers,numberOfWheels,numberOfPilots,id)" +
                        " VALUES (?,?,?,?,?,?,?)");
        ps.setString(1, plane.getName());
        ps.setInt(2, plane.getSpeed());
        ps.setInt(3, plane.getMass());
        ps.setInt(4, plane.getNumberOfPassengers());
        ps.setInt(5, plane.getNumberOfWheels());
        ps.setInt(6, plane.getNumberOfPilots());
        ps.setInt(7, plane.getId());
//        ps.execute();
        ps.close();
    }

    @Override
    public ArrayList<Plane> allPlane() throws SQLException{
        ArrayList<Plane> result = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT name,speed,id,mass,numberofpassengers,numberofwheels,numberofpilots FROM plane");
        while (rs.next()) {
            String name = rs.getString("name");
            int speed = rs.getInt("speed");
            int id = rs.getInt("id");
            int mass = rs.getInt("mass");
            int passengers = rs.getInt("numberofpassengers");
            int wheels = rs.getInt("numberofwheels");
            int pilots = rs.getInt("numberofpilots");

            Plane plane = new Plane(name,speed,id,mass,passengers,wheels,pilots);
            result.add(plane);
        }

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
    public void updatePlane(Plane plane, int id1) throws SQLException {
        String sql = "UPDATE plane SET name = ?, speed = ?, mass = ?,id=? numberOfPassengers = ?," +
                "numberOfWheels=?,numberOfPilots=?";
        sql += " where id = id1";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, plane.getName());
        statement.setInt(2, plane.getSpeed());
        statement.setInt(3, plane.getMass());
        statement.setInt(4, plane.getId());
        statement.setInt(5, plane.getNumberOfPassengers());
        statement.setInt(6, plane.getNumberOfWheels());
        statement.setInt(7, plane.getNumberOfPilots());


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
            int speed = rs.getInt("speed");
            int mass = rs.getInt("mass");
            int id1 = rs.getInt("id");
            int passengers = rs.getInt("numberOfPassengers");
            int wheels = rs.getInt("numberOfWheels");
            int pilots = rs.getInt("numberOfPilots");

            plane = new Plane(name,speed,mass,id1,passengers,wheels,pilots);
        }

        rs.close();
        statement.close();

        return plane;
    }

}