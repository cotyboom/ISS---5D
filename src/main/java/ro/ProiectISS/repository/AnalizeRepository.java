package ro.ProiectISS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Analize;

import java.util.List;

// parametrii pentru JPA repo sunt Entitatea(Analize) si Long(pentru ca id-ul entitatii este de tip Long)
public interface AnalizeRepository extends JpaRepository<Analize, Long>
{
    //Am adaugat niste metode pentru find, da nu ii neaparat sa le folosim pe toate. Le-am pus doar aici.
    Analize findById(Long id);
    Analize findByDate(String dataAnaliza);
    Analize findByGrupaSangvina(String grupaSangvina);
    Analize findByRH(String rh);
    List<Analize> findByIdDonator(String id);
}