package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Persona p=new Persona();
		System.out.println("Escriba aqui el nombre");
		p.Nombre=sc.nextLine();
		while(!p.Nombre.matches("^[a-zA-Z]+$")){
		System.out.println("Este nombre no es correcto.");
		System.out.println("Introduzca otro");
		p.Nombre=sc.nextLine();
		}
		System.out.println("Escriba aqui sus apellidos");
		p.Apellidos=sc.nextLine();
		if (!p.Apellidos.matches("^[a-zA-Z]+( [a-zA-Z]+)*$")) {
			System.out.println("Estos apellidos no son correctos.");
			System.out.println("Introduzca otro");
			p.Apellidos=sc.nextLine();
			}
		System.out.println("Y por ultimo su edad");
		p.edad=sc.nextInt();
		
		sc.close();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}
