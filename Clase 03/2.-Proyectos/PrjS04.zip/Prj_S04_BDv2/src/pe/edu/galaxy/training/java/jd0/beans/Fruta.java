package pe.edu.galaxy.training.java.jd0.beans;

public class Fruta {

	// Atributos
	private Integer codigo;
	private String nombre;
	private Double precio;
	private Integer cantidad;

	// Métodos

	// Constructores
	public Fruta() {

	}
	
	public Fruta(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}


	// Getters/Setters

	public Fruta(Integer codigo, String nombre, Double precio, Integer cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	// toString
	
	@Override
	public String toString() {
		return "Fruta [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad +  ", total=" + getTotal() +"]";
	}

	// Metodos operacionales
	
	public Double getTotal() {
		
		return cantidad*precio;
	}
	
}
