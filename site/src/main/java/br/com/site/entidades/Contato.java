package br.com.site.entidades;

import java.util.Calendar;

public class Contato {

	private int idContato;
	private String nomeContato;
	private String emailContato;
	private String enderecoContato;
	private Calendar dataNascimento;

	public int getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getEnderecoContato() {
		return enderecoContato;
	}

	public void setEnderecoContato(String enderecoContato) {
		this.enderecoContato = enderecoContato;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", nomeContato=" + nomeContato + ", emailContato=" + emailContato
				+ ", enderecoContato=" + enderecoContato + ", dataNascimento=" + dataNascimento + "]";
	}
}
