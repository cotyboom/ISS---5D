package ro.ProiectISS.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Analize;
import ro.ProiectISS.service.AnalizeService;

import java.util.List;

@RestController
@RequestMapping(value = "/analize")
public class AnalizeController {

    private AnalizeService analizeService;

    @Autowired
    public AnalizeController(AnalizeService analizeService)
    {
        this.analizeService = analizeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Analize> getAll()
    {
        List<Analize> analizeList = analizeService.getAllAnalize();

        return analizeList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Analize analize)
    {
        analizeService.createAnalize(analize);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Analize getById(@PathVariable Long id)
    {
        Analize analize = analizeService.getById(id);

        return analize;
    }

}
