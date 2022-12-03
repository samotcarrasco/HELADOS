package es.heladeria.helado;

public class IngredienteBase extends Ingrediente{
	
	private static final float PRECIO_DEFECTO = 2f;
	private static String sabor;

	public  String getSabor() {
		return sabor;
	}

	protected void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
//	public IngredienteBase() {
//		this("Vainilla");
//	}
	
	public IngredienteBase(String sabor) {
		super("Bola de " + sabor,PRECIO_DEFECTO);
		setSabor(sabor);
	}

	@Override
	public boolean sirveComoBase() {
		return true;
	}


	@Override
	public String toString() {
		//return "Bola de " + getSabor();
		return getSabor();
	}
	
}
