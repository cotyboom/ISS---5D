package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Personal;
import ro.ProiectISS.repository.PersonalRepository;

import java.util.List;

@Service
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

    public void createPersonal(Personal personal)
    {
        personalRepository.save(personal);
    }

    public Personal getById(Long id) {
        return personalRepository.findById(id);
    }
}
