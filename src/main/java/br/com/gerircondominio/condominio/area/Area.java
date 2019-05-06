package br.com.gerircondominio.condominio.area;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.condominio.Condominio;
import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;
import br.com.gerircondominio.condominio.enums.StatusArea;

/**
 * @author Felipe Campos
 * 
 *         Cadastro das areas existentes no condominio que pode ser agendadas
 *         pelos moradores
 *
 */
@Entity
@Table(name = "area")
public class Area extends EntidadeBase {

	@Column(name = "nome", nullable = false, length = 50)
	private String nome;

	@Column(name = "descricao", nullable = false, length = 255)
	private String descricao;

	@Column(name = "status", nullable = false, length = 30)
	private StatusArea status;

	@ManyToOne
	@JoinColumn(name = "id_condominio")
	private Condominio condominio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusArea getStatus() {
		return status;
	}

	public void setStatus(StatusArea status) {
		this.status = status;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}
}