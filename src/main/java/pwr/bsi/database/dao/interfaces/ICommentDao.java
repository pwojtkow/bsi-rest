package pwr.bsi.database.dao.interfaces;

import pwr.bsi.database.entities.CommentEntity;

import java.util.List;

public interface ICommentDao {

    List<CommentEntity> getAllComments();

}
