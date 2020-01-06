package br.com.site.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.site.entidades.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends javax.servlet.http.HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6082369488265126233L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Contato contato = new Contato();
		
		contato.setNomeContato(request.getParameter("nome"));
        PrintWriter out = response.getWriter();
		
		 out.println("<html>");
         out.println("<body>");
         out.println("Contato " + contato.getNomeContato() +
                 "  adicionado com sucesso");        
         out.println("</body>");
         out.println("</html>");
		
	}
}
