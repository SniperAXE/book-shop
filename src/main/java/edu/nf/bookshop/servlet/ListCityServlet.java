package edu.nf.bookshop.servlet;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import edu.nf.bookshop.Service.CityService;
import edu.nf.bookshop.dao.CityDao;
import edu.nf.bookshop.entity.City;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**

/**
 * @author Administrator
 * @date 2020/11/26
 */
@WebServlet("/list_city")
public class ListCityServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cityName = req.getParameter("cityName");
        String province = req.getParameter("province");
        City city = new City();
        city.setName(cityName);
        city.setProvince(province);

        Integer pageNum = Integer.valueOf(req.getParameter("pageNum"));
        Integer pageSize = Integer.valueOf(req.getParameter("pageSize"));
        //创建业务层对象
        CityService cityService = new CityService();
        PageInfo<City> pageInfo = cityService.listCity(city,pageNum,pageSize);
        String json = new Gson().toJson(pageInfo);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}