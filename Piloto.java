package org.example.Aero;

import java.util.ArrayList;

public class Piloto {
	private String rut;
	private String idPiloto;
	private String nombre;
	public ArrayList<Vuelo> vuelosinscritos = new ArrayList<Vuelo>();

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getIdPiloto() {
		return this.idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}