package pwr.bsi.rest.services;

import pwr.bsi.database.entities.EventEntity;

import java.util.List;

public interface IEventService {

    List<EventEntity> getAllEvents();
    EventEntity getOne(Integer id);
    //TODO: Add additional features

}
