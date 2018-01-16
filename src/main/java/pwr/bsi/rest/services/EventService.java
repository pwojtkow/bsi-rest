package pwr.bsi.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.bsi.database.dao.interfaces.IEventDao;
import pwr.bsi.database.entities.EventEntity;
import pwr.bsi.rest.services.interfaces.IEventService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventService {

    @Autowired
    IEventDao dao;

    @Override
    public List<EventEntity> getAllEvents() {
        return dao.findAll();
    }

    @Override
    public EventEntity getOne(Integer id) {
        return dao.getOne(id);
    }

    @Override
    public EventEntity create(EventEntity event) {
        return dao.create(event);
    }

    @Override
    public EventEntity deleteEvent(Integer id) {
        return dao.delete(id);
    }

    @Override
    public List<Integer> getAllEventsIds() {
        List<Integer> allIds = new ArrayList<>();
        List<EventEntity> allEvents = getAllEvents();
        for (EventEntity event : allEvents) {
            allIds.add(event.getEventId());
        }

        return allIds;
    }

}
