package pwr.bsi.database.dao.interfaces;

import pwr.bsi.database.entities.EventEntity;

import java.util.List;

//public interface IEventDao extends IDao<EventEntity, Long> {
public interface IEventDao {
    List<EventEntity> findAll();
    EventEntity getOne(Integer id);
    EventEntity create(EventEntity event);
    EventEntity delete(Integer id);
}
