package DataJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassTestConverJsonAuto {

	public static void main(String[] args) {
		//instanciamos las respectiva clases..
		ClassAuto auto=new ClassAuto();
		//asignamos los valores
		auto.setIdauto(10);
		auto.setMarca("toyota");
		auto.setModelo("F11");
		auto.setColor("negro");
		auto.setNroplaca("fj789");
		auto.setMotor("1.5");
		auto.setTarjpropiedad("kk789perez");
		auto.setYearfabri("2025");
		ClassAuto autodos=new ClassAuto();
		autodos.setIdauto(20);
		autodos.setMarca("nissan");
		autodos.setModelo("sentra");
		autodos.setColor("azul");
		autodos.setNroplaca("kl7895");
		autodos.setMotor("1.5");
		autodos.setTarjpropiedad("kpsanchez");
		autodos.setYearfabri("2024");
		ClassAuto autotres=new ClassAuto();
		autotres.setIdauto(30);
		autotres.setMarca("kia");
		autotres.setModelo("rio");
		autotres.setColor("verde");
		autotres.setNroplaca("gt4568");
		autotres.setMotor("1.7");
		autotres.setTarjpropiedad("kh78945");
		autotres.setYearfabri("2024");
		//declaramos un objeto de list classauto..
		List<ClassAuto> listadoautos=new ArrayList<ClassAuto>();
		//agregamos datos a listado
		listadoautos.add(auto);
		listadoautos.add(autodos);
		listadoautos.add(autotres);
		//primer formato en  en json...
		Gson autojson=new Gson();
		//almacenamos en una variable de tipo string...
		String datos=autojson.toJson(listadoautos);
		//imprimimos mensaje por pantalla
		System.out.println("*********** primera forma en json*********");
		//imprimimos el resultado
		System.out.println(datos);
         //segunda forma.. en data json...
		Gson autojsonsegundo=new GsonBuilder().setPrettyPrinting().create();
		//almacenamos los valores en una variable de tipo string...
		String datosdos=autojsonsegundo.toJson(listadoautos);
		//imprimimos mensaje por pantallas
		System.out.println("*************************** segunda forma en json*******");
		//imprimimos el resultado de la segunda forma..
		System.out.println(datosdos);
		//guardar los datos en una carpeta para su posterior uso...
		File archivojson=new File("E:/archivo2025/auto.json");
		//aplicamos la clase printwriter..
		try {
			PrintWriter pw=new PrintWriter(archivojson);
			//escribimos
			pw.write(datosdos);
			//cerramos
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //fin del catch...
		
		
	}  //fin del metodo principal....

}   //fin de la clase...
