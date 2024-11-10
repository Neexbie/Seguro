package com.mycompany.seguro;

public class SeguroAhorro extends Seguro{
    private double cantidadMensualPago;

    public SeguroAhorro(double cantidadMensualPago, String idSeguro, String nombre, String apellidosCliente, double costoAnual) {
        super(idSeguro, nombre, apellidosCliente, costoAnual);
        this.cantidadMensualPago = cantidadMensualPago;
    }

    public double getCantidadMensualPago() {
        return cantidadMensualPago;
    }

    public void setCantidadMensualPago(double cantidadMensualPago) {
        this.cantidadMensualPago = cantidadMensualPago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("cantidadMensualPago: $").append(cantidadMensualPago).append("\n");
        return sb.toString();
    }  
}
