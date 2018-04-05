package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Intrebare;
import ro.ProiectISS.repository.IntrebareRepository;


import java.util.List;

@Service
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

    public void createQuestion(Intrebare intrebare)
    {
        intrebareRepository.save(intrebare);
    }

    public Intrebare getById(Long id) {
        return intrebareRepository.findById(id);
    }
}
