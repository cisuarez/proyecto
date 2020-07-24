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
public class Usuario {
    protected String nombres, apellidos, cedula, correo, organizacion, usuario, clave;
    
    public Usuario(String nom, String ap, String ci, String corr, String org, String us, String cl)
    {
        nombres = nom;
        apellidos = ap;
        cedula=ci;
        correo = corr;
        organizacion = org;
        usuario = us;
        clave = cl;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {        //No se aplica setCedula ya que es una documentacion cuyo valor no varía.
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o==null)        
            return false;
        if (this==o)        
            return true;
        if (this.getClass()!= o.getClass())    
            return false;
        
        Usuario other = (Usuario)o;
        return Objects.equals(this.cedula, other.cedula);
    }

    @Override
    public String toString() {
        return "**** DATOS DEL USUARIO ***" + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nC.I. " + cedula + "\nCorreo: " + correo + "\nOrganizacion: " + organizacion + "\nUser: " + usuario;
    }
    
}
