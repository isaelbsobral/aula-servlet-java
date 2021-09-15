/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servlets;

import br.com.dao.Banco;
import br.com.modelo.Estudante;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(urlPatterns="/ordenarData")
public class ordenarEstudanteData extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco meuBanco = new Banco();//cria o banco
        List<Estudante> listaEstudantes = meuBanco.getEstudantes();//cria a lista de estudante registrada no banco
        Estudante estudanteData = new Estudante();//cru
        estudanteData.setTipoOrdenar(1);
        
        Collections.sort(listaEstudantes);
        
        req.setAttribute("ordenar_data", listaEstudantes);//crio o atributo ordenar data com 
        RequestDispatcher rd = req.getRequestDispatcher("/ordenar_por_data.jsp");
        rd.forward(req, resp);
        
        
    }
    
    
}
