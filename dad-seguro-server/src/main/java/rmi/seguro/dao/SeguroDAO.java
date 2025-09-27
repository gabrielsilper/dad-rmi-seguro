package rmi.seguro.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import rmi.seguro.entities.SeguroEntity;
import rmi.seguro.utils.HibernateUtil;

import java.util.List;

public class SeguroDAO {
    public List<SeguroEntity> listarTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createNativeQuery(
                    "SELECT * FROM seguros",
                    SeguroEntity.class
            ).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public SeguroEntity buscarPorDestino(String codigo) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<SeguroEntity> query = session.createNativeQuery(
                    "SELECT * FROM seguros WHERE codigo_ibge = :destino",
                    SeguroEntity.class);
            query.setParameter("destino", destino);
            return query.getResultList().stream().findFirst().orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
