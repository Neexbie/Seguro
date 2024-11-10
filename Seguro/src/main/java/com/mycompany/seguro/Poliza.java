package com.mycompany.seguro;

public class Poliza {
    private Cliente cliente;
    private Seguro seguro;

    public Poliza(Cliente cliente, Seguro seguro) {
        this.cliente = cliente;
        this.seguro = seguro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Póliza: ").append("\n");
        sb.append(cliente.toString()).append("\n");
        sb.append(seguro.toString()).append("\n");
        return sb.toString();
    }
}
