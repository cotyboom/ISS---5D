package ro.ProiectISS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Doctor;

// parametrii pentru JPA repo sunt Entitatea(Doctor) si Long(pentru ca id-ul entitatii este de tip Long)
public interface DoctorRepository extends JpaRepository<Doctor, Long>
{
    // le lasam astea deocamdata si cand ne vedem hotaram ce alte functii sa aiba
    Doctor findById(Long id);
    Doctor findByNume(String nume);
}
