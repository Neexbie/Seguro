package com.mycompany.seguro;

public class Cliente {
    private String nombre, apellido1, rfc;

    public Cliente(String nombre, String apellido1, String rfc) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre: ").append(nombre).append("\n");
        sb.append("apellido1: ").append(apellido1).append("\n");
        sb.append("rfc: ").append(rfc).append("\n");
        return sb.toString();
    }
}
