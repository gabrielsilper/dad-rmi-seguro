package rmi.seguro.services;

import rmi.seguro.dao.SeguroDAO;
import rmi.seguro.models.Seguro;

public class SeguroService {
    private final SeguroDAO seguroDAO;

    public SeguroService() {
        this.seguroDAO = new SeguroDAO();
    }

    public Seguro pesquisaSeguro(String destino) {
        return seguroDAO.buscarPorDestino(destino);
    }
}
