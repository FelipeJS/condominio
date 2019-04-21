package br.com.gerircondominio.condominio.condominio;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.gerircondominio.condominio.cliente.Cliente;
import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;

/**
 * @author Felipe F. Campos
 * 
 *         A classe {@Condominio} representa o cadastro de todos os condominios,
 *         cada cliente pode cadastrar um ou varios condominios, cada condominio
 *         que ele cadastrar vai ser incluso na mensalidade que ele paga.
 */
@Entity
@Table(name = "condominio")
public class Condominio extends EntidadeBase {

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "endereco", nullable = false, length = 200)
	private String endereco;

	@Column(name = "telefone", nullable = false, length = 12)
	private String telefone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro", nullable = false)
	private Calendar dataCadastro;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}