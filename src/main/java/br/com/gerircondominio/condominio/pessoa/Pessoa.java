package br.com.gerircondominio.condominio.pessoa;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;

/**
 * @author Felipe F. Campos
 * 
 *         A classe abstrata {@Pessoa} vai ser utilizada como classe generica
 *         para criacao de clientes, funcionarios, moradores etc.
 *
 */
@MappedSuperclass
public abstract class Pessoa extends EntidadeBase {

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "cpf", nullable = false, length = 14)
	private String cpf;

	@Column(name = "telefone", nullable = false, length = 12)
	private String telefone;

	@Column(name = "email", nullable = false, length = 100)
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}