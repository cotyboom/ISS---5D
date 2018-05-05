package ro.ProiectISS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.model.Formular;

import java.util.Date;

// parametrii pentru JPA repo sunt Entitatea(Formular) si Long(pentru ca id-ul entitatii este de tip Long)
public interface FormularRepository extends JpaRepository<Formular, Long>
{
    Formular findById(Long id);
    Formular findByDate(Date dataDonare);
}
