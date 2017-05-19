package com.database;

import com.myclass.impliments.plane.Plane;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Rekdon on 19.05.2017.
 */
public interface StorageDAO {

    void savePlane(Plane plane) throws SQLException;
    List<Plane> allPlane() throws SQLException;
    boolean deletePlane(Plane plane) throws SQLException;
    public void updatePlane(Plane plane,int id) throws SQLException;
    public Plane getPlane(int id) throws SQLException;
}