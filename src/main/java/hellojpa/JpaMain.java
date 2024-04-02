package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {
            //1. insert
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("AAA");
//            System.out.println("=========");
//            em.persist(member);
//            System.out.println("=========");

            //2. select
//            Member member = em.find(Member.class, 1L);
//
//            System.out.println("member.getName() = " + member.getName());

            //3. update
//            Member member = em.find(Member.class, 1L);
//            member.setName("BBB");
//
//            em.persist(member);

            //4. delete
//            Member member = em.find(Member.class, 1L);
//
//            System.out.println("=========");
//            em.remove(member);
//            System.out.println("=========");

            tx.commit();
        } catch(Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
