package pwr.bsi.database.dao;

import org.springframework.stereotype.Repository;
import pwr.bsi.database.entities.EventEntity;

@Repository
public class EventDao extends AbstractDao<EventEntity, Long> implements IEventDao {

}
