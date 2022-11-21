package es.heladeria.helado;

public interface IngredienteInterfaz extends Descriptible, Precieable {

	default boolean sirveComoBase() {
		return false;
		}

}
