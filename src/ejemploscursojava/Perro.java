package ejemploscursojava;

public class Perro implements Mascota, Guardian {

	public void serAmistoso() {
		System.out.println("Mover el rabo");
	}

	public void jugar() {
		System.out.println("Tirarme la pelota");

	}

	public void darAlerta() {
		System.out.println("Guau!! Guau!!");
	}

	public void echar() {
		System.out.println("Grrrr");
	}

	public void pasear() throws KKException {
		serAmistoso();
		if (Math.random() < 0.1) {
			throw new KKException();

		}
	}
}
