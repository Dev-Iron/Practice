package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {


//            JPQL
//            1. 테이블이 아닌 객체를 대사응로 검색하는 객체 지향 쿼리
//            2. SQL을 추상화해서 특정 데이터베이스 SQL에 의존 X
//            3. JPQL을 한마디로 정의하면 객체 지향 SQL
//            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
//            for(Member member : result){
//                System.out.println("member.name = " + member.getName());
//            }

//      저장
//        Member member = new Member();
//        member.setId(2L);
//        member.setName("HelloB");
//        em.persist(member);

//      찾기
//        Member findMember = em.find(Member.class, 1L);
//        System.out.println("findMember.id = " + findMember.getId());
//        System.out.println("findMember.name = " + findMember.getName());

//      삭제
//        Member findMember = em.find(Member.class, 1L);
//        em.remove(findMember);

//      수정
//          Member findMember = em.find(Member.class, 1L);
//          findMember.setName("HelloJPA");

//       비영속
//        Member member = new Member();
//        member.setId(100L);
//        member.setName("HelloJPA");

//       영속
//        System.out.println("=== BEFORE ===");
//        em.persist(member);
//        System.out.println("=== AFTER ===");


//            섹션5
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            member.setTeam(team);
            em.persist(member);

            Member findMember = em.find(Member.class, member.getId());

//            Team findTeam = findMember.getTeam();

            List<Member> members = findMember.getTeam().getMembers();

            for (Member m : members) {
                System.out.println("m = " + m.getUsername());
            }

//            System.out.println("findMember = " + findMember.getUsername());
//            System.out.println("findTeam = " + findTeam.getName());

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
