package com.servlets;

import com.database.DatabaseDAO;
import com.myclass.impliments.plane.Plane;
import org.postgresql.util.PSQLException;

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
@WebServlet("/showAll")
public class ShowAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseDAO dao = null;
        try {
            dao = DatabaseDAO.getInstance();
            ArrayList<Plane> daoList = dao.allPlane();
            request.setAttribute("PLANES",daoList);
            request.getRequestDispatcher("/showAll.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}