package henu.controller;

import henu.entity.DaysStat;
import henu.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @create 2019-11-26 21:26
 */
@Controller
public class DayController {
    @Autowired
    public DayService dayService;

    //查询全部
    @RequestMapping("/update")
    @ResponseBody
    public List<DaysStat> queryAll(){
        return dayService.queryAll();
    }
    //查询日期
    @RequestMapping("/query")
    @ResponseBody
    public List<DaysStat> queryByDay(@RequestParam("statdate")String statdate){
        return dayService.queryByday(statdate);
    }

    //查询日期
    @RequestMapping("/querymore")
    @ResponseBody
    public List<DaysStat> queryDay(@RequestParam("date")int date){
        return dayService.queryDayplus(date);
    }

}

