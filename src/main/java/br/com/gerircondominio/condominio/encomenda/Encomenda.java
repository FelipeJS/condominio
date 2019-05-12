package br.com.gerircondominio.condominio.encomenda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;
import br.com.gerircondominio.condominio.morador.Morador;

/**
 * @author Felipe Campos
 * 
 *         Classe que representa uma encomenda pra algum morador.
 *
 */
@Entity
@Table(name = "encomenda")
public class Encomenda extends EntidadeBase {

	@ManyToOne
	@JoinColumn(name = "id_morador", nullable = false)
	private Morador morador;

	@Column(name = "remetente", nullable = false, length = 200)
	private String remetente;

	@Column(name = "detalhes", length = 500)
	private String detalhes;

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
}