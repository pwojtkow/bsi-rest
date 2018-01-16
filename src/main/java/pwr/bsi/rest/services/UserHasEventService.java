package pwr.bsi.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.bsi.database.dao.interfaces.IUserHasEventDao;
import pwr.bsi.database.entities.UserHasEventEntity;
import pwr.bsi.rest.services.interfaces.IUserHasEventService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserHasEventService implements IUserHasEventService {

    @Autowired
    IUserHasEventDao dao;

    @Override
    public List<UserHasEventEntity> getAllUserEvents(Integer userId) {
        List<UserHasEventEntity> resultEntities = new ArrayList<>();
        List<UserHasEventEntity> allUserEvents = dao.getAllUserEvents(userId);
        for (UserHasEventEntity entity : allUserEvents) {
            Integer userUserId = entity.getUserUserId();
            if (userUserId.equals(userId)) {
                resultEntities.add(entity);
            }
        }
        return resultEntities;
    }

    @Override
    public UserHasEventEntity getOne(Integer id) {
        return dao.getOne(id);
    }
}
