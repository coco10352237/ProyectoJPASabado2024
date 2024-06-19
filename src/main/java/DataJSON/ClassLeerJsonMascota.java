package DataJSON;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;

public class ClassLeerJsonMascota {
	
	public static void main(String[] args){
		//ubicamos la ruta del archivo que va hacer leido
		String ruta="E:/archivo2025/mascota.json";
		//recuperamos la ruta para  ser leido el archivo json...
		try {
			Reader lectura=Files.newBufferedReader(Paths.get(ruta));
			//instanciamos la GSON...
			Gson leer=new Gson();
			//aplicamos la interface map.. con el metodo fromjson..
			Map<?,?> leefinal=leer.fromJson(lectura,Map.class);
			//imprimimos por pantalla los valores recuperados
		    //del archivo json...
			System.out.println("codigo "+leefinal.get("codigo")+" nombre "+
		    leefinal.get("nommascota")+" raza "+leefinal.get("raza")
		    +" pelo "+leefinal.get("color de pelo")+" nro. de vacunas "+
		    leefinal.get("nro de vacunas")+" edad "+leefinal.get("edad")
		    +" peso "+leefinal.get("peso"));
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
		
		
	}  //fin del metodo principal..

}    //fin de la clase leer json...
