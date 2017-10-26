/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava;

/**
 *
 * @author japar
 */
public class Alumno {

	private String nombre;
	private String nota;
	protected int chuleria;

	public Alumno(String nombre, String nota, int chuleria) {
		this.nombre = nombre;
		this.nota = nota;
		this.chuleria = chuleria;
	}

	public void fardar() {
		System.out.println("Mi nota es:" + nota);
	}

	public static void main(String[] args) {
		// TODO code application logic here
	}

}
