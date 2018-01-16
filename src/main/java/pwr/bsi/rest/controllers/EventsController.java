package pwr.bsi.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pwr.bsi.database.entities.CommentEntity;
import pwr.bsi.database.entities.EventEntity;
import pwr.bsi.rest.services.interfaces.ICommentService;
import pwr.bsi.rest.services.interfaces.IEventService;

import java.util.List;

@RestController
@RequestMapping(path = "/events")
public class EventsController {

    //TODO:SQL injection secure need to be added

    @Autowired
    private IEventService eventService;

    @Autowired
    private ICommentService commentService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<EventEntity>> getAllEvents() {
        List<EventEntity> allEvents = eventService.getAllEvents();
        if (allEvents.isEmpty()) {
            return new ResponseEntity<List<EventEntity>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<EventEntity>>(allEvents, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<EventEntity> getEvent(@PathVariable("id") Integer id) {
        EventEntity event = eventService.getOne(id);
        if (event == null) {
            return new ResponseEntity<EventEntity>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<EventEntity>(event, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}/comments", method = RequestMethod.GET)
    public ResponseEntity<List<CommentEntity>> getAllCommentsForEvent(@PathVariable("id") Integer eventId) {
        List<CommentEntity> allEventsComments = commentService.getAllEventsComments(eventId);
        if (allEventsComments.isEmpty()) {
            return new ResponseEntity<List<CommentEntity>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<CommentEntity>>(allEventsComments, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}/delete", method = RequestMethod.POST)
    public ResponseEntity<EventEntity> deleteEvent(@PathVariable("id") Integer eventId) {
        EventEntity eventEntity = eventService.deleteEvent(eventId);
        if (eventEntity == null) {
            return new ResponseEntity<EventEntity>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<EventEntity>(eventEntity, HttpStatus.OK);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public ResponseEntity<EventEntity> createEvent(@RequestBody EventEntity eventEntity) {
        List<Integer> allEventIds = eventService.getAllEventsIds();
        if (allEventIds.contains(eventEntity.getEventId())) {
            return new ResponseEntity<EventEntity>(HttpStatus.CONFLICT);
        }
        EventEntity addedEvent = eventService.create(eventEntity);
        return new ResponseEntity<EventEntity>(addedEvent, HttpStatus.OK);
    }
}
