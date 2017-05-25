package com.database;

import com.myclass.impliments.plane.Plane;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Rekdon on 19.05.2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException,IOException {

        DatabaseDAO databaseDAO = DatabaseDAO.getInstance();
        ArrayList<Plane> planes = databaseDAO.allPlane();
        databaseDAO.deletePlane(databaseDAO.getPlane(1));
        System.out.println(databaseDAO.allPlane().size());
        databaseDAO.updatePlane(new Plane("Boeng",400,3,4100,40,3,2));
        databaseDAO.savePlane(new Plane("B65",304,6,4000,30,2,2));



    }
}
