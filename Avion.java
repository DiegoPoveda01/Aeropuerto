package org.example.Aero;

import java.util.ArrayList;
import java.util.List;

public class Avion {
	private String nombre;
	private int año;
	private double kmRecorridos;
	public Aeropuerto aviones;
	public ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}
	public void agregarVuelo(Vuelo vuelo) {
		vuelos.add(vuelo);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}
}