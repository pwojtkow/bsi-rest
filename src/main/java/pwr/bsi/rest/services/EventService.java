package pwr.bsi.rest.services;

import org.springframework.stereotype.Service;
import pwr.bsi.database.entities.EventEntity;

import java.util.List;

@Service
public class EventService implements IEventService{


    public List<EventEntity> getAllEvents() {
        return null;
    }

    @Override
    public EventEntity getOne(Long id) {
        return null;
    }

}
