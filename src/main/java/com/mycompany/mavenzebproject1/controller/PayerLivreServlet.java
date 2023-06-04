/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.mavenzebproject1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GAMING
 */
@WebServlet(name = "PayerLivreServlet", urlPatterns = {"/payer-livre"})
public class PayerLivreServlet extends HttpServlet {

    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String numeroCarte = request.getParameter("numeroCarte");
        PrintWriter out = response.getWriter();
        String identifiantLivre = (String) session.getAttribute("identifiantLivre");
                
        out.print("<html><body>Paiement effectue avec le numero de carte "+ numeroCarte + "<br>");
        out.print("Le livre payer est celui avec l'identifiant "+ identifiantLivre + "<br>");
        out.print("</body></html>");
    }

}
