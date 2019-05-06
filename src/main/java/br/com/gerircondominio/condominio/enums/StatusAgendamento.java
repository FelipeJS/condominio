package br.com.gerircondominio.condominio.enums;

public enum StatusAgendamento {
	SOLICITADO(1), CONFIRMADO(2), CANCELADO(3);

	private Integer statusAgendamento;

	private StatusAgendamento(Integer statusAgendamento) {
		this.statusAgendamento = statusAgendamento;
	}

	public Integer getStatusAgendamento() {
		return statusAgendamento;
	}
}