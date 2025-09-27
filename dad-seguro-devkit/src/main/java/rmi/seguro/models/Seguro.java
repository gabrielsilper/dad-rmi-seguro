package rmi.seguro.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Seguro implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    private long id;
    private String destino;
    private double valor;
    private int codigoIBGE;

    public Seguro(String destino, double valor, int codigoIBGE) {
        this.destino = destino;
        this.valor = valor;
        this.codigoIBGE = codigoIBGE;
    }

    public Seguro() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(int codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seguro seguro = (Seguro) o;
        return id == seguro.id && Double.compare(valor, seguro.valor) == 0 && codigoIBGE == seguro.codigoIBGE && Objects.equals(destino, seguro.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destino, valor, codigoIBGE);
    }

    @Override
    public String toString() {
        return "Seguro{" +
                "id=" + id +
                ", destino='" + destino + '\'' +
                ", valor=" + valor +
                ", codigoIBGE=" + codigoIBGE +
                '}';
    }
}
