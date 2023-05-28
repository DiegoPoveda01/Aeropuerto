package org.example.Aero;

public class Pasajero {
	private String nombre;
	private String rut;
	public PasaporteSanitario pasaporteSanitario;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public PasaporteSanitario getPasaporteSanitario() {
		return this.pasaporteSanitario;
	}
	public void setPasaporteSanitario(PasaporteSanitario pasaporteSanitario) {
		this.pasaporteSanitario = pasaporteSanitario;
	}
}