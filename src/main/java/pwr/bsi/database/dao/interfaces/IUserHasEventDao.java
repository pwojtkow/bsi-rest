package pwr.bsi.database.dao.interfaces;

import pwr.bsi.database.entities.UserHasEventEntity;

import java.util.List;

public interface IUserHasEventDao {
    List<UserHasEventEntity> getAllUserEvents(Integer userId);
    UserHasEventEntity getOne(Integer id);

}
