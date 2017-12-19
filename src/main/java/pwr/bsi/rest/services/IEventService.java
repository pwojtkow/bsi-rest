package pwr.bsi.rest.services;

import pwr.bsi.database.entities.EventEntity;

import java.util.List;

public interface IEventService {

    List<EventEntity> getAllEvents();
    EventEntity getOne(Long id);
    //TODO: Add additional features

}
