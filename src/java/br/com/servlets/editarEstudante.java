/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servlets;

import br.com.dao.Banco;
import br.com.modelo.Estudante;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isael
 */
@WebServlet(urlPatterns="/editarEstudante")
public class editarEstudante extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        
        Banco meuBanco = new Banco();
        Estudante estudante = meuBanco.getEstudantesId(id);
        
        req.setAttribute("estudante", estudante);
        RequestDispatcher rd = req.getRequestDispatcher("formularioEditar.jsp");
        rd.forward(req, resp);
    }
    
}
