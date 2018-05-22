package ro.ProiectISS.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Cerere;
import ro.ProiectISS.service.CerereService;

import java.util.List;

@RestController
@RequestMapping(value = "/cerere")
public class CerereController {

    private CerereService cerereService;

    @Autowired
    public CerereController(CerereService cerereService)
    {
        this.cerereService = cerereService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Cerere> getAll()
    {
        List<Cerere> cerereList = cerereService.getAllStocks();

        return cerereList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Cerere cerere)
    {
        cerereService.createCerere(cerere);
    }
    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Cerere getById(@PathVariable Long id) {
        Cerere cerere = cerereService.getById(id);

        return cerere;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public void update(@PathVariable Long id, @RequestBody Cerere programare)
    {
        cerereService.update(id, programare);
    }
}
