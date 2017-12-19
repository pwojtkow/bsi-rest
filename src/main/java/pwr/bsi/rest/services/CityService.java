package pwr.bsi.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.bsi.database.dao.CityDao;
import pwr.bsi.database.entities.CityEntity;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    CityDao dao;

    @Override
    public List<CityEntity> getAllCities() {
        return dao.getCities();
    }

    @Override
    public CityEntity getOne(Integer id) {
        return dao.getCity(id);
    }
}
