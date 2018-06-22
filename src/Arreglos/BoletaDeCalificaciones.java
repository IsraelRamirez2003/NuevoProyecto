package Arreglos;

import java.util.Random;
import java.util.Scanner;

public class BoletaDeCalificaciones {
	
	
	/**
	 * Atributos
	 */
	private String[] materias;
	private int[][] calificacionesDeExamenes;
	private double[] promedios;
	private double promedioGeneral;
	private int numMaterias;
	private int numExamenes;
	private Scanner s;
	
	
	/**
	 * Constructor
	 */
	public BoletaDeCalificaciones(int numMaterias , int numExamenes) {
		setNumMaterias(numMaterias);
		setNumExamenes(numExamenes);
		this.materias = new String [numMaterias];
		this.calificacionesDeExamenes = new int [numMaterias] [numExamenes];
		this.promedios = new double[numMaterias];
		this.promedioGeneral = 0;
		setMaterias();
		setCalificacionesDeExamenes();
	}

	
	
	/**
	 * Getters & Setters
	 */
	protected String[] getMaterias() {
		return materias;
	}
	
	protected int[][] getCalificacionesDeExamenes() {
		return calificacionesDeExamenes;
	}

	protected double getPromedioGeneral() {
		return promedioGeneral;
	}

	protected void setMaterias() {
		for(int i = 0; i < getNumMaterias(); i++){
			System.out.print("ingrese el nombre de la materia " + (i+1) + ": ");
			materias[i] = s.nextLine();
			System.out.println("");
		};
	}
	
	protected void setCalificacionesDeExamenes() {
		int materia, examen;

		System.out.println("Ingrese las calificaciones por mareria\n");
		for(materia = 0; materia < getNumMaterias(); materia++){
			System.out.println("********************************************************"
					+ "**********************************\nMateria: " + materias[materia]);
			for(examen = 0; examen < getNumExamenes(); examen++){
				System.out.print("Examen " + (examen + 1) + "= ");
				calificacionesDeExamenes[materia][examen] = s.nextInt();
			}	
		}
	}

	protected void setPromedioGeneral(double promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}
	
	protected double[] getPromedios() {
		return promedios;
	}

	protected int getNumMaterias() {
		return numMaterias;
	}

	protected int getNumExamenes() {
		return numExamenes;
	}

	protected double setPromedios() {
		double suma = 0 , promedio = 0;
		//Hay que modificar esto
			
		for(int j = 0; j <= getNumExamenes(); j++){
			promedios[j] = s.nextInt();
		}
		for(int y = 0; y <= getNumExamenes(); y++){
			suma = suma + promedios[y];
		}
		promedio = suma/getNumExamenes();
		
		for(int x = 0; x <= materias.length; x++){
			System.out.println("El promedio de: " + materias[x] + " es: " + promedio);
			for(int i = 0; <= paraSacarPromedioGeneral.length; i++)
				paraSacarPromedioGeneral[i] = promedio;
		}
			
		}; 
		

	protected void setNumMaterias(int numMaterias) {
		this.numMaterias = numMaterias;
	}

	protected void setNumExamenes(int numExamenes) {
		this.numExamenes = numExamenes;
	}

	
	
	/**
	 * Metodos
	 */
	/**
	 * Funcion que inicializa los nombres de las materias
	 * @param = numMaterias
	 * @param = numExamenes
	 */
	public void inicializar(int i, int j){
		
	}



	
	
	
	
	
	
	
}

