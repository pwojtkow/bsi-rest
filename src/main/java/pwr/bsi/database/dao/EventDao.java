package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import pwr.bsi.database.entities.EventEntity;

import javax.persistence.EntityManagerFactory;

@Repository
public class EventDao extends AbstractDao<EventEntity, Long> implements IEventDao {

    public EventDao(EntityManagerFactory emf) {
        super(emf);
    }
}
