package br.com.site.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.site.conexoes.FabricaConexoes;
import br.com.site.entidades.Contato;

public class ContatoDAO {

	public List<Contato> selecionar() throws SQLException, IOException {
		List<Contato> contatos = new ArrayList<>();

		try (Connection conexao = FabricaConexoes.criarConexao()) {//usando a conexao dentro do try, ou seja, ela estará disponível apenas durante esse escopo
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
	
	public void adicionarContatos(Contato contato) throws SQLException, IOException {
		try(Connection conexao = FabricaConexoes.criarConexao()){
			PreparedStatement comando = (PreparedStatement) conexao.prepareStatement("INSERT INTO contatos (nomse, endereco, email) VALUES(?, ?, ?)");
			comando.setString(1, contato.getNomeContato());
			comando.setString(2, contato.getEnderecoContato());
			comando.setString(3, contato.getEmailContato());
			comando.execute();
		}
	}
}
