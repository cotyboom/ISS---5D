package ro.ProiectISS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Personal;

public interface PersonalRepository  extends JpaRepository<Personal, Long> {

    Personal findById(Long id);
    Personal findByNume(String nume);
}
