package com.mycompany.seguro;

public class ClienteCorporativo extends Cliente{
    private String empresa;

    public ClienteCorporativo(String empresa, String nombre, String apellido1, String rfc) {
        super(nombre, apellido1, rfc);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("empresa=").append(empresa).append("\n");
        return sb.toString();
    }
}
