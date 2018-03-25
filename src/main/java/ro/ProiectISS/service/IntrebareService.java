package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ProiectISS.model.Intrebare;
import ro.ProiectISS.repository.IntrebareRepository;


import java.util.List;

public class IntrebareService {
    private IntrebareRepository intrebareRepository;

    @Autowired
    public IntrebareService(IntrebareRepository intrebareRepository)
    {
        this.intrebareRepository = intrebareRepository;
    }

    public List<Intrebare> getAllQuestions()
    {
        List<Intrebare> listOfAllQuestions = intrebareRepository.findAll();

        return listOfAllQuestions;
    }
}
