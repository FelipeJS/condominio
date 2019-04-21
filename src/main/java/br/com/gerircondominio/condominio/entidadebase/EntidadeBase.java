package br.com.gerircondominio.condominio.entidadebase;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Felipe F. Campos
 * 
 *         A classe abstrata {@EntidadeBase} vai ter a primary para todas as
 *         classes que serao salvas no banco de dados, todas as classes tem que
 *         implementar ela.
 *
 */
@MappedSuperclass
public abstract class EntidadeBase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}