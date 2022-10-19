import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {

		int MAX = 10;
		int solucionProceso = 0;
		int solucionTotal = 0;
		for(int i = 0; i < MAX; i++) {
			ProcessBuilder pb = new ProcessBuilder();
			pb.command("java", "Sumador", "1", "");
			pb.redirectOutput(new File("nuevo" + i + ".txt"));
			//pb.inheritIO(); //Para que herede de la clase padre los parámetros y lo imprime
			Process p = pb.start();
		}
		
		File mifichero;
		mifichero = new File ("nuevo0.txt");
		
		try (FileReader lector = new FileReader(mifichero);
			BufferedReader cestaTemporal = new BufferedReader(lector)) {
			String linea = cestaTemporal.readLine();
			while (linea != null) {
				solucionProceso = Integer.parseInt(linea);
				System.out.println(linea);
				linea = cestaTemporal.readLine();
			}
			solucionTotal += solucionProceso;		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		for(int i = 0; i < MAX; i++) { 
			mifichero = new File ("nuevo" + i + ".txt");
			try (FileReader lector = new FileReader(mifichero)) {
				int digitos = lector.read();
				while (digitos > 0) {
					System.out.println(digitos);
					solucionProceso += digitos;
					digitos = lector.read();
				}
				solucionTotal += solucionProceso;
		
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		System.out.println(solucionTotal);
		/*
		ProcessBuilder pb2 = new ProcessBuilder();
		pb2.command("java", "Sumador", "3", "6");
		pb2.redirectOutput(new File("nuevo1.txt"));
		//pb.inheritIO(); //Para que herede de la clase padre los parámetros y lo imprime
		Process p2 = pb2.start();
		
		p1.waitFor();p2.waitFor();
		
		//Look for the files a retrieve the info
		*/
		
	}
}
