/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.common;

import ec.edu.espol.provider.OpcionesMenu;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espol.util.Auto;
import ec.edu.espol.util.Camion;
import ec.edu.espol.util.Camioneta;
import ec.edu.espol.util.Comprador;
import ec.edu.espol.util.Encriptar;
import static ec.edu.espol.util.Encriptar.encriptaHex;
import static ec.edu.espol.util.Encriptar.to256;
import ec.edu.espol.util.Motocicleta;
import ec.edu.espol.util.Vehiculo;
import ec.edu.espol.util.Vendedor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mile
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        /*String destinatario = "milenariquero@gmail.com";
        String asunto = "Esto es una prueba de envio de correo en Java";
        String cuerpo = "Se esta realizando una prueba de correo...";
        
        Mail.enviarMail(destinatario, asunto, cuerpo);*/
        Scanner sc= new Scanner(System.in);
        sc.useDelimiter("\n");
        ArrayList<Integer> opciones = new ArrayList<>();
        opciones.add(1);
        opciones.add(2);
        opciones.add (3);
        int opcion;
        do{        
            OpcionesMenu.menuPrincipal();
            opcion = sc.nextInt();
            while (!opciones.contains(opcion)){
                System.out.println("**OPCIÓN NO VÁLIDA**");
                System.out.print("Ingrese un número: ");
                opcion = sc.nextInt();
            }
            switch (opcion){
                case 1:
                    ArrayList<Integer> subopciones = new ArrayList<>();
                    subopciones.add(1);
                    subopciones.add(2);
                    subopciones.add(3);
                    subopciones.add(4);
                    int subopcion;
                    do {
                        OpcionesMenu.menuVendedor();
                        subopcion = sc.nextInt();
                        while (!subopciones.contains(subopcion)){
                            System.out.println("**OPCIÓN NO VÁLIDA**");
                            System.out.print("--> ");
                            subopcion = sc.nextInt();
                        }
                        switch(subopcion){
                            case 1:  //Esta opción ingresa un nuevo vendedor                
                                System.out.println("*** Por favor, ingrese los datos de acontinuación para su registro ***");
                                System.out.print("Cédula: ");
                                String ci=sc.next();
                                System.out.print("Nombres: ");
                                String nombres=sc.next();
                                System.out.print("Apellidos: ");
                                String apellidos= sc.next();
                                System.out.print("Correo Electrónico: ");
                                String correo=sc.next();
                                while(!(correo.contains("@")&&(correo.contains(".com") || correo.contains("ec") || correo.contains("es")))){        //Validación de ingreso correcto del campo correo
                                    System.out.print("Correo Invalido, Ingrese otro: ");
                                    correo=sc.next();
                                }
                                System.out.print("Organización: ");
                                String org= sc.next();
                                System.out.print("Usuario: ");
                                String user= sc.next();
                                System.out.print("Clave: ");
                                String clave = sc.next();
                                String claveEncrip= encriptaHex(to256(clave));
                                System.out.println(claveEncrip);
                              
                                Vendedor us1= new Vendedor(nombres, apellidos, ci, correo, org, user, clave);
                                
                                us1.registrarVendedor("Vendedores.txt");
                                System.out.println(" ");
                                System.out.println(us1);
                                break;
                                
                            case 2:   //Esta opción ingresa un nuevo vehículo
                                boolean validar=false;  //CAMBIAR!!!
                                do{System.out.print("Ingrese su usuario: ");
                                String us=sc.next();
                                System.out.print("Ingrese su contraseña: ");
                                String cont=sc.next();
                                String contEncrip= encriptaHex(to256(cont));
                                System.out.println(contEncrip);
                                //validar= Usuario.validarIngreso("vendedores.txt",us,contEncrip); //Aqui se debería validar el usuario y la contraseña
                                }while (validar==false);
                                    System.out.println("Ingrese el tipo de vehiculo que desea registrar: ");
                                    String tipoVehiculo=sc.next();
                                    System.out.print("Ingrese la placa del vehiculo: ");
                                    String placa=sc.next();
                                    System.out.print("Ingrese la marca del vehículo: ");
                                    String marca= sc.next();
                                    System.out.println("Ingrese el modelo del vehiculo: ");
                                    String modelo= sc.next();
                                    System.out.println("Ingrese el tipo de motor: ");
                                    String motor=sc.next();
                                    System.out.print("Ingrese el año: ");
                                    int anio=sc.nextInt();
                                    System.out.print("Ingrese el recorrido: ");
                                    double recorrido=sc.nextDouble();
                                    System.out.print("Ingrese el color del vehiculo: ");
                                    String color=sc.next();
                                    System.out.print("Ingrese el tipo de combustible que usa el vehículo: ");
                                    String combustible=sc.next();
                                    System.out.print("Ingrese la transmisión: ");
                                    String transmision=sc.next();
                                    System.out.print("Ingrese el precio del Vehículo: ");
                                    double precio=sc.nextDouble();
                                    switch (tipoVehiculo){
                                        case "auto":
                                            System.out.print("Ingrese el número de vidrios: ");
                                            int vidrios=sc.nextInt();
                                            Auto vn= new Auto(tipoVehiculo,placa,marca,modelo,motor,anio,recorrido,color,combustible,transmision,precio,vidrios);
                                            vn.registrarVehiculo("Vehiculos.txt");
                                            break;
                                        case "camion":
                                            System.out.print("Ingrese el número de vidrios: ");
                                            int vidrios1=sc.nextInt();
                                            Camion vn1= new Camion(tipoVehiculo,placa,marca,modelo,motor,anio,recorrido,color,combustible,transmision,precio,vidrios1);
                                            vn1.registrarVehiculo("Vehiculos.txt");
                                            break;
                                        case "camioneta":
                                            System.out.print("Ingrese el número de vidrios: ");
                                            int vidrios2=sc.nextInt();
                                            Camioneta vn2= new Camioneta(tipoVehiculo,placa,marca,modelo,motor,anio,recorrido,color,combustible,transmision,precio,vidrios2);
                                            vn2.registrarVehiculo("Vehiculos.txt");
                                            break;
                                        case "motocicleta":
                                            System.out.print("Ingrese el tipo de motocicleta: ");
                                            String tipo=sc.next();
                                            Motocicleta vn3= new Motocicleta(tipoVehiculo,placa,marca,modelo,motor,anio,recorrido,color,combustible,transmision,precio,tipo);
                                            vn3.registrarVehiculo("Vehiculos.txt");
                                            break;
                                    }
                                break;
                            case 3:
                                boolean existe=false;
                                String[] infovehiculo;
                                do{
                                    System.out.print("Ingrese la placa: ");
                                    String placaOfertas= sc.next();
                                    try (Scanner sc1 = new Scanner (new File ("Vehiculos.txt"))){
                                        while (sc1.hasNextLine()){
                                            String[] info = sc1.nextLine().split(",");
                                            if (placaOfertas.equals(info[1])){
                                                existe=true;
                                                infovehiculo= info;
                                            }
                                        }
                                    }  catch(Exception e){
                                         System.out.println(e.getMessage());
                                    }
                                }while(existe==false);
                                
                                
                                ArrayList<String> presentar = new ArrayList<>();  //Leer archivo ofertas para presentar las ofertas que se desean mostrar
                                presentar.add("primero ***");
                                presentar.add("segundo ***");
                                presentar.add("tercero ***");
                                int i=0;
                                int f=presentar.size();

                                while (i<f){
                                    System.out.println(i);
                                    System.out.println(presentar.get(i));
                                    OpcionesMenu.menuOferta(i, f);
                                    int op = sc.nextInt();
                                    //System.out.println("--> ");
                                    if (i==0){
                                        switch(op){
                                            case 1:
                                                i++;
                                                break;
                                            case 2:
                                                i=f;
                                                System.out.println("Se ha aceptado una oferta");
                                                break;
                                            default:
                                                i=f;
                                                break;
                                        }
                                    }

                                    else if(i<(f-1) && i!=0){
                                        switch(op){
                                            case 1:
                                                i--;
                                                break;
                                            case 2:
                                                i++;
                                                break;
                                            case 3:
                                                i=f;
                                                System.out.println("Se ha aceptado una oferta");
                                            default:
                                                i=f;
                                                break;
                                        }

                                    }
                                    else if (i==(f-1)){
                                        switch(op){
                                            case 1:
                                                i--;
                                                break;
                                            case 2:
                                                i=f;
                                                System.out.println("Se ha aceptado una oferta");
                                                break;
                                            default:
                                                i=f;
                                                break;
                                        }
                                    }     
                                }
                                break;
                            default:
                                break;}
                    }while(subopcion!=4);
                    break;
        //------------------------------------------------------------------------------------------------------------------------------------        
                case 2:
                    
                    ArrayList<Integer> subopciones1 = new ArrayList<>();
                    subopciones1.add(1);
                    subopciones1.add(2);
                    subopciones1.add(3);
                    int subopcion1;
                    do{
                        OpcionesMenu.menuComprador();
                        subopcion1= sc.nextInt();
                        while (!subopciones1.contains(subopcion1)){
                            System.out.println("**OPCIÓN NO VÁLIDA**");
                            System.out.print("--> ");
                            subopcion1 = sc.nextInt();
                        }
                        switch(subopcion1){
                            case 1:
                                System.out.println("Esta opción registra un nuevo comprador");
                                System.out.println("*** Por favor, ingrese los datos de acontinuación para su registro ***");
                                System.out.print("Cédula: ");
                                String ci=sc.next();
                                System.out.print("Nombres: ");
                                String nombres=sc.next();
                                System.out.print("Apellidos: ");
                                String apellidos= sc.next();
                                System.out.print("Correo Electrónico: ");
                                String correo=sc.next();
                                while(!(correo.contains("@")&&(correo.contains(".com") || correo.contains("ec") || correo.contains("es")))){        //Validación de ingreso correcto del campo correo
                                    System.out.print("Correo Invalido, Ingrese otro: ");
                                    correo=sc.next();
                                }
                                System.out.print("Organización: ");
                                String org= sc.next();
                                System.out.print("Usuario: ");
                                String user= sc.next();
                                System.out.print("Clave: ");
                                String clave = sc.next();
                                String claveEncrip= encriptaHex(to256(clave));
                                System.out.println(claveEncrip);
                              
                                Comprador us1= new Comprador(nombres, apellidos, ci, correo, org, user, clave);
                                us1.registrarComprador("Compradores.txt");
                                System.out.println(" ");
                                System.out.println(us1);
                                break;
                            case 2:
                                System.out.println("Esta opcion permite al comprador ofertar");
                                break;
                            default:
                                break;                       
                        }
                    }while(subopcion1!=3);
                    break;
                
                default:
                    break;
            }
        }while(opcion!=3);
    }
    
}