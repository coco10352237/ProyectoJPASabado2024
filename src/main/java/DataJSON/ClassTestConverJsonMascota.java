package DataJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassTestConverJsonMascota {

	public static void main(String[] args) {
		//instanciamos la respectiva clase...
		ClassMascota clmas=new ClassMascota();
		//asignamos valores
		clmas.setIdmascota(100);
		clmas.setNommascota("boby");
		clmas.setRaza("pastor aleman");
		clmas.setColor("negro");
		clmas.setVacuna("5");
		clmas.setEdad("5");
		clmas.setPeso("7kg");
		//primera forma
		Gson gsonmascota=new Gson();
		//aplicamos el metodo "TOJSON"
		String datosmascota=gsonmascota.toJson(clmas);
		//imprimimos mensaje por consola
		System.out.println("*********** Primera forma *******************");
		//imprimimos resultado por pantalla
		System.out.println(datosmascota);
		//segunda form de serializar...
		Gson otroformato=new GsonBuilder().setPrettyPrinting().create();
		//imprimimos mensaje por consola
		System.out.println("*************** segunda forma ****************");
		//almacenamos los valores en una variable de tipo string.
		String datosdos=otroformato.toJson(clmas);
		//imprimimos el resultado de la segunda forma.
		System.out.println(datosdos);
		//crear una carpeta "archivo2025" en la unidad "E"
		//en dicha carpeta archivo2025 guardamos el archivo mascota.json
		//para ello aplicamos la clase file...
		File archivojson=new File("E:/archivo2025/mascota.json");
		//aplicamos la clase printwriter.
		PrintWriter pw;
		try {
			pw=new PrintWriter(archivojson);
			//utilizamos el metodo write..
			pw.write(datosdos);
			//cerramos 
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fin del catch..
		
		
		
		

	}  //fin del metodo principal...

}   //fin de la clase test...
