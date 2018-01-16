package pwr.bsi.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pwr.bsi.database.entities.UserHasEventEntity;
import pwr.bsi.rest.services.interfaces.IUserHasEventService;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    IUserHasEventService service;

    @RequestMapping(path= "/{id}/events", method = RequestMethod.GET)
    public ResponseEntity<List<UserHasEventEntity>> getAllUserEvents(@PathVariable("id") Integer userId) {
        List<UserHasEventEntity> allUserEvents = service.getAllUserEvents(userId);
        if (allUserEvents.isEmpty()) {
            return new ResponseEntity<List<UserHasEventEntity>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<UserHasEventEntity>>(allUserEvents, HttpStatus.OK);
    }

}
