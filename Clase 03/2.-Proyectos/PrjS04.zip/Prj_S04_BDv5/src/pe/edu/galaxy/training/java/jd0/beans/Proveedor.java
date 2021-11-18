package pe.edu.galaxy.training.java.jd0.beans;

public class Proveedor extends Generico{

	// Atributos

	private String 	razonSocial;
	private String 	ruc;

	// Métodos

	// Constructores
	public Proveedor() {
		super();
	}

	public Proveedor(Integer codigo, String razonSocial, String ruc) {
		super(codigo);
		this.razonSocial = razonSocial;
		this.ruc = ruc;
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
