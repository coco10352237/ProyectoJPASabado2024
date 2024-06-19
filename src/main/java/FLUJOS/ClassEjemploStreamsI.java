package FLUJOS;

import java.io.DataInputStream;
import java.io.IOException;

public class ClassEjemploStreamsI {

	public static void main(String[] args) {
		//instanciamos la respectiva clase datainput stream.
		DataInputStream operacion=new DataInputStream(System.in);
		//declaramos numeros  de tipo entero e imprimimos mensaje por pantalla
		System.out.println("*********ingrese numeros solicitados*****");
		try {
			int a=Integer.parseInt(operacion.readLine());
			int b=Integer.parseInt(operacion.readLine());
			int c=Integer.parseInt(operacion.readLine());
			//calculamos la suma de los enteros correspondientes
			int suma=a+b+c;
			//imprimimos el resultado por pantalla
			System.out.println("la suma  de los numeros es "+suma);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //fin del catch....
		
		

	}    //fin del metodo principal...

}    //fin de la clase...
