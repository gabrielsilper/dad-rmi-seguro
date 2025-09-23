package rmi.seguro.servidor;

import rmi.seguro.interfaces.ISeguro;
import rmi.seguro.models.Seguro;
import rmi.seguro.services.SeguroService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SeguroManager extends UnicastRemoteObject implements ISeguro {
    private final SeguroService seguroService;

    public SeguroManager() throws RemoteException {
        super();
        this.seguroService = new SeguroService();
    }

    @Override
    public Seguro pesquisaSeguro(String destino) throws RemoteException {
        return seguroService.pesquisaSeguro(destino);
    }
}
