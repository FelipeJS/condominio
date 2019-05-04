package br.com.gerircondominio.condominio.enums;

/**
 * @author Felipe Campos
 * 
 *         Nivel de autorizacao do usuario no sistema, o nivel 4 somos nos,
 *         donos do sitema, que temos acesso a tudo.
 *
 */
public enum Nivel {
	MORADOR(1), FUNCIONARIO(2), SINDICO(3), ADMINISTRADOR(4);

	private Integer nivel;

	private Nivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getNivel() {
		return nivel;
	}
}