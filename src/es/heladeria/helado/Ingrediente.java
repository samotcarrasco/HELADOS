package es.heladeria.helado;

public abstract class Ingrediente implements IngredienteInterfaz {

	private String descripcion;
	protected float precio;


	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected void setPrecio(float precio) {
		this.precio = precio;
	}

	public Ingrediente(String descripcion, float precio) {
		setDescripcion(descripcion);
		setPrecio(precio);
	}


	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public float getPrecio() {
		return this.precio;
	}
	
	@Override
	public boolean sirveComoBase() {
		return false;
	}
	
		
	
	@Override
	public String toString() {
		return getDescripcion();
	}

}
