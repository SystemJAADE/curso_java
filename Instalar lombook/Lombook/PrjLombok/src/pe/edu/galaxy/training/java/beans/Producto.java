package pe.edu.galaxy.training.java.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {

	private Long codigo; // null
	private String nombre;
	private Double precio;
	private Integer stock;
	private boolean activo;
	
	
	
}
