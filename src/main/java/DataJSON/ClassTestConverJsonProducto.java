package DataJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassTestConverJsonProducto {
	
	public static void main(String[] args){
		
		//instanciamos la respectiva clase 
		ClassProducto producto=new ClassProducto();
		//asignamos valores
		producto.setIdproducto(10);
		producto.setNombre("televisor");
		producto.setDescripcion("televisor de marca japonesa");
		producto.setCantidad(10);
		producto.setNrolote(78978);
		producto.setCodbarras(7778956);
		//primera forma de serializar..
		Gson primfor=new Gson();
		//aplicamos el metodo tojson() para convertir  los objetos en data json...
		String datosjson=primfor.toJson(producto);
		//imprimimos mensaje por consola
		System.out.println("************** primera forma*********");
		//imprimimos por pantalla
		System.out.println(datosjson);
		//segunda form de serializar..
		Gson segufor=new GsonBuilder().setPrettyPrinting().create();
		//almacenamos la data en una variable de tipo string..
		String datosjsondos=segufor.toJson(producto)
;
		//imprimimos mensaje por pantalla
		System.out.println("****************segunda forma*******");
		//imprimimos  datos de la segunda forma.
		System.out.println(datosjsondos);
		//creamos una carpeta  donde guardar  la data  para posteriormente
		//darle un uso.
		File guardarjson=new File("E:/archivo2025/producto.json");
		//aplicamos la clase printwriter
		try {
			PrintWriter pw=new PrintWriter(guardarjson);
			//aplicamos el metodo  write
			pw.write(datosjsondos);
			//cerramos el objeto
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
		
		
		
		
	}     //fin del metodo principal..

}   //fin de la clase...
