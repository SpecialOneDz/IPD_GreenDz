package dz.green.hibernate;

import dz.green.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Configuration Hibernate
        Configuration configuration = new Configuration();
        configuration.configure("dz/green/hibernate/hibernate.cfg.xml");
        // Create and Open session
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        //Faire appel au Model Admin, et instancier un objet
        Admin a = new Admin(2,"Ahmed Chawki","Chaouche","ahmed.chaouche@univ-constantine2.dz", LocalDate.of(1980, 6, 9),"M2STIC24", "0777112233","all");
        // Mapper l'objet Admin
        session.persist(a);
        tx.commit();





        session.close();
        sessionFactory.close();
    }
}
