package dad.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		System.out.println("Introduzca el nombre");
		p.Nombre = sc.nextLine();
		System.out.println("Introduzca Apellidos");
		p.Apellidos = sc.nextLine();
		System.out.println("Y por ultimo la edad");
		p.edad = sc.nextInt();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		sc.close();
	}

}
