package main;

import jobs.JobFactory;
import jobs.JobFactoryImpl;

public class Main {
	
	public static void main(String[] args) {
		String nombre = "Cristhian";
		JobFactory factory = new JobFactoryImpl();
		String cliente = factory.create(nombre).execute();
		
		System.out.println(cliente);

	}

}
