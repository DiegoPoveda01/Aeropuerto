package org.example.Aero;

import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializar();
    }

    public void inicializar() {
        // Crear aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto();

        // Agregar aviones
        Avion avion1 = aeropuerto.agregarAvion("Avión 1", 2020);
        Avion avion2 = aeropuerto.agregarAvion("Avión 2", 2018);

        // Agregar pasajeros
        Pasajero pasajero1 = new Pasajero();
        pasajero1.setNombre("Juan Alberto");
        pasajero1.setRut("16342018-k");
        PasaporteSanitario pasaporte1 = new PasaporteSanitario();
        pasaporte1.setResultadoPCR(true);
        pasajero1.setPasaporteSanitario(pasaporte1);

        Pasajero pasajero2 = new Pasajero();
        pasajero2.setNombre("Roxana Ximena");
        pasajero2.setRut("12517536-8");
        PasaporteSanitario pasaporte2 = new PasaporteSanitario();
        pasaporte2.setResultadoPCR(false);
        pasajero2.setPasaporteSanitario(pasaporte2);

        // Crear vuelos y agregar pasajeros
        Vuelo vuelo1 = new Vuelo();
        vuelo1.setHoraVuelo(new Date());
        vuelo1.setAvion(avion1);
        vuelo1.agregarPasajero(pasajero1);

        Vuelo vuelo2 = new Vuelo();
        vuelo2.setHoraVuelo(new Date());
        vuelo2.setAvion(avion2);
        vuelo2.agregarPasajero(pasajero2);

        // Agregar vuelos a los aviones
        avion1.agregarVuelo(vuelo1);
        avion2.agregarVuelo(vuelo2);

        // Visualizar aviones
        aeropuerto.visualizarAviones();

        // Buscar pasajeros con resultado de COVID-19 positivo
        System.out.println("Pasajeros con resultado de COVID-19 positivo:");
        List<Pasajero> pasajerosCovid = aeropuerto.buscarPasajerosCovid();
        for (Pasajero pasajero : pasajerosCovid) {
            System.out.println("Nombre: " + pasajero.getNombre());
            System.out.println("RUT: " + pasajero.getRut());
        }
    }
}
