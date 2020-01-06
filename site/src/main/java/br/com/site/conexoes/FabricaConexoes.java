package br.com.site.conexoes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexoes {
	
	private FabricaConexoes() {//construtor privado para garantir a não instanciação
		
	}

	public static Connection criarConexao() throws IOException, SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		InputStream is = FabricaConexoes.class.getClassLoader().getResourceAsStream("application.properties");//abre o arquivo application.properties para obter as informações de conexao
		
		if(is == null) {
			throw new FileNotFoundException("O arquivo de configuração do banco de dados não foi encontrado.");
		}
		Properties props = new Properties();
		props.load(is);
		return DriverManager.getConnection(props.getProperty("urlConexao"), props.getProperty("usuarioConexao"), props.getProperty("senhaConexao"));
	}
}
