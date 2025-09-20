package rmi.seguro.servidor;

import rmi.seguro.interfaces.ISeguro;
import rmi.seguro.models.Seguro;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SeguroManager extends UnicastRemoteObject implements ISeguro {
    protected SeguroManager() throws RemoteException {
        super();
    }

    @Override
    public Seguro pesquisaSeguro(String s) throws RemoteException {
        return null;
    }
}
