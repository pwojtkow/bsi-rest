package pwr.bsi.rest.services.interfaces;

import pwr.bsi.database.entities.CommentEntity;

import java.util.List;

public interface ICommentService {

    List<CommentEntity> getAllEventsComments(Integer eventId);

}
