package com.mycompany.seguro;

public class ClienteIndividual extends Cliente{

    public ClienteIndividual(String nombre, String apellido1, String rfc) {
        super(nombre, apellido1, rfc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
