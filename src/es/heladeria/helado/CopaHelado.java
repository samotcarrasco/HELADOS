package es.heladeria.helado;

import java.util.ArrayList;
import java.util.List;

import com.github.extras.Extra;

public class CopaHelado  implements Precieable, Descriptible, Comparable<CopaHelado> {

	final static int MAX_COMPLEMENTOS = 3;
	static IngredienteInterfaz c0 = new IngredienteBase("Chocolate");
	static IngredienteInterfaz c1 = new Complemento("Virutas de chocolate", 0.5f);
	static IngredienteInterfaz c2 = new Complemento("Galletitas", 0.8f);
	// static Ingrediente c3 = (Ingrediente)
	// ComplementoExtra.EXTRAS[0];
	static IngredienteInterfaz c3 = new Complemento(ComplementoExtra.EXTRAS[0].getDescription(),
			ComplementoExtra.EXTRAS[0].getPrice());
	static IngredienteInterfaz c4 = new Complemento(ComplementoExtra.EXTRAS[1].getDescription(),
			ComplementoExtra.EXTRAS[1].getPrice());
	static IngredienteInterfaz c5 = new Complemento(ComplementoExtra.EXTRAS[2].getDescription(),
			ComplementoExtra.EXTRAS[2].getPrice());
	static IngredienteInterfaz c6 = new Complemento(ComplementoExtra.EXTRAS[3].getDescription(),
			ComplementoExtra.EXTRAS[3].getPrice());
	static IngredienteInterfaz c7 = new Complemento(ComplementoExtra.EXTRAS[4].getDescription(),
			ComplementoExtra.EXTRAS[4].getPrice());
	static IngredienteInterfaz c8 = new Complemento(ComplementoExtra.EXTRAS[5].getDescription(),
			ComplementoExtra.EXTRAS[5].getPrice());


	public final static IngredienteInterfaz[] CONSTANTE_COMPLEMENTOS = {c1, c2, c3, c4, c5, c6, c7, c8 };
    
	public IngredienteBase ingredienteBase;
	public IngredienteInterfaz[] complementos = new Ingrediente[MAX_COMPLEMENTOS];

	public IngredienteBase getIngredienteBase() {
		return ingredienteBase;
	}

	public IngredienteInterfaz[] getComplementos() {
		return complementos;
	}

	protected void setIngredienteBase(IngredienteBase ingredienteBase) {
		this.ingredienteBase = ingredienteBase;
	}

	protected void setComplemento(IngredienteInterfaz[] complementos) {
		this.complementos = complementos;
	}

	public CopaHelado() {
		this(new IngredienteBase("Vainilla"));
	}

	public CopaHelado(IngredienteBase ingredienteBase) {
		setIngredienteBase(ingredienteBase);
		setComplemento(new IngredienteInterfaz[MAX_COMPLEMENTOS]);
	}

	
	public boolean addComplemento(IngredienteInterfaz complemento) {
		boolean isAnadido = false;
		for (int i = 0; i < MAX_COMPLEMENTOS; i++) {
			if (getComplementos()[i] == null && isAnadido == false) {
				//System.out.println("----------" + complemento.getDescripcion());
				this.complementos[i] = complemento;
				System.out.println("Añadido " + complemento.getDescripcion());
				isAnadido = true;
			}
		}
		if (isAnadido == false) {
			System.out.println("NO añadido " + complemento.getDescripcion());
		}

		return isAnadido;
	}

	public float calcularPrecioHelado() {
		float precio = 0;
		for (int i = 0; i < MAX_COMPLEMENTOS; i++) {
			if (getComplementos()[i] != null) {
				precio += getComplementos()[i].getPrecio();
			}
		}
		precio += this.ingredienteBase.getPrecio();

		return precio;
	}

	public int numeroComplementos() {
		int num = 0;
		for (int i = 0; i < MAX_COMPLEMENTOS; i++) {
			if (complementos[i] == null) {
				num++;
			}
		}
		return num;
	}
	
	
	@Override
	public String toString() {

//		System.out.println(getComplementos()[0].toString());
		String cadena = null;
		if (getComplementos()[0] == null) {
			cadena = null;
		} else if (getComplementos()[1] == null) {
			cadena = getComplementos()[0].getDescripcion();
		} else if (getComplementos()[2] == null) {
			cadena = getComplementos()[0].getDescripcion() + " y " + getComplementos()[1].getDescripcion();
		} else
			cadena = getComplementos()[0].getDescripcion() + ", " + getComplementos()[1].getDescripcion() + " y "
					+ getComplementos()[2].getDescripcion();


		return "Copa de helado de " + getIngredienteBase().getSabor() + " con " + cadena;
	}

	@Override
	public int compareTo(CopaHelado o) {
		return -Float.compare(this.getPrecio(), o.getPrecio());
	
	}

	@Override
	public float getPrecio() {
		float precio = 0;
		for (int i = 0; i < MAX_COMPLEMENTOS; i++) {
			if (getComplementos()[i] != null) {
				precio += getComplementos()[i].getPrecio();
			}
		}
		precio += this.ingredienteBase.getPrecio();
		return precio;
	}

	@Override
	public String getDescripcion() {
		return this.toString();
	}

}
