package edu.nf.bookshop.dao.imlp;

import edu.nf.bookshop.dao.CityDao;
import edu.nf.bookshop.entity.City;
import edu.nf.bookshop.util.CityUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: hjl
 * @Date: 2020/11/26 8:59
 */
public class CityDaoImlp implements CityDao {
    @Override
    public List<City> listCity(City city, Integer pageNum, Integer pageSize) {
        try(SqlSession sqlSession = CityUtil.getSession(true)){
            return sqlSession.getMapper(CityDao.class).listCity(city, pageNum, pageSize);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
