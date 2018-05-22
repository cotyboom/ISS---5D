package ro.ProiectISS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Stoc;

import java.util.List;

public interface StocRepository extends JpaRepository<Stoc, Long> {

    Stoc findById(Long id);
    List<Stoc> findByGrupa(String grupa);

}