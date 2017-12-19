package pwr.bsi.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.bsi.database.dao.IEventDao;
import pwr.bsi.database.entities.EventEntity;

import java.util.List;

@Service
public class EventService implements IEventService{

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

}
