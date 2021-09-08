/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servlets;

import br.com.dao.Banco;
import br.com.modelo.Estudante;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isael
 */
@WebServlet(urlPatterns ="/listarEstudantes")
public class ListarEstudantes extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     PrintWriter out = resp.getWriter();
        Banco banco = new Banco();
        List<Estudante> lista = banco.getEstudantes();
        
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h4>Estudantes</h4>");
            out.println("<ul>");
                for(Estudante estudante:  lista){
                    out.println("<li>"+estudante.getNome()+"</li>");
                }
            
            out.println("</ul>");
            
        out.println("</body>");
        out.println("</html>");
    
    }
   
}
