package se.bilting.jpasecond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OurMain implements CommandLineRunner {

    @Autowired
    ToyDAO dao;

    @Override
    public void run(String... args) throws Exception {

        System.out.println();
        System.out.println("   Jesus Christ is the Lord God Almighty    ");
        System.out.println();

        dao.save(new Toy("Deltamik", 40, 4));

        System.out.println("All toys   " + dao.findAll());
        System.out.println("Toys with price 50   " + dao.findByPrice(50));
        System.out.println("Toys for age 3   " + dao.findByAge(3));
        System.out.println("Toys with name Nalle  " + dao.findByName("Nalle"));
        dao.deleteById(4);
        System.out.println("All toys   " + dao.findAll());

    }
}
