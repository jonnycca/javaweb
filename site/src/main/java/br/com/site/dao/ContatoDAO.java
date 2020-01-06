package br.com.site.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.site.conexoes.FabricaConexoes;
import br.com.site.entidades.Contato;

public class ContatoDAO {

	public List<Contato> selecionar() throws SQLException, IOException {
		List<Contato> contatos = new ArrayList<>();

		try (Connection conexao = FabricaConexoes.criarConexao()) {
			Statement comando = conexao.createStatement();
			ResultSet rs = comando.executeQuery("SELECT * FROM contatos;");
			while (rs.next()) {
				Contato contato = new Contato();
				contato.setIdContato(rs.getInt("id"));
				contato.setNomeContato(rs.getString("nome"));
				contato.setEnderecoContato(rs.getString("endereco"));
				contato.setEmailContato(rs.getString("email"));
				contatos.add(contato);
			}
		}
		return contatos;
	}
}
