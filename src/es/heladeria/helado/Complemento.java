package es.heladeria.helado;

public class Complemento extends Ingrediente{
	
	public Complemento(String descripcion, float precio) {
		super(descripcion,precio);
	}

	@Override
	public String toString() {
		return "Complemento [descripcion=" + descripcion + ", precio=" + precio + ", getDescripcion()="
				+ getDescripcion() + ", getPrecio()=" + getPrecio();
	}

	@Override
	public boolean sirveComoBase() {
		return false;
	}
	
	
}
