package pwr.bsi.rest.services.interfaces;

import pwr.bsi.database.entities.EventEntity;

import java.util.List;

public interface IEventService {

    List<EventEntity> getAllEvents();
    EventEntity getOne(Integer id);
    EventEntity create(EventEntity event);
    EventEntity deleteEvent(Integer eventId);

    List<Integer> getAllEventsIds();
    //TODO: Add additional features

}
