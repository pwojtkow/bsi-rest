package pwr.bsi.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pwr.bsi.database.entities.CityEntity;
import pwr.bsi.rest.services.interfaces.ICityService;

import java.util.List;

@RestController
@RequestMapping(path = "/cities")
public class CityController {

    @Autowired
    ICityService service;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<CityEntity>> getAllEvents() {
        List<CityEntity> allCities = service.getAllCities();
        if (allCities.isEmpty()) {
            return new ResponseEntity<List<CityEntity>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<CityEntity>>(allCities, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CityEntity> getEvent(@PathVariable("id") Integer id) {
        CityEntity city = service.getOne(id);
        if (city == null) {
            return new ResponseEntity<CityEntity>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<CityEntity>(city, HttpStatus.OK);
    }
}
