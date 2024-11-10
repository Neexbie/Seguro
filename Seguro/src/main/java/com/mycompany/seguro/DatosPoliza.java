package com.mycompany.seguro;

public class DatosPoliza {
    public Poliza makePoliza(){
        return new Poliza(makeCliente(), makeSeguro());
    }
    
    public Cliente makeCliente(){
        String nombre = Leer.cadena("Nombre Cliente: ");
        String apellido1 = Leer.cadena("Apellido cliente: ");
        String rfc = Leer.cadena("RFC Cliente: ");
        
        return new Cliente(nombre, apellido1, rfc);
    }
    
    public Seguro makeSeguro(){
        String idSeguro = Leer.cadena("ID Seguro: ");
        String nombre = Leer.cadena("Nombre: ");
        String apellidosCliente = Leer.cadena("Apellido cliente: ");
        double costoAnual = Leer.doble("Costo Anual: $");
        
        return new Seguro(idSeguro, nombre, apellidosCliente, costoAnual);
    }
}
