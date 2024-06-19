package FLUJOS;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassEjemploStreamII {

	public static void main(String[] args) {
		//creamos una carpeta  en undad  "c","d",etc...
		//nombre de la carpeta flujos2025
		String ruta="E:/flujos2025/cursos2025.txt";
		//aplicamos la clase fileoutputstream
		try {
			FileOutputStream archivo=new FileOutputStream(ruta);
			//vinculamos con la clase dataoutputstream...
			DataOutputStream entrada=new DataOutputStream(archivo);
			//asignamos valores en una variable de tipo stream
			String cursoprog="Cursos de Programacion:Lenguaje de programacio JPA Y MYSQL,"
					+ "Lenguaje de programacion I,base de datos II,Desarrollo de Servicios WEBII";
			//escribimos  en el archivo
			entrada.writeUTF(cursoprog);
			//cerramos el flujo
			entrada.close();
			//realizamos la respectiva lectura
			FileInputStream leerarchivo=new FileInputStream(ruta);
			//vinculamos  la clase fileinputstream con la clase datainputstream
			DataInputStream lectura=new DataInputStream(leerarchivo);
			//imprimimos por pantalla
			System.out.println(lectura.readUTF());
			//cerramos el flujo
			lectura.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     //fin del catch.....
          catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
		
	}   //fin del metodo principal...

}    //fin de la clase...
