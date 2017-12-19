package pwr.bsi.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pwr.bsi.database.entities.EventEntity;
import pwr.bsi.rest.services.EventService;

import java.util.List;

@RestController
@RequestMapping(path = "/events")
public class EventsController {

    @Autowired
    private EventService service;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<EventEntity> getAllEvents() {
        return service.getAllEvents();
    }

}
