package com.database;

import com.myclass.impliments.plane.Plane;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Rekdon on 19.05.2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException {

        DatabaseDAO databaseDAO = DatabaseDAO.getInstance();
        List<Plane> planeList = databaseDAO.allPlane();
        for (int i = 0; i < planeList.size(); i++) {
            System.out.println(planeList.get(i).getName() + " "
                    + planeList.get(i).getSpeed() + " " +
                    planeList.get(i).getMass() + " " +
                    planeList.get(i).getNumberOfPassengers() + " " +
                    planeList.get(i).getNumberOfWheels() + " " +
                    planeList.get(i).getNumberOfPilots() + " " +
                    planeList.get(i).getId());
        }
        // System.out.println(databaseDAO.deleteBook(new Book("book2", 25.5, 399, 2000, 9)));
        databaseDAO.updatePlane(new Plane("planeA58", 26, 3929, 40, 4,2,4), 3);
        System.out.println(databaseDAO.getPlane(3));

    }
}
