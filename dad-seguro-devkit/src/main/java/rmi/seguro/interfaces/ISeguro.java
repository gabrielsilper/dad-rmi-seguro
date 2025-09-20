package rmi.seguro.interfaces;

import rmi.seguro.models.Seguro;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISeguro extends Remote {
    public Seguro pesquisaSeguro(String destino) throws RemoteException;
}
