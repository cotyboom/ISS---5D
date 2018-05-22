package ro.ProiectISS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Stoc;
import ro.ProiectISS.service.StocService;

import java.util.List;

@RestController
@RequestMapping(value = "/stoc")
public class StocController {

    private StocService stocService;

    @Autowired
    public StocController(StocService stocService)
    {
        this.stocService = stocService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Stoc> getAll()
    {
        List<Stoc> stocList = stocService.getAllStocks();

        return stocList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Stoc stoc)
    {
        stocService.createStoc(stoc);
    }
    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Stoc getById(@PathVariable Long id) {
        Stoc stoc = stocService.getById(id);

        return stoc;
    }

    @RequestMapping(value = "/getByGrupa/{gr}", method = RequestMethod.GET)

    public List<Stoc> getById(@PathVariable String gr) {
        List<Stoc> stoc = stocService.getByGr(gr);

        return stoc;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public void update(@PathVariable Long id, @RequestBody Stoc stoc)
    {
        stocService.update(id, stoc);
    }
}