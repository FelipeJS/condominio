package br.com.gerircondominio.condominio.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.enums.Nivel;
import br.com.gerircondominio.condominio.pessoa.Pessoa;

/**
 * @author Felipe Campos
 * 
 *         Tabela que represeta um usuario do sistema
 *
 */
@Entity
@Table(name = "usuario")
public class Usuario extends Pessoa {

	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "nivel", nullable = false, length = 1)
	private Nivel nivel;

	@Column(name = "ativo", nullable = false)
	private Boolean ativo;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}