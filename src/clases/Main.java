package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private List<Aeropuerto> nuevosAeropuertos = new ArrayList<Aeropuerto>();
	
	public static void CargarNuevoAeropuerto() {
		
		List<Asiento> asientoAvion1 = new ArrayList<Asiento>();
		List<Asiento> asientoAvion2 = new ArrayList<Asiento>();
		List<Asiento> asientoAvion3 = new ArrayList<Asiento>();
		List<Asiento> asientoAvion4 = new ArrayList<Asiento>();
		List<Piloto> piloto2443 = new ArrayList<Piloto>();
		List<Asignacion> pasajeros2443 = new ArrayList<Asignacion>();
		
		//CARGA DE DATOS PARA PRUEBA
			//CARGA DE LAS CIUDADES
		Ciudad ciudad1 = new Ciudad(1,"La Rioja","5360");
		Ciudad ciudad2 = new Ciudad(2,"Buenos Aires","1000");
		Ciudad ciudad3 = new Ciudad(3,"Mendoza","5500");
		Ciudad ciudad4 = new Ciudad(4,"Tucumán","4000");
			//CARGA DE LOS AEROPUERTOS
		Aeropuerto aeropuerto1 = new Aeropuerto(1,"Aeropuerto Capitán Vicente Almandos Amonacid",ciudad1,"IRJ");
		Aeropuerto aeropuerto2 = new Aeropuerto(2,"Aeropuerto Buenos Aires Jorge Newbery",ciudad2,"AEP");
		Aeropuerto aeropuerto3 = new Aeropuerto(2,"Aeropuerto El Plumerillo",ciudad3,"MDZ");
		Aeropuerto aeropuerto4 = new Aeropuerto(2,"Aeropuerto Benjamín Matienzo",ciudad4,"TUC");
			//CARGA DE LOS PASAJEROS
		Pasajero pasajero1 = new Pasajero(1,"20123456784","Ramírez","Ramiro Ramón","12345678");
		Pasajero pasajero2 = new Pasajero(2,"20102030404","Fernández","Fernando Fermín","10203040");
		Pasajero pasajero3 = new Pasajero(3,"20987654324","Martínez","Martín Marcos","98765432");
		Pasajero pasajero4 = new Pasajero(4,"20198273644","Rodríguez","Rodrigo Rogelio","19827364");
			//ASIGNACION DE LOS PASAJEROS
		Asignacion asignacion1 = new Asignacion(pasajero1,asientoAvion4.get(43),"AR2443100420182012345678443");
		Asignacion asignacion2 = new Asignacion(pasajero4,asientoAvion4.get(41),"AR2443100420182019827364441");
			//CARGA DE LAS ASIGNACIONES
		pasajeros2443.add(asignacion1);
		pasajeros2443.add(asignacion2);
			//CARGA DE LAS AEROLINEAS
		Aerolinea aerolinea1 = new Aerolinea(1,"Aerolíneas Argentinas");
		Aerolinea aerolinea2 = new Aerolinea(2,"Austral");
		Aerolinea aerolinea3 = new Aerolinea(3,"LATAM");
		Aerolinea aerolinea4 = new Aerolinea(4,"Iberia");
			//CARGA DE LOS PILOTOS
		Piloto piloto1 = new Piloto(1,"Pérez","Juan Antonio","07071970",LocalDate.of(1970, 7, 7));
		Piloto piloto2 = new Piloto(2,"Martínez","Juan Ignacio","08081978",LocalDate.of(1950, 8, 8));
		Piloto piloto3 = new Piloto(3,"López","Juan Carlos","05051950",LocalDate.of(1950, 5, 5));
		Piloto piloto4 = new Piloto(4,"Gómez","Juan Gabriel","10101960", LocalDate.of(1960, 10, 10));
			//ASIGANCION DE PILOTOS A LISTA
		piloto2443.add(piloto1);
		piloto2443.add(piloto2);
			//CARGA DE ASIENTOS
		Asiento asiento1 = new Asiento(1,"A1");
		Asiento asiento2 = new Asiento(2,"B1");
		Asiento asiento3 = new Asiento(3,"C1");
		Asiento asiento4 = new Asiento(4,"H1");
		Asiento asiento5 = new Asiento(5,"J1");
		Asiento asiento6 = new Asiento(6,"K1");
		Asiento asiento7 = new Asiento(7,"A2");
		Asiento asiento8 = new Asiento(8,"B2");
		Asiento asiento9 = new Asiento(9,"C2");
		Asiento asiento10 = new Asiento(10,"H2");
		Asiento asiento11 = new Asiento(11,"J2");
		Asiento asiento12 = new Asiento(12,"K2");
		Asiento asiento13 = new Asiento(13,"A1");
		Asiento asiento14 = new Asiento(14,"B1");
		Asiento asiento15 = new Asiento(15,"C1");
		Asiento asiento16 = new Asiento(16,"H1");
		Asiento asiento17 = new Asiento(17,"J1");
		Asiento asiento18 = new Asiento(18,"K1");
		Asiento asiento19 = new Asiento(19,"A2");
		Asiento asiento20 = new Asiento(20,"B2");
		Asiento asiento21 = new Asiento(21,"C2");
		Asiento asiento22 = new Asiento(22,"H2");
		Asiento asiento23 = new Asiento(23,"J2");
		Asiento asiento24 = new Asiento(24,"K2");
		Asiento asiento25 = new Asiento(25,"A1");
		Asiento asiento26 = new Asiento(26,"C1");
		Asiento asiento27 = new Asiento(27,"D1");
		Asiento asiento28 = new Asiento(28,"E1");
		Asiento asiento29 = new Asiento(29,"G1");
		Asiento asiento30 = new Asiento(30,"H1");
		Asiento asiento31 = new Asiento(31,"K1");
		Asiento asiento32 = new Asiento(32,"A2");
		Asiento asiento33 = new Asiento(33,"C2");
		Asiento asiento34 = new Asiento(34,"D2");
		Asiento asiento35 = new Asiento(35,"E2");
		Asiento asiento36 = new Asiento(36,"G2");
		Asiento asiento37 = new Asiento(37,"H2");
		Asiento asiento38 = new Asiento(38,"K2");
		Asiento asiento39 = new Asiento(39,"A1");
		Asiento asiento40 = new Asiento(40,"H1");
		Asiento asiento41 = new Asiento(41,"K1");
		Asiento asiento42 = new Asiento(42,"A2");
		Asiento asiento43 = new Asiento(43,"H2");
		Asiento asiento44 = new Asiento(44,"K2");
			//CARGA DE LISTAS CON ASIENTOS POR AVION
			//AVION 1
		asientoAvion1.add(1, asiento1);
		asientoAvion1.add(2, asiento2);
		asientoAvion1.add(3, asiento3);
		asientoAvion1.add(4, asiento4);
		asientoAvion1.add(5, asiento5);
		asientoAvion1.add(6, asiento6);
		asientoAvion1.add(7, asiento7);
		asientoAvion1.add(8, asiento8);
		asientoAvion1.add(9, asiento9);
		asientoAvion1.add(10, asiento10);
		asientoAvion1.add(11, asiento11);
		asientoAvion1.add(12, asiento12);
			//AVION 2
		asientoAvion2.add(13, asiento13);
		asientoAvion2.add(14, asiento14);
		asientoAvion2.add(15, asiento15);
		asientoAvion2.add(16, asiento16);
		asientoAvion2.add(17, asiento17);
		asientoAvion2.add(18, asiento18);
		asientoAvion2.add(19, asiento19);
		asientoAvion2.add(20, asiento20);
		asientoAvion2.add(21, asiento21);
		asientoAvion2.add(22, asiento22);
		asientoAvion2.add(23, asiento23);
		asientoAvion2.add(24, asiento24);
			//AVION 3
		asientoAvion3.add(25, asiento25);
		asientoAvion3.add(26, asiento26);
		asientoAvion3.add(27, asiento27);
		asientoAvion3.add(28, asiento28);
		asientoAvion3.add(29, asiento29);
		asientoAvion3.add(30, asiento30);
		asientoAvion3.add(31, asiento31);
		asientoAvion3.add(32, asiento32);
		asientoAvion3.add(33, asiento33);
		asientoAvion3.add(34, asiento34);
		asientoAvion3.add(35, asiento35);
		asientoAvion3.add(36, asiento36);
		asientoAvion3.add(37, asiento37);
		asientoAvion3.add(38, asiento38);
			//AVION 4
		asientoAvion4.add(39, asiento39);
		asientoAvion4.add(40, asiento40);
		asientoAvion4.add(41, asiento41);
		asientoAvion4.add(42, asiento42);
		asientoAvion4.add(43, asiento43);
		asientoAvion4.add(44, asiento44);
		
				
			//CARGA DE AVIONES
		Avion avion1 = new Avion(1,"Airbus A340-313X","LV-FPV",asientoAvion1);
		Avion avion2 = new Avion(2,"Airbus A330-223","LV-FNI",asientoAvion2);
		Avion avion3 = new Avion(3,"Boeing 737-8MB","LV-FYK",asientoAvion3);
		Avion avion4 = new Avion(4,"Embraer ERJ-190-100AR","LV-CIH",asientoAvion4);
		
			//CARGA DE VUELOS
		Vuelo vuelo1 = new Vuelo("AR2443",aeropuerto1,LocalDateTime.of(2018, 04, 10, 21, 10),aeropuerto2,LocalDateTime.of(2018, 04, 10, 22, 45),aerolinea2,piloto2443,avion4,pasajeros2443);
			
	}

	private static LocalDate LocalDate(int i, Class<Months> class1, int j) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

}
