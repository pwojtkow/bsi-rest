package pwr.bsi.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<List<EventEntity>> getAllEvents() {
        List<EventEntity> allEvents = service.getAllEvents();
        if (allEvents.isEmpty()) {
            return new ResponseEntity<List<EventEntity>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<EventEntity>>(allEvents, HttpStatus.OK);
    }

    @RequestMapping(path = "/event/{id}", method = RequestMethod.GET)
    public ResponseEntity<EventEntity> getEvent(@PathVariable("id") Integer id) {
        EventEntity event = service.getOne(id);
        if (event == null) {
            return new ResponseEntity<EventEntity>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<EventEntity>(event, HttpStatus.OK);
    }

}
