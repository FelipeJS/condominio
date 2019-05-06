package br.com.gerircondominio.condominio.enums;

public enum StatusArea {
	LIBERADO(1), INTERDITADO(2);

	private Integer statusArea;

	private StatusArea(Integer statusArea) {
		this.statusArea = statusArea;
	}

	public Integer getStatusArea() {
		return statusArea;
	}
}