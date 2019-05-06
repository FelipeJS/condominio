package br.com.gerircondominio.condominio.cliente;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.gerircondominio.condominio.pessoa.Pessoa;

/**
 * @author Felipe Campos
 * 
 *         A classe {@Cliente} recebe o cadastro dos nossos clientes para nosso
 *         controle interno de quantos clientes temos e quanto cada uma paga de
 *         mensalidade para utilizar o nosso sistema.
 *
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {

	@Column(name = "endereco", nullable = false, length = 200)
	private String endereco;

	@Column(name = "valor_mensalidade", nullable = false)
	private BigDecimal valorMensalidade;

	@Column(name = "ativo")
	private Boolean ativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cancelamento", nullable = false)
	private Calendar dataCancelamento;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(BigDecimal valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Calendar getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Calendar dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
}