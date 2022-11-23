package es.heladeria.helado;

public class IngredienteBase extends Ingrediente{
	
	public static final float PRECIO_DEFECTO = 2f;
	private String sabor;

	public  String getSabor() {
		return sabor;
	}

	protected void setSabor(String sabor) {
		this.sabor = sabor;
	}

	protected void setPrecio(float precio) {
		this.precio = precio;
	}

	public IngredienteBase() {
		this("Vainilla");
	}

	public IngredienteBase(String sabor) {
		super("Bola de " + sabor, PRECIO_DEFECTO);
		setSabor(sabor);
	}

	@Override
	public boolean sirveComoBase() {
		return true;
	}
	
	@Override
	public String toString() {
		return "Bola de " + getSabor();
	}
	
}
