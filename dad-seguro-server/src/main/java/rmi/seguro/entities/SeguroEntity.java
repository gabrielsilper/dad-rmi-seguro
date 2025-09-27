package rmi.seguro.entities;

import jakarta.persistence.*;
import rmi.seguro.models.Seguro;

@Entity
@Table(name = "seguros")
public class SeguroEntity extends Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Override
    public long getId() {
        return super.getId();
    }

    @Column(name = "destino", nullable = false, length = 100)
    @Override
    public String getDestino() {
        return super.getDestino();
    }

    @Column(name = "valor", nullable = false)
    @Override
    public double getValor() {
        return super.getValor();
    }

    @Column(name = "codigo_ibge", nullable = false)
    @Override
    public int get
}
