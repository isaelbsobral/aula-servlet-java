
package br.com.servlets.jstl;

import br.com.dao.Banco;
import br.com.modelo.Estudante;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cadastrarEstudante")
public class NovoCadastrarJSTL extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Pegando valores passado nos inputs html
        String nome = req.getParameter("txtNome");
        String paramDataNascimento = req.getParameter("txtData");
        
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {//tentativa de converter a string passada em uma data
            dataNascimento = dataFormatada.parse(paramDataNascimento);
        } catch (ParseException ex) {
               throw new ServletException(ex);
        }
        Estudante estudante1 = new Estudante();
        estudante1.setNome(nome);
        estudante1.setDataNascimento(dataNascimento);
        Banco meuBanco = new Banco();
        meuBanco.cadastrarEstudante(estudante1);
        
        RequestDispatcher rd = req.getRequestDispatcher("/msg_estudante.jsp");//criando e redirecionando a requisaão para uma página jsp
        req.setAttribute("estudante", estudante1.getNome());//criando atrb e passndo o nome q foi cadastrado
        rd.forward(req, resp);//despacaha as requisições e reposta-> levando junto 
    }
    
}
