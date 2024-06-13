package hello.jpql.jpql;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int price;
    private int stockAmount;

}
