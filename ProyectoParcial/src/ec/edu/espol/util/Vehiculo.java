/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

import java.util.Objects;

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
    
    //TOSTRING
    @Override
    public String toString() {
        return "--- INFORMACIÓN DEL VEHÍCULO ---" + "\nTipo de Vehículo:" + tipoVehiculo + "\nPlaca: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo de motor: " + motor + "\nAño: " + anio + "\nRecorrido: " + recorrido + " Km \nColor: " + color + "\nTipo combustible: " + combustible + "\nTransmision: " + transmision + "\nPrecio: " + precio ;
    }
    
}
