package Esercizi.Ecommerce;

import javax.management.monitor.StringMonitorMBean;

public class Cliente {
    private int codiceCliente;
    private String nomeCognomeCliente;
    private String email;
    private String data;

    public Cliente (int codiceCliente, String nomeCognomeCliente, String email, String data){
        this.codiceCliente= codiceCliente;
        this.nomeCognomeCliente = nomeCognomeCliente;
        this.email = email;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Cliente {" +
                "codiceCliente: " + codiceCliente +
                ", nomeCognomeCliente: " + nomeCognomeCliente +
                ", email: " + email +
                ", data: " + data + "}";
    }
}
