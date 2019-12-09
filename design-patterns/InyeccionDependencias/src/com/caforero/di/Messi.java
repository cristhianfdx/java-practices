package com.caforero.di;

public class Messi {
	
	private IEquipo equipo;
	
	public Messi(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	public void mostrarEquipo() {
		equipo.mostrar();
	}

}
