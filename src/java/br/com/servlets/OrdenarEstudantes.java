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
import java.util.Collections;
import java.util.List;
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
@WebServlet(urlPatterns={"/ordenarNome"})
public class OrdenarEstudantes extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Banco banco = new Banco();        
        List<Estudante> listaEstudantes = banco.getEstudantes();
        Estudante estudante = new Estudante();
        
        estudante.setTipoOrdenar(0);
        Collections.sort(listaEstudantes);//.sort é um método de ordenação         
        
        req.setAttribute("ordenar", listaEstudantes);
        RequestDispatcher rd = req.getRequestDispatcher("/ordenar_por_nome.jsp");
        rd.forward(req, resp);
    }
    
}
