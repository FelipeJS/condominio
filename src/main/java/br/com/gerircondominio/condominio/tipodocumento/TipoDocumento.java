package br.com.gerircondominio.condominio.tipodocumento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;

/**
 * @author Felipe Campos
 * 
 *         Classe que representa os tipos de documentos que podem ser
 *         registrados na tabela de documentos
 *
 */
@Entity
@Table(name = "tipo_documento")
public class TipoDocumento extends EntidadeBase {

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}