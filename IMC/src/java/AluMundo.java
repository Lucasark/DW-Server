/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucasark
 */
public class AluMundo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n" +
                        "<html lang=\"pt-br\">\n" +
                        "<head>\n" +
                        "	<meta charset=\"utf-8\">\n" +
                        "	<title>Cálculo do IMC</title>\n" +
                        "	<script type=\"text/javascript\" src=\"main.js\"></script>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "	<div class=\"dadosBox\">\n" +
                        "		<form>\n" +
                        "			<div>\n" +
                        "				<label for=\"altura\">Altura</label><br>\n" +
                        "				<input type=\"text\" name=\"altura\" id =\"altura\">\n" +
                        "			</div>\n" +
                        "			<br>\n" +
                        "			<div>\n" +
                        "				<label for=\"peso\">Peso</label><br>\n" +
                        "				<input type=\"text\" name=\"peso\" id =\"peso\">\n" +
                        "			</div>\n" +
                        "			<br>\n" +
                        "			<button onClick=\"submeterDados()\">Calcular</button>\n" +
                        "		</form>\n" +
                        "	</div>\n" +
                        "</body>\n" +
                        "</html>");
            out.println("<script type=\"text/javascript\">\n" +
                        "function submeterDados() {\n" +
                        "	var peso = document.getElementById(\"peso\");\n" +
                        "	var altura = document.getElementById(\"altura\");\n" +
                        "	var imc = peso.value / (altura.value * altura.value);\n" +
                        "	alert(\"IMC >>>>>>>>\" + imc);\n" +
                        "}\n" +
                        "</script>");
            String altura = request.getParameter(altura);
        }
    }

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
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
