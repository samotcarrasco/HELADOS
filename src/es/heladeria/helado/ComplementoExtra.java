package es.heladeria.helado;

import com.github.extras.Extra;

public class ComplementoExtra extends Extra implements IngredienteInterfaz{

//	 public static final Extra[] EXTRAS = new ComplementoExtra[] {
//             new ComplementoExtra("Lemon", .2f),
//             new ComplementoExtra("Caramel", .3f),
//             new ComplementoExtra("Mango", .4f),
//             new ComplementoExtra("Chocolate", .5f),
//             new ComplementoExtra("Raspberry", .6f),
//             new ComplementoExtra("Strawberry", .7f)
//         };
	 
	 
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

}
