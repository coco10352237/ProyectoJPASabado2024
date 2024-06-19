package DataJSON;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class ClassLeerJsonAuto {

	public static void main(String[] args) {
		//almacenamos la ruta a leer
		String ruta="E:/archivo2025/auto.json";
		//recuperamos la ruta para ser leida..
		try {
			Reader lectura=Files.newBufferedReader(Paths.get(ruta));
			//instanciamos la clase GSON...
			Gson leer=new Gson();
			//recuperamos los datos  para darle lectura
			ClassAuto[] autos=leer.fromJson(lectura,ClassAuto[].class);
			//aplicamos un bucle for...
			for(ClassAuto lis:autos){
				//imprimimos por pantalla
				System.out.println("codigo "+lis.getIdauto()+
						" marca "+lis.getMarca()+" modelo "+lis.getModelo()+
						" color"+lis.getColor()+"nro. de placa "
						+lis.getNroplaca()+" motor "+lis.getMotor()+
						" tarjeta de propiedad "+lis.getTarjpropiedad()
						+" fabricacion  del auto "+lis.getYearfabri());
			}   //fin del bucle for...
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //fin del catch.....

	}  //fin del metodo principal....

}//fin de la clase..
