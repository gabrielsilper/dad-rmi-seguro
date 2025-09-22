import rmi.seguro.dao.SeguroDAO;

public class SeguroServerMain {
    public static void main(String[] args) {
        SeguroDAO seguroDAO = new SeguroDAO();

        System.out.println("Listando todos os seguros:");
        seguroDAO.listarTodos().forEach(System.out::println);
    }
}
