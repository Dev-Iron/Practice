package jpabook.jpashop.domain;

import jpabook.jpashop.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

//            Order order = new Order();
//            order.addOrderItem(new OrderItem());
//
//            OrderItem orderItem = new OrderItem();
//            orderItem.setOrder(order);

//            em.persist(orderItem);

            Member member = new Member();
            member.setName("USER1");

            em.persist(member);


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}





