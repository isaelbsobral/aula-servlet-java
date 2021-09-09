
import br.com.dao.Banco;
import br.com.modelo.Estudante;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isael
 */
@WebServlet(urlPatterns = "/listar")
public class NovoListarJSTL extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco meuBanco = new Banco();
        List<Estudante> lista = meuBanco.getEstudantes();
        
        req.setAttribute("estudantes", lista);
        RequestDispatcher rd = req.getRequestDispatcher("/lista_estudantes.jsp");
        rd.forward(req, resp);
    }
    
}
