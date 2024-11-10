package com.mycompany.seguro;

public class SeguroVidaBasico extends Seguro {
    private double montoAsegurado;

    public SeguroVidaBasico(double montoAsegurado, String idSeguro, String nombre, String apellidosCliente, double costoAnual) {
        super(idSeguro, nombre, apellidosCliente, costoAnual);
        this.montoAsegurado = montoAsegurado;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Monto por el que está asegurada la persona: $").append(montoAsegurado).append("\n");
        return sb.toString();
    }
}
