package pe.edu.galaxy.training.java.jd0.beans;

public class Proveedor {

	// Atributos
	private Integer codigo;
	private String 	razonSocial;
	private String 	ruc;

	// Métodos

	// Constructores
	public Proveedor() {

	}

	public Proveedor(Integer codigo, String razonSocial, String ruc) {
		super();
		this.codigo = codigo;
		this.razonSocial = razonSocial;
		this.ruc = ruc;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	@Override
	public String toString() {
		return "Provedor [codigo=" + codigo + ", razonSocial=" + razonSocial + ", ruc=" + ruc + "]";
	}
	
	
}
