package pwr.bsi.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/events")
public class EventsController {

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String getAllEvents() {

    }

}
