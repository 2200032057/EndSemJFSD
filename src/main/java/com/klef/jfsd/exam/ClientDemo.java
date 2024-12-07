package com.klef.jfsd.exam;

package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        try {
            session.beginTransaction();

            // Insert Device
            Device device = new Device("Samsung", "Galaxy A12", 15000);
            session.save(device);

            // Insert Smartphone
            Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 80000, "iOS", "12MP");
            session.save(smartphone);

            // Insert Tablet
            Tablet tablet = new Tablet("Lenovo", "Tab P11", 30000, "11 inches", 15);
            session.save(tablet);

            session.getTransaction().commit();
            System.out.println("Records inserted successfully!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
