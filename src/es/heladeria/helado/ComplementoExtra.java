package es.heladeria.helado;

import com.github.extras.Extra;

public class ComplementoExtra extends Extra implements IngredienteInterfaz {

	public ComplementoExtra(String description, float price) {
		super(description, price);
	}

	@Override
	public String getDescripcion() {
		return super.getDescription();
	}

	@Override
	public float getPrecio() {
		return super.getPrice();
	}

	@Override
	public boolean sirveComoBase() {
		return false;
	}

}
