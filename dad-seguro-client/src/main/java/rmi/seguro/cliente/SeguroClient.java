package rmi.seguro.cliente;

import rmi.seguro.interfaces.ISeguro;
import rmi.seguro.models.Seguro;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SeguroClient {

    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 2000);
            ISeguro seguroRemote = (ISeguro) registro.lookup("rmi://localhost:" + 2000 + "/seguros");

            System.out.println("Cliente conectado ao Servidor RMI na porta " + 2000 + ".");
            String destinoDesejado = "Manaus";
            System.out.println("Buscando seguro para o destino: " + destinoDesejado + "...");

            Seguro seguroResultado = seguroRemote.pesquisaSeguro(destinoDesejado);

            if (seguroResultado != null) {
                System.out.println("--- Dados do Seguro Encontrado ---");
                System.out.println("Destino: " + seguroResultado.getDestino());
                System.out.println("Valor: R$" + seguroResultado.getValor());
                System.out.println("---------------------------------");
            } else {
                System.out.println("Nenhum seguro encontrado para o destino: " + destinoDesejado);
            }

        } catch (Exception e) {
            System.err.println("ERRO CRÍTICO na comunicação RMI:");
            System.err.println("Verifique se o servidor RMI está ativo.");
            e.printStackTrace();
        }
    }
}