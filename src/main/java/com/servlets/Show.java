package com.servlets;

import com.database.DatabaseDAO;
import com.myclass.impliments.plane.Plane;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Rekdon on 19.05.2017.
 */
@WebServlet("/show")
public class Show extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Integer speed = Integer.valueOf(request.getParameter("speed"));
        Integer mass = Integer.valueOf(request.getParameter("mass"));
        Integer numberOfPassengers = Integer.valueOf(request.getParameter("numberOfPassengers"));
        Integer numberOfWheels = Integer.valueOf(request.getParameter("numberOfWheels"));
        Integer numberOfPilots = Integer.valueOf(request.getParameter("numberOfPilots"));
        Integer id = Integer.valueOf(request.getParameter("id"));
        Plane plane = new Plane(name,speed,id,mass,numberOfPassengers,numberOfWheels,numberOfPilots);
        DatabaseDAO databaseDAO = null;
        try {
            databaseDAO = DatabaseDAO.getInstance();
            databaseDAO.savePlane(plane);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("PLANE",plane);
        request.getRequestDispatcher("/showAdded.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
