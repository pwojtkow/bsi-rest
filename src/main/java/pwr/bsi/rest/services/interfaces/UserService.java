package pwr.bsi.rest.services.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import pwr.bsi.database.dao.interfaces.IUserDao;
import pwr.bsi.database.entities.UserEntity;

import java.util.List;

public class UserService implements IUserService {

    @Autowired
    IUserDao dao;

    @Override
    public List<UserEntity> getAllUsers() {
        return dao.findAll();
    }

    @Override
    public UserEntity getOne(Integer id) {
        return dao.getOne(id);
    }



}
