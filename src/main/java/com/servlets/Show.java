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
import java.util.ArrayList;

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
        DatabaseDAO dao = null;

        try {
            dao = DatabaseDAO.getInstance();
            ArrayList<Plane> daoList = dao.allPlane();
            int k=0;
            for(int i=0;i<daoList.size();i++) {
                if (id != daoList.get(i).getId())
                {
                    k++;
                }
            }
            if(k==daoList.size())
            {
                dao.savePlane(plane);
                daoList = dao.allPlane();
                daoList.add(plane);
            }
            else
            {
                dao.updatePlane(plane);
                daoList = dao.allPlane();

            }
            request.setAttribute("PLANES",daoList);
            request.getRequestDispatcher("/showAdded.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
