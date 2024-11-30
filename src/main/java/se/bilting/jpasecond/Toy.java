package se.bilting.jpasecond;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Toy {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int pk; // primary key

    private String name;
    private int price;
    private int age; // minimum age

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Toy{" +
                "pk=" + pk +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    public Toy( String name, int price, int age) {
        this.age = age;
        this.price = price;
        this.name = name;
    }

    public Toy() {
    }

}
