package pwr.bsi.rest.services.interfaces;

import pwr.bsi.database.entities.UserHasEventEntity;

import java.util.List;

public interface IUserHasEventService {

    List<UserHasEventEntity> getAllUserEvents(Integer userId);
    UserHasEventEntity getOne(Integer id);

}
