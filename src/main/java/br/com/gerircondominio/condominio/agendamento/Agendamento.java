package br.com.gerircondominio.condominio.agendamento;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.gerircondominio.condominio.area.Area;
import br.com.gerircondominio.condominio.entidadebase.EntidadeBase;
import br.com.gerircondominio.condominio.enums.StatusAgendamento;
import br.com.gerircondominio.condominio.morador.Morador;

/**
 * @author Felipe Campos
 * 
 *         Classe que represeta um agendamento de area de um condominio
 *
 */
@Entity
@Table(name = "agendamento")
public class Agendamento extends EntidadeBase {

	@ManyToOne
	@JoinColumn(name = "id_area", nullable = false)
	private Area area;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_inicio", nullable = false)
	private Calendar dhInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_fim", nullable = false)
	private Calendar dhFim;

	@ManyToOne
	@JoinColumn(name = "id_morador", nullable = false)
	private Morador morador;

	@Column(name = "observacao", length = 255)
	private String observacao;

	@Column(name = "status", nullable = false)
	private StatusAgendamento status;

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Calendar getDhInicio() {
		return dhInicio;
	}

	public void setDhInicio(Calendar dhInicio) {
		this.dhInicio = dhInicio;
	}

	public Calendar getDhFim() {
		return dhFim;
	}

	public void setDhFim(Calendar dhFim) {
		this.dhFim = dhFim;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public StatusAgendamento getStatus() {
		return status;
	}

	public void setStatus(StatusAgendamento status) {
		this.status = status;
	}
}