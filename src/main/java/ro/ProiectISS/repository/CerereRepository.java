package ro.ProiectISS.repository;

import ro.ProiectISS.model.Cerere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CerereRepository extends JpaRepository<Cerere, Long> {

    Cerere findById(Long id);
    Cerere findByIdDoctor(String idDoctor);

}
