package edu.nf.bookshop.Service;

import com.github.pagehelper.PageInfo;
import edu.nf.bookshop.dao.CityDao;
import edu.nf.bookshop.dao.imlp.CityDaoImlp;
import edu.nf.bookshop.entity.City;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/11/26
 */
public class CityService {
    public PageInfo<City> listCity(City city, Integer pageName, Integer pageSize){
        CityDao cityDao = new CityDaoImlp();
        List<City> list = cityDao.listCity(city, pageName, pageSize);
        PageInfo<City> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}