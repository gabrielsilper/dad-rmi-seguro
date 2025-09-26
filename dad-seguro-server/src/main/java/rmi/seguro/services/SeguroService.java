package rmi.seguro.services;

import rmi.seguro.dao.SeguroDAO;
import rmi.seguro.entities.SeguroEntity;
import rmi.seguro.models.Seguro;

public class SeguroService {
    private final SeguroDAO seguroDAO;

    public SeguroService() {
        this.seguroDAO = new SeguroDAO();
    }

    public Seguro pesquisaSeguro(String destino) {
        SeguroEntity seguroEntity = seguroDAO.buscarPorDestino(destino);

        if (seguroEntity == null) {
            return null;
        }

        Seguro seguro = new Seguro();
        seguro.setId(seguroEntity.getId());
        seguro.setDestino(seguroEntity.getDestino());
        seguro.setValor(seguroEntity.getValor());

        return seguro;
    }
}
