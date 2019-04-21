package br.com.gerircondominio.condominio.morador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.apartamento.Apartamento;
import br.com.gerircondominio.condominio.pessoa.Pessoa;

/**
 * @author Felipe F. Campos
 * 
 *         A classe {@Morador} representa um morador de um condominio, com base
 *         no condominio que ele mora, ele tera acesso aos beneficios que o
 *         condominio oferece.
 *
 */
@Entity
@Table(name = "morador")
public class Morador extends Pessoa {

	@Column(name = "rg", nullable = false, length = 30)
	private String rg;

	@Column(name = "tipo_pessoa", nullable = false, length = 50)
	private String tipoPessoa;

	@ManyToOne
	@JoinColumn(name = "id_apartamento")
	private Apartamento apartamento;

	@Lob
	private byte[] data;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}