package br.com.gerircondominio.condominio.apartamento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.condominio.Condominio;
import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;

/**
 * @author Felipe F. Campos
 * 
 *         A classe {@Apartamento} representa o cadastro dos apartamentos
 *         existentes em um condominio, quantidade de quartos, suites, comodos,
 *         se ta mobilhado, quem e o dono.
 *
 */
@Entity
@Table(name = "apartamento")
public class Apartamento extends EntidadeBase {

	@Column(name = "numero_apartamento", nullable = false, length = 50)
	private String numeroApartamento;

	@Column(name = "descricao", length = 300)
	private String descricao;

	@Column(name = "quantidade_quartos", nullable = false)
	private Integer quantidadeQuartos;

	@Column(name = "quantidade_vagas", nullable = false)
	private Integer quantidadeVagas;

	@ManyToOne
	@JoinColumn(name = "id_condominio")
	private Condominio condominio;

	public String getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(String numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(Integer quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public Integer getQuantidadeVagas() {
		return quantidadeVagas;
	}

	public void setQuantidadeVagas(Integer quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}
}