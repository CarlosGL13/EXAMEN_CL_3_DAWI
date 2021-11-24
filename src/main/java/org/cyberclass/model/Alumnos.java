package org.cyberclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "tb_alumnos")
public class Alumnos {

	@Id
	@Column(name="codalumno")
	private int codigo;
	
	@Column(name="nombrealumno")
	private String nombre;

	@Column(name="apellalumno")
	private String apellido;
	
	@Column(name="edadalumno")
	private String edad;
	
	@Column(name="telefonoalumno")
	private String telefono;

	@Override
	public String toString() {
		return "Alumnos [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", telefono=" + telefono + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
