package edu.nf.test.testcity;

import com.github.pagehelper.PageInfo;
import edu.nf.bookshop.Service.CityService;
import edu.nf.bookshop.entity.City;
import org.junit.Test;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/11/26
 */
public class TestCity {
    @Test
    public void testListCity(){
        CityService service = new CityService();
        PageInfo<City> pageInfo = service.listCity(new City(),1,10);
        System.out.println("每页记录数："+pageInfo.getPageSize());
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("首页："+pageInfo.getNavigateFirstPage());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("尾页："+pageInfo.getNavigateLastPage());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("总记录数："+pageInfo.getTotal());
        //分页数据
        List<City> list = pageInfo.getList();
        list.forEach(city -> System.out.println(city.getName()));
    }
}