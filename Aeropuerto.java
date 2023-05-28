package org.example.Aero;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aeropuerto {

	public ArrayList<Avion> aeropuerto = new ArrayList<Avion>();

	public Avion agregarAvion(String nombre, int año) {
		Avion avion = new Avion();
		avion.setNombre(nombre);
		avion.setAño(año);
		aeropuerto.add(avion);
		return avion;
	}



	public void visualizarAviones() {
		System.out.println("Aviones en el aeropuerto:");
		for (Avion avion : aeropuerto) {
			System.out.println(avion.getNombre() + " - Año: " + avion.getAño());
		}
	}



	public List<Avion> getAviones() {
		return aeropuerto;
	}


	public List<Pasajero> buscarPasajerosFecha(Date fecha) {
		List<Pasajero> pasajerosEnFecha = new ArrayList<>();

		for (Avion avion : aeropuerto) {
			List<Vuelo> vuelosAvion = avion.getVuelos();
			for (Vuelo vuelo : vuelosAvion) {
				if (vuelo.getHoraVuelo().equals(fecha)) {
					List<Pasajero> pasajerosVuelo = vuelo.getPasajeros();
					pasajerosEnFecha.addAll(pasajerosVuelo);
				}
			}
		}
		return pasajerosEnFecha;
	}





	public List<Pasajero> buscarPasajerosVuelo(Vuelo vuelo) {
		List<Pasajero> pasajerosEnVuelo = new ArrayList<>();

		for (Avion avion : aeropuerto) {
			List<Vuelo> vuelosAvion = avion.getVuelos();
			for (Vuelo vueloAvion : vuelosAvion) {
				if (vueloAvion.equals(vuelo)) {
					List<Pasajero> pasajerosVuelo = vueloAvion.getPasajeros();
					pasajerosEnVuelo.addAll(pasajerosVuelo);
				}
			}
		}
		return pasajerosEnVuelo;
	}


	public List<Pasajero> buscarPasajerosCovid() {
		List<Pasajero> pasajerosCovid = new ArrayList<>();

		for (Avion avion : aeropuerto) {
			for (Vuelo vuelo : avion.getVuelos()) {
				for (Pasajero pasajero : vuelo.getPasajeros()) {
					if (pasajero.getPasaporteSanitario() != null && pasajero.getPasaporteSanitario().getResultadoPCR()) {
						pasajerosCovid.add(pasajero);
					}
				}
			}
		}

		return pasajerosCovid;
	}







}