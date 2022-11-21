package es.heladeria.helado;

public class Ingrediente implements IngredienteInterfaz{
	
	protected String descripcion;
	protected float precio;
	
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public float getPrecio() {
		return precio;
	}
	
	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	protected void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
//
	public Ingrediente(String descripcion, float precio) {
		setDescripcion(descripcion);
		setPrecio(precio);
	}

	@Override
	public String toString() {
		return "Descripción: " + descripcion + ", Precio: " + precio + " €";
	}

	
}
