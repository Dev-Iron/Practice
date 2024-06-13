package hellojpa;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member member = new Member();
            member.setUsername("member");
            em.persist(member);


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
//            Team team = new Team();
//            team.setName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setTeam(team);
//            em.persist(member);
//
//            Member findMember = em.find(Member.class, member.getId());

//            Team findTeam = findMember.getTeam();

//            List<Member> members = findMember.getTeam().getMembers();
//
//            for (Member m : members) {
//                System.out.println("m = " + m.getUsername());
//            }

//            System.out.println("findMember = " + findMember.getUsername());
//            System.out.println("findTeam = " + findTeam.getName());

            // 섹션 9 값 타입 비교
            // 값 타입의 항목 중 하나를 변경하고 싶다면,
            // 그 개별 항목 하나 교체가 아닌, 전체적인 항목을 교체해주어야 한다.

            // homeCity -> newCity
//            findMember.getAddressesHistory().setCity("newCity");  XXX

//            Address a = findMember.getHomeAddress();
//            findMember.setHomeAddress(new Address("newCity", a.getStreet(), a.getZipcode())); OOO

            // 치킨 -> 한식
//            findMember.getFavoriteFoods().remove("치킨");
//            findMember.getFavoriteFoods().add("한식");

            // String은 update가 안됌. 전체적인 항목 교체를 해주어야 함.

//            findMember.getAddressesHistory().remove(new Address("old1", "street", "10000"));
//            findMember.getAddressesHistory().add(new Address("newCity1", "street", "10000"));

//            List<Address> addressesHistory = findMember.getAddressesHistory();
//            for (Address address : addressesHistory) {
//                System.out.println("address = " + address.getCity());
//            }
//
//            Set<String> favoriteFoods = findMember.getFavoriteFoods();
//            for (String favoriteFood : favoriteFoods) {
//                System.out.println("favoriteFood = " + favoriteFood);
//            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
}
