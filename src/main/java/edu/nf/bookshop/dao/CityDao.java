package edu.nf.bookshop.dao;

import edu.nf.bookshop.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: hjl
 * @Date: 2020/11/26 8:49
 */
public interface CityDao {
    List<City> listCity(@Param("city")City city,
                        @Param("pageNum")Integer pageNum,
                        @Param("pageSize")Integer pageSize);

}
