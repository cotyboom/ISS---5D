package ro.ProiectISS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Intrebare;
import ro.ProiectISS.service.IntrebareService;


import java.util.List;

@RestController
@RequestMapping(value = "/intrebare")
public class IntrebareController {

    private IntrebareService intrebareService;

    @Autowired
    public IntrebareController(IntrebareService intrebareService)
    {
        this.intrebareService = intrebareService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Intrebare> getAll()
    {
        List<Intrebare> intrebareList = intrebareService.getAllQuestions();

        return intrebareList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Intrebare intrebare)
    {
        intrebareService.createQuestion(intrebare);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Intrebare getById(@PathVariable Long id)
    {
        Intrebare intrebare = intrebareService.getById(id);

        return intrebare;
    }

}