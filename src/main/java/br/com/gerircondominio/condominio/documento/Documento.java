package br.com.gerircondominio.condominio.documento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;
import br.com.gerircondominio.condominio.tipodocumento.TipoDocumento;

/**
 * @author Felipe Campos
 * 
 *         Classe que representa os documentos que circularao pelo condominio
 *
 */
@Entity
@Table(name = "documento")
public class Documento extends EntidadeBase {

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "id_tipo_documento", nullable = false)
	private TipoDocumento tipoDocumento;

	@Lob
	private byte[] arquivo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public byte[] getArquivo() {
		return arquivo;
	}

	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}
}