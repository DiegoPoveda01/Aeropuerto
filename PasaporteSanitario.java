package org.example.Aero;

import java.util.Date;

public class PasaporteSanitario {
	private String idPasaporte;
	private Date fechaPasaporte;
	private boolean resultadoPCR;
	private Date fechaResultado;

	public String getIdPasaporte() {
		return this.idPasaporte;
	}

	public void setIdPasaporte(String idPasaporte) {
		this.idPasaporte = idPasaporte;
	}

	public Date getFechaPasaporte() {
		return this.fechaPasaporte;
	}

	public void setFechaPasaporte(Date fechaPasaporte) {
		this.fechaPasaporte = fechaPasaporte;
	}

	public boolean getResultadoPCR() {
		return this.resultadoPCR;
	}

	public void setResultadoPCR(boolean resultadoPCR) {
		this.resultadoPCR = resultadoPCR;
	}

	public Date getFechaResultado() {
		return this.fechaResultado;
	}

	public void setFechaResultado(Date fechaResultado) {
		this.fechaResultado = fechaResultado;
	}

}