package br.com.site.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.site.dao.ContatoDAO;
import br.com.site.entidades.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends javax.servlet.http.HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6082369488265126233L;

	static final Logger logger = LogManager.getLogger(AdicionaContatoServlet.class.getName());

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Contato contato = new Contato();

		contato.setNomeContato(request.getParameter("nome"));
		contato.setEnderecoContato(request.getParameter("endereco"));
		contato.setEmailContato(request.getParameter("email"));

		PrintWriter out = response.getWriter();

		ContatoDAO contatoDAO = new ContatoDAO();

		try {
			contatoDAO.adicionarContatos(contato);
			out.println("<html>");
			out.println("<body>");
			out.println("Contato " + contato.getNomeContato() + "  adicionado com sucesso");
			out.println("</body>");
			out.println("</html>");
		} catch (SQLException e) {
			logger.error("Erro ao adicionar contato ao banco de dados!");
			logger.error("Erro: " + e.getMessage());
		}
	}

}
