package henu.serviceimpl;

import henu.dao.Daydao;
import henu.entity.DaysStat;
import henu.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanliming
 * @create 2019-11-26 21:09
 */

@Service
public class DayServiceImpl implements DayService {
    //注入dao层
    @Autowired
    public  Daydao daydao;

    @Override
    public List<DaysStat> queryAll() {
        return daydao.queryAll();
    }

    @Override
    public List<DaysStat> queryByday(String day) {
        return daydao.queryByday(day);
    }

    @Override
    public List<DaysStat> queryDayplus(int day) {
        return daydao.queryDayplus(day);
    }
}

