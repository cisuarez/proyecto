/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;
import java.util.Objects;

/**
 *
 * @author Mile
 */
public class Venta {
    //ATRIBUTOS
    private static int iDVenta = 0;      //Variable Autoincrementable con la creación de un nuveo Objeto Venta
    private boolean vendido;             //Estado de venta del auto, se lo obtiene a partir del método aceptarOferta de la clase Vendedor
    private Vehiculo vehiculo;
    private Vendedor vendedor;
    private Oferta oferta;
    
    //CONSTRUCTORES
    public Venta() {
    }
    public Venta(Vehiculo vehiculo, Vendedor vendedor, Oferta oferta) {
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        this.oferta = oferta;
        //vendido = vendedor.aceptarOferta();
        iDVenta = iDVenta +1;
    }
    
    //GETTERS
    public boolean isVendido() {
        return vendido;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public Oferta getComprador() {
        return oferta;
    }
    
    //SETTERS
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        if (vehiculo!=null)
            this.vehiculo = vehiculo;
    }
    public void setVendedor(Vendedor vendedor) {
        if (vendedor!=null)
            this.vendedor = vendedor;
    }
    public void setComprador(Oferta oferta) {
        if (oferta!=null)
            this.oferta = oferta;
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
        
        Venta other = (Venta)o;
        return this.iDVenta == other.iDVenta;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        if (vendido == true){
            return " VENTA EXITOSA \n************* \n --- Datos de la Venta --- \nDatos del Vendedor: " + vendedor.getNombres() + " " + vendedor.getApellidos() + ", C.I. " + vendedor.getCedula() + "\nDatos del Compador: " + oferta.getComprador().getNombres() + " " + oferta.getComprador().getApellidos() + ", C.I. " + oferta.getComprador().getCedula() + "\nDatos del Vehículo: " + vehiculo.getTipoVehiculo() + ", Placa " + vehiculo.getPlaca() + ", Año " + vehiculo.getAnio() + "\nMonto de la Venta: $" + oferta.getPrecioOfertado();
        }
        else
            return "No se pudo realizar la venta";
    }
    
    
}
