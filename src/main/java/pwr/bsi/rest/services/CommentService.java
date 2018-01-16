package pwr.bsi.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.bsi.database.dao.interfaces.ICommentDao;
import pwr.bsi.database.entities.CommentEntity;
import pwr.bsi.rest.services.interfaces.ICommentService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService implements ICommentService {

    @Autowired
    ICommentDao dao;

    @Override
    public List<CommentEntity> getAllEventsComments(Integer eventId) {
        List<CommentEntity> resultEntities = new ArrayList<>();
        List<CommentEntity> allComments = dao.getAllComments();
        for (CommentEntity entity : allComments) {
            Integer eventIdFromEntity = entity.getEventId();
            if(eventIdFromEntity.equals(eventId)) {
                resultEntities.add(entity);
            }
        }
        return resultEntities;
    }
}
