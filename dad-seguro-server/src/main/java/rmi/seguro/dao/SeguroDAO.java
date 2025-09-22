package rmi.seguro.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import rmi.seguro.entities.SeguroEntity;
import rmi.seguro.utils.HibernateUtil;

import java.util.List;

public class SeguroDAO {
    public List<SeguroEntity> listarTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<SeguroEntity> query = session.createQuery("FROM SeguroEntity", SeguroEntity.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<SeguroEntity> buscarPorDestino(String destino) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<SeguroEntity> query = session.createQuery(
                    "FROM SeguroEntity WHERE destino LIKE :destino",
                    SeguroEntity.class);
            query.setParameter("destino", "%" + destino + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
