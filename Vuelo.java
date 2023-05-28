package org.example.Aero;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date horaVuelo;
	private Avion avion;
	private Ciudad ciudadDestino;
	private Ciudad ciudadOrigen;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	public Date getHoraVuelo() {
		return horaVuelo;
	}

	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void agregarPasajero(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}

	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}

	public void agregarPiloto(Piloto piloto) {
		pilotos.add(piloto);
	}
}
