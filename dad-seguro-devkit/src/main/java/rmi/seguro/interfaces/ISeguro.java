package rmi.seguro.interfaces;

import rmi.seguro.models.Seguro;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ISeguro extends Remote {
    public List<Seguro> listaSeguros() throws RemoteException;
    public Seguro pesquisaSeguro(int codigoIBGE) throws RemoteException;
}
