/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

/**
 *
 * @author SANDRY
 */
public class Carro {

    
    public abstract class Vehiculo {

    public int numSerieMotor;
    public int year;
    public String marca;
    public double precio;

    public Vehiculo(int numSerieMotor, int year, String marca, double precio) {
        super();
        this.numSerieMotor = numSerieMotor;
        this.year = year;
        this.marca = marca;
        this.precio = precio;
    }

}

public abstract class Auto extends Vehiculo {

    public int pasajeros;

    public Auto(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio);
        this.pasajeros = pasajeros;
    }

}

public class AutoLujo extends Auto {

    public AutoLujo(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }

    @Override
    public String toString() {
        return "AutoLujo [pasajeros=" + pasajeros + ", numSerieMotor=" + numSerieMotor + ", year=" + year + ", marca=" + marca + ", precio=" + precio + "]";
    }

}

public class AutoCompacto extends Auto {

    public AutoCompacto(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }

    @Override
    public String toString() {
        return "AutoCompacto [pasajeros=" + pasajeros + ", numSerieMotor=" + numSerieMotor + ", year=" + year + ", marca=" + marca + ", precio=" + precio + "]";
    }

}

public class Vagoneta extends Auto {

    public Vagoneta(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }

    @Override
    public String toString() {
        return "Vagoneta [pasajeros=" + pasajeros + ", numSerieMotor=" + numSerieMotor + ", year=" + year + ", marca=" + marca + ", precio=" + precio + "]";
    }

}

public class Camioneta extends Vehiculo {

    public int capacidadCarga;
    public int cantidadEjes;
    public int cantidadRodadas;

    public Camioneta(int numSerieMotor, int year, String marca, double precio, int capacidadCarga, int cantidadEjes,
            int cantidadRodadas) {
        super(numSerieMotor, year, marca, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
        this.cantidadRodadas = cantidadRodadas;
    }

    @Override
    public String toString() {
        return "Camioneta [capacidadCarga=" + capacidadCarga + ", cantidadEjes=" + cantidadEjes + ", cantidadRodadas=" + cantidadRodadas + ", numSerieMotor=" + numSerieMotor + ", year=" + year + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
}


