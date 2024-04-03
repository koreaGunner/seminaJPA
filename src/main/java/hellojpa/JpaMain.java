package hellojpa;

import jakarta.persistence.*;

import java.util.List;

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
//            member.setId(4L);
//            member.setName("AAA");
//            System.out.println("=========");
//            em.persist(member);
//            System.out.println("=========");

            //1-1
//            Member member1 = new Member();
//            member1.setId(5L);
//            member1.setName("CCC");
//            em.persist(member);
//            em.persist(member1);

            //2. select
//            Member member = em.find(Member.class, 1L);
//
//            System.out.println("member.getName() = " + member.getName());

            //3. update
//            Member member = em.find(Member.class, 2L);
//            member.setName("BBB");
//
//            em.persist(member);

            //4. delete
//            Member member = em.find(Member.class, 1L);
//
//            System.out.println("=========");
//            em.remove(member);
//            System.out.println("=========");

            //5. select list
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//            //페이지네이션
//                    .setFirstResult(0)
//                    .setMaxResults(8)
//                    .getResultList();
//            for (Member member : result) {
//                System.out.println("member.getName() = " + member.getName());
//            }
            
            //6. 동일성 보장
//            Member member = em.find(Member.class, 1L);
//            Member member1 = em.find(Member.class, 1L);
//
//            System.out.println(member == member1);

            tx.commit();
        } catch(Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
