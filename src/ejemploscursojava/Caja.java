package ejemploscursojava;

public class Caja<T> {
	T elemento;

	public T get() {
		return elemento;
	}

	public void set(T nuevo) {
		elemento = nuevo;
	}

}
