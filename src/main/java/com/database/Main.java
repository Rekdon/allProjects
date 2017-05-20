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
        System.out.println(planes.size());
        for(int i=0;i<planes.size();i++)
        {
            System.out.println(planes);
        }
        System.out.println(databaseDAO.allPlane().size());
    }
}
