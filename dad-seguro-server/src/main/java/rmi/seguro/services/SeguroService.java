package rmi.seguro.services;

import rmi.seguro.dao.SeguroDAO;
import rmi.seguro.entities.SeguroEntity;
import rmi.seguro.models.Seguro;

import java.util.List;

public class SeguroService {
    private final SeguroDAO seguroDAO;

    public SeguroService() {
        this.seguroDAO = new SeguroDAO();
    }

    public List<Seguro> listaSeguros() {
        List<SeguroEntity> seguroEntities = seguroDAO.listarTodos();

        return seguroEntities.stream().map(SeguroEntity::toSeguro).toList();
    }

    public Seguro pesquisaSeguro(int destino) {
        SeguroEntity seguroEntity = seguroDAO.buscarPorDestino(destino);

        if (seguroEntity == null) {
            return null;
        }

        return seguroEntity.toSeguro();
    }
}
