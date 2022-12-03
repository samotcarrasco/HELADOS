package es.heladeria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import es.heladeria.helado.Complemento;
import es.heladeria.helado.ComplementoExtra;
import es.heladeria.helado.CopaHelado;
import es.heladeria.helado.Descriptible;
import es.heladeria.helado.Ingrediente;
import es.heladeria.helado.IngredienteBase;
import es.heladeria.helado.IngredienteInterfaz;
import es.heladeria.helado.Precieable;

public class App {

	public static void main(String[] args) {

		CopaHelado helado = new CopaHelado();
		helado.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[0]);
		helado.addComplemento(CopaHelado.EXTRASL.get(0));
		helado.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[1]);
		helado.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[1]);

		System.out.println(helado.toString());

		System.out.println("-------------------------------------------------");
		// Ejercicio 8

		IngredienteBase base2 = new IngredienteBase("Nata");

		// creado helado con la base por defecto
		CopaHelado helado2 = new CopaHelado(base2);

		// añadimos primer complemento
		helado2.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[0]);
		helado2.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[1]);
		helado2.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[2]);
		helado2.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[2]);
		System.out.println(helado2.toString());

		System.out.println("-----------------------------------------------");

			
		IngredienteBase base3 = new IngredienteBase("Nata");
		CopaHelado helado3 = new CopaHelado(base3);
			//Complemento comple = new Complemento("Chocolate", 0);
		helado3.addComplemento(new IngredienteBase("Chocolate"));
		helado3.setIngredienteBase(base3);
		System.out.println("---------------" + helado3.getIngredienteBase().toString());
		
		helado3.addComplemento(CopaHelado.CONSTANTE_COMPLEMENTOS[3]);
		
		System.out.println(helado3.toString());

		System.out.println("-------------------------------------------------");

		List<CopaHelado> listaHelados = new ArrayList<CopaHelado>();
		listaHelados.add(helado);
		listaHelados.add(helado2);

		listaHelados.sort(null);
		System.out.println("Orden natural");
		for (CopaHelado hel : listaHelados) {
			System.out.println(hel);
		}

		System.out.println("Orden comparador");
		listaHelados.sort(new Comparator<CopaHelado>() {

			@Override
			public int compare(CopaHelado o1, CopaHelado o2) {
				int resultado = 0;
				resultado = Integer.compare(o2.numeroDeComplementos(), o1.numeroDeComplementos());
				if (resultado == 0) {
					resultado = o1.compareTo(o2);
				}
				return 0;
			}
		});

		for (CopaHelado hel : listaHelados) {
			System.out.println(hel);
		}

		System.out.println("-------------------------------------------------");

		imprimirCuenta(Arrays.asList(helado3, base3));

		
		IngredienteInterfaz comple = new IngredienteBase("Chocolate");
		IngredienteInterfaz comple2 = new Complemento("Chocolate",4);
		
		List<IngredienteInterfaz> listaComplementos = new ArrayList<>();
		listaComplementos.add(comple);
		listaComplementos.add(comple2);

		imprimirCuenta(listaComplementos);

	}

	private static <T extends Descriptible & Precieable> void imprimirCuenta(Collection<T> productos) {

		double sumaTotal = 0;

		System.out.println("--- Resumen de cuenta ---");

		for (T t : productos) {
			System.out.println(t.getDescripcion() + ": " + String.format("%.2f", t.getPrecio()) + "€");
			sumaTotal += t.getPrecio();
		}

		System.out.println("Total " + productos.size() + " productos: " + String.format("%.2f", sumaTotal) + "€");

	}

}
