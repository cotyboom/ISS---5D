package ro.ProiectISS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Intrebare;

public interface IntrebareRepository extends JpaRepository<Intrebare, Long> {

    Intrebare findById(Long id);
    Intrebare findByDescriere(String descriere);
}
