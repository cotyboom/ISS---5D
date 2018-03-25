package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ProiectISS.model.Personal;
import ro.ProiectISS.repository.PersonalRepository;

import java.util.List;

public class PersonalService {
    private PersonalRepository personalRepository;

    @Autowired
    public PersonalService(PersonalRepository personalRepository)
    {
        this.personalRepository = personalRepository;
    }

    public List<Personal> getAllPersonal()
    {
        List<Personal> listOfAllPersonal = personalRepository.findAll();

        return listOfAllPersonal;
    }
}
