
package Otro;

import Ejercicio_7.Carro.AutoCompacto;
import Ejercicio_7.Carro.Camioneta;
import Ejercicio_7.Carro.Vehiculo;
import java.util.Scanner;


public class Testtt {
    
  public static void main(String[] args) {
    Vehiculo vehiculos[] = new Vehiculo[4];

    int numSerieMotor = 0;
    int year = 0;
    int pasajeros = 0;
    int carga = 0;
    int ejes = 0;
    int rodadas = 0;
    double precio = 0;
    String marca = "";

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca los datos del auto de lujo:" + "\n");
    System.out.println("Introduzca el numero de serie del motor");
    numSerieMotor = sc.nextInt();
    System.out.println("Introduzca la marca");
    marca = sc.next();
    System.out.println("Introduzca el año");
    year = sc.nextInt();
    System.out.println("Introduzca el precio");
    precio = sc.nextDouble();
    System.out.println("Introduzca la cantidad de pasajeros");
    pasajeros = sc.nextInt();

    vehiculos[0] = new AutoCompacto(numSerieMotor, year, marca, precio, pasajeros);
    System.out.println(vehiculos[0].toString());

    System.out.println("Introduzca los datos de la camioneta:" + "\n");
    System.out.println("Introduzca el numero de serie del motor");
    numSerieMotor = sc.nextInt();
    System.out.println("Introduzca la marca");
    marca = sc.next();
    System.out.println("Introduzca el año");
    year = sc.nextInt();
    System.out.println("Introduzca el precio");
    precio = sc.nextDouble();
    System.out.println("Introduzca la cantidad de carga");
    carga = sc.nextInt();
    System.out.println("Introduzca la cantidad de ejes");
    ejes = sc.nextInt();
    System.out.println("Introduzca la cantidad de rodadas");
    rodadas = sc.nextInt();
    vehiculos[1] = new Camioneta(numSerieMotor, year, marca, precio, carga, ejes, rodadas);
    System.out.println(vehiculos[1].toString());

  }

}

