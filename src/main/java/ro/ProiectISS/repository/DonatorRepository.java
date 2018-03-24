package ro.ProiectISS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Donator;

// parametrii pentru JPA repo sunt Entitatea(Donator) si Long(pentru ca id-ul entitatii este de tip Long)
public interface DonatorRepository extends JpaRepository<Donator, Long>
{
    Donator findById(Long id);
    Donator findByNume(String nume);
}
