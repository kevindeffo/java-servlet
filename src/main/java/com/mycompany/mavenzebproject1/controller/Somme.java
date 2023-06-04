/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.mavenzebproject1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAMING
 */
@WebServlet(name = "Somme", urlPatterns = {"/somme"})
public class Somme extends HttpServlet {

   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");
        try{
            int somme = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);
            out.print("<html><body><body> La somme des deux nombres fournies est: " + somme +"<html>");
        }catch(NumberFormatException e){
            RequestDispatcher disp = request.getRequestDispatcher("/unexpected-error.html");
            disp.forward(request, response);
        }
    }


}
