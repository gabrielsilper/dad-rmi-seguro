package rmi.seguro.servidor;

import rmi.seguro.interfaces.ISeguro;
import rmi.seguro.models.Seguro;
import rmi.seguro.services.SeguroService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class SeguroManager extends UnicastRemoteObject implements ISeguro {
    private final SeguroService seguroService;

    public SeguroManager() throws RemoteException {
        super();
        this.seguroService = new SeguroService();
    }

    @Override
    public List<Seguro> listaSeguros() throws RemoteException {
        return seguroService.listaSeguros();
    }

    @Override
    public Seguro pesquisaSeguro(int destino) throws RemoteException {
        return seguroService.pesquisaSeguro(destino);
    }
}
