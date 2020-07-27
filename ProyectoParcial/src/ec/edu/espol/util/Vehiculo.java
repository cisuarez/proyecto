/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public abstract class Vehiculo {
    //ATRIBUTOS
    protected String tipoVehiculo; 
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String motor;  // Tipo de motor
    protected int anio;
    protected double recorrido;
    protected String color;
    protected String combustible;  //Tipo de combustible
    protected String transmision;
    protected double precio;
    protected ArrayList<Registros> registros;
    
    //CONSTRUCTORES
    public Vehiculo() {
    }
    public Vehiculo(String tipoVehiculo, String placa, String marca, String modelo, String motor, int anio, double recorrido, String color, String combustible, String transmision, double precio) {
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo= modelo;
        this.motor = motor;
        this.anio = anio;
        this.recorrido = recorrido;
        this.color = color;
        this.combustible = combustible;
        this.transmision = transmision;
        this.precio = precio;
        this.registros=new ArrayList<>();
    }

    public Vehiculo(String tipoVehiculo, int anio, double recorrido, double precio) {
        this.tipoVehiculo = tipoVehiculo;
        this.anio = anio;
        this.recorrido = recorrido;
        this.precio = precio;
    }
    
    //GETTERS
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMotor() {
        return motor;
    }
    public int getAnio() {
        return anio;
    }
    public double getRecorrido() {
        return recorrido;
    }
    public String getColor() {
        return color;
    }
    public String getCombustible() {
        return combustible;
    }
    public String getTransmision() {
        return transmision;
    }
    public double getPrecio() {
        return precio;
    }
    
    //SETTERS
    public void setTipoVehiculo(String tipoVehiculo) {
        if (tipoVehiculo!= null)
            this.tipoVehiculo = tipoVehiculo;
    }
    public void setPlaca(String placa) {
        if (placa!=null)
            this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public void setAnio(int anio) {
        if (anio>=1800)
            this.anio = anio;
    }
    public void setRecorrido(double recorrido) {
        if (recorrido>=0)
            this.recorrido = recorrido;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    public void setPrecio(double precio) {
        if (precio>=0)
            this.precio = precio;
    }
    
   
    public void registrarVehiculo(String archivo)
    {
        try(FileWriter fw = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter addTxt = new PrintWriter(bw))
        {
            addTxt.println(this);
        }
        catch (Exception v)
        {
            System.out.println(v.getMessage());
        }
<<<<<<< HEAD
    } 
    public  static ArrayList<String> Buscar(String Archivo,ArrayList<String> a){           //[ motocicleta, 500, rojo]
        ArrayList<String> vehiculos= new ArrayList<>();
        //String archivo = a.get(0)+".txt";
        try(Scanner sc= new Scanner(new File(Archivo))){
        while(sc.hasNext()){                
             double recInLista=Double.parseDouble(a.get(1));
             double recFinLista=Double.parseDouble(a.get(2));
             String linea= sc.nextLine();             
             String[] arr= linea.split(",");            
             String tipo=arr[0];
             String rec=arr[6];
             double recorrido=Double.parseDouble(rec);
             if (tipo.equals(a.get(0))&&(recInLista>=recorrido)&&(recFinLista<=recorrido)){
                 vehiculos.add(linea);
             }
             /*String rec=arr[6];
             String anio=arr[7];
             String precio=arr[9];
             //atributos.add(tipo);
             //atributos.add(rec);                         
             /*while (v1.getTipoVehiculo().equals(tipo)||v1.getRecorrido()==Double.parseDouble(rec)){
                atributos.add(tipo);
                atributos.add(rec);
                atributos.add(anio);
                atributos.add(precio);
             }*/
         }   
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     return vehiculos; 
        
    }

=======
    }    
    
    public void imprimirVehiculo(){
        System.out.println("**** DATOS DEL VEHICULO ****");
        System.out.println("Tipo de Vehículo: " + this.tipoVehiculo + "\nPlaca: " + this.placa + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nMotor: " + this.motor + "\nAño: " + this.anio + "\nRecorrido: " + this.recorrido + "\nColor: " + this.color + "\nTipo de Combustible: " + this.combustible + "\nTrnasmisión: " + this.transmision + "\nPrecio: " + this.precio);
    }
    //EQUALS
    @Override    
    public boolean equals(Object o) {
        if (o==null)        
            return false;
        if (this==o)        
            return true;
        if (this.getClass()!= o.getClass())    
            return false;
        
        Vehiculo other = (Vehiculo)o;
        return Objects.equals(this.placa, other.placa);
    }  
>>>>>>> f7875a50b673bfa1b7abe1138a1326cd65ad89da
    //TOSTRING
    @Override
    public String toString() {
        return this.tipoVehiculo + "," + this.placa + "," + this.marca + "," + this.modelo + "," + this.motor + "," + this.anio + "," + this.recorrido + "," + this.color + "," + this.combustible + "," + this.transmision + "," + this.precio;
    }    
}
