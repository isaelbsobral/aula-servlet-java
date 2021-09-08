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
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isael
 */
@WebServlet(urlPatterns = "/cadastrarEstudantes")
public class CadastrarEstudanteServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String nome = req.getParameter("txtNome");
      // String mediaString = req.getParameter("txtMedia");
      // Double media = req.getParameter(Double.parseDouble(String.copyValueOf(mediaString)));
       
       Estudante estudante = new Estudante();
       estudante.setNome(nome);
       
       Banco banco = new Banco();
       banco.cadastrarEstudante(estudante);
       
       PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
            out.println("<h3>Estudante "+nome+" cadastrado</h3>");            
        out.println("</body>");
        out.println("</html>");
       
    }
    
}
