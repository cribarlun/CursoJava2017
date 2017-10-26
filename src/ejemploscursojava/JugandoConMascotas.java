package ejemploscursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JugandoConMascotas {

	// public static void main(String[] args) {
	// // Path path = Paths.get(".");
	// // System.out.println(path.toAbsolutePath());// la ruta entera donde se
	// ejecuta
	//
	//
	// Path path = Paths.get("C:\\Users\\TIC\\Desktop\\hola.txt");
	// Charset charset = Charset.forName("UTF-8");
	// String line = null;
	// try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
	// line = reader.readLine();
	// while (line != null) {
	// System.out.println(line);
	// line = reader.readLine();
	// }
	// } catch (IOException x) {
	// System.err.format("IOException: %s%n", x);
	// }
	//
	// }

	// -------------------------------------------------------------------------------

	// public static void main(String[] args) {
	//
	// Path path = Paths.get("C:\\Users\\TIC\\Desktop\\hola.txt");
	// Path copia = Paths.get("C:\\Users\\TIC\\Desktop\\copiaDeHola.txt");
	// Charset charset = Charset.forName("UTF-8");
	// String line = null;
	// try (BufferedReader reader = Files.newBufferedReader(path);
	// PrintWriter writer = new PrintWriter(Files.newBufferedWriter(copia))) {
	//
	// while (line != null) {
	// System.out.println(line);
	// line = reader.readLine();
	// }
	// } catch (IOException x) {
	// System.out.println("Error al leer");
	// x.printStackTrace();
	// }
	//
	// }

	// ------------------------------------------------------------

	// public static void main(String[] args) {
	//
	// Caja<Perro> perrera = new Caja<Perro>();
	// Caja<Mascota> cajita = new Caja<>();
	// Perro perrito = new Perro();
	// Gato gatito = new Gato();
	// perrera.set(perrito);
	// cajita.set(gatito);
	//
	// }

	// -------------------------------------------------------------

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();

		lista.add(8);
		lista.add(7);
		lista.add(5);
		lista.add(7);

		for (Integer i : lista) {
			System.out.println(i);
		}

	}

}
