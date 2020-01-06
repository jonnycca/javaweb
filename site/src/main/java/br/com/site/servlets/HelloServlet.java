package br.com.site.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.site.dao.ContatoDAO;
import br.com.site.entidades.Contato;

@WebServlet("/hello")
public class HelloServlet extends javax.servlet.http.HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2450691410401178917L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		List<Contato> contatos = new ArrayList<>();
		ContatoDAO contatoDAO = new ContatoDAO();
		
		try {
			contatos = contatoDAO.selecionar();
		} catch (SQLException e) {
			System.out.println("Erro ao obter contato do banco de dados:");
			System.out.println(e.getMessage());
		}
		
		Contato contato = new Contato();

		for (Contato contat : contatos) {
			contato = contat;
		}

		out.println("Hello vindo do servlet");
		System.out.println("O nome do contato é");
		System.out.println(contato.getNomeContato());
		out.print(contato.getNomeContato());
	}
}
