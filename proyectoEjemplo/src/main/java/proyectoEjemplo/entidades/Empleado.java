package proyectoEjemplo.entidades;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "empleado")
@Table(name = "Empleado")
public class Empleado implements Serializable {
	

	/**
	 * Se utiliza el Serializable si en alg�n momento se desea
	 * transmitir la entidad, por ejemplo a travpes de un servicio 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "COD_EMPLEADO")
	private long codigo;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "FECHA_NACIMIENTO")
	private LocalDate fechaNacimiento;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_DIRECCION")
	private Direccion direccion;
	
	public Empleado() {}
	
	

	public Empleado(long codigo, String apellidos, String nombre, LocalDate fechaNacimiento, Direccion direccion) {
		super();
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
	}



	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellidos=" + apellidos + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + "]";
	}

	
}
