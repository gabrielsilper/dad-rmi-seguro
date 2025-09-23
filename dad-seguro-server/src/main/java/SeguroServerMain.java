import rmi.seguro.servidor.SeguroManager;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SeguroServerMain {
    private final static int port = 2000;

    public static void main(String[] args) throws RemoteException {
        SeguroManager seguroManager = new SeguroManager();

        Registry registry = LocateRegistry.createRegistry(port);

        registry.rebind("rmi://localhost:" + port + "/seguros", seguroManager);

        System.out.println("Servidor RMI de seguros iniciado na porta " + port + "...");
    }
}
