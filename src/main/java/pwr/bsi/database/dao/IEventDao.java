package pwr.bsi.database.dao;

import pwr.bsi.database.entities.EventEntity;

import java.util.List;

//public interface IEventDao extends IDao<EventEntity, Long> {
public interface IEventDao {
    List<EventEntity> findAll();
    EventEntity getOne(Integer id);

}
