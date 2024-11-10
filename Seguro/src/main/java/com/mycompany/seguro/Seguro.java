package com.mycompany.seguro;

public class Seguro {
    private String idSeguro, nombre, apellidosCliente;
    private double costoAnual;

    public Seguro(String idSeguro, String nombre, String apellidosCliente, double costoAnual) {
        this.idSeguro = idSeguro;
        this.nombre = nombre;
        this.apellidosCliente = apellidosCliente;
        this.costoAnual = costoAnual;
    }

    public String getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(String idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public double getCostoAnual() {
        return costoAnual;
    }

    public void setCostoAnual(double costoAnual) {
        this.costoAnual = costoAnual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idSeguro: ").append(idSeguro).append("\n");
        sb.append("nombre: ").append(nombre).append("\n");
        sb.append("apellidos Cliente: ").append(apellidosCliente).append("\n");
        sb.append("costoAnual: ").append(costoAnual).append("\n");
        return sb.toString();
    }
}
