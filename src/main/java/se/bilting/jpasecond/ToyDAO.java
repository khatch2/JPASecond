package se.bilting.jpasecond;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToyDAO extends JpaRepository<Toy, Integer> {
    List<Toy> findByPrice(int i);

    List<Toy> findByAge(int i);

    List<Toy> findByName(String name);
}
