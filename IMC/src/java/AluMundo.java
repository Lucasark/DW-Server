/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucasark
 */

    public class AluMundo extends HttpServlet {
        public double resultado;
        public double getResultado(){
        return resultado;
        }
    
    
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
        String altura = request.getParameter("altura");
        String peso = request.getParameter("peso");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n" +
                        "<html lang=\"pt-br\">\n" +
                        "<head>\n" +
                        "	<meta charset=\"utf-8\">\n" +
                        "	<title>Cálculo do IMC</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "	<div class=\"dadosBox\">\n" +
                        "		<form name=\"Form\" action=\"AluMundo\" method=\"POST\">\n" +
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
                        "			<input type=\"submit\" name=\"Enviar\" value=\"Enviar\" />\n" +
                        "		</form>\n" +
                        "	</div>\n" +
                        "</body>\n" +
                        "</html>");
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
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        //receber os valores de SUBMIT (form)
        
        //fazer a veriricação de valor
        
            //caso certo -> 
            //response.sendRedirect("/IMC/imc_result?altura=" + altura + "&peso=" + peso  );
                //adendo: Quando o sendRe acontece ele "ignora" o que está embaixo;
            
            //caso errado ->
            //"reprintar" o HTML indicando onde está errado
            
            
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n" +
                        "<html lang=\"pt-br\">\n" +
                        "<head>\n" +
                        "	<meta charset=\"utf-8\">\n" +
                        "	<title>Cálculo do IMC</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "	<div class=\"dadosBox\">\n" +
                        "		<form name=\"Form\" action=\"imc_result\">\n" +
                        "			<div>\n" +
                        "				<label for=\"altura\">Altura</label><br>\n" +
                        "				<input type=\"text\" name=\"altura\" id =\"altura\" value="+altura+">\n" +
                        "			</div>\n" +
                        "			<br>\n" +
                        "			<div>\n" +
                        "				<label for=\"peso\">Peso</label><br>\n" +
                        "				<input type=\"text\" name=\"peso\" id =\"peso\" value="+peso+">\n" +
                        "			</div>\n" +
                        "			<br>\n" +
                        "			<input type=\"submit\" name=\"Enviar\" value=\"Enviar\" />\n" +
                        "		</form>\n" +
                        "	</div>\n" +
                        "</body>\n" +
                        "</html>");
        }    
        
        
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
