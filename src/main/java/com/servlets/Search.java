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
 * Created by Rekdon on 24.05.2017.
 */
@WebServlet("/search")
public class Search extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseDAO dao = null;
        try {
            dao = DatabaseDAO.getInstance();
            Integer id = 0;
            id = Integer.valueOf(request.getParameter("id"));
            ArrayList<Plane> planes = new ArrayList<>();
            planes = dao.allPlane();
            int k=0;
            for (int i = 0; i < planes.size(); i++) {
                if (id != planes.get(i).getId()) {
                    k++;
                }
            }
                if(k==planes.size()) {
                    request.getRequestDispatcher("/sorry.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("PLANE", dao.getPlane(id));
                    request.getRequestDispatcher("/search.jsp").forward(request, response);
                }
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
