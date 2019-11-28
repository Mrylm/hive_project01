package henu.dao;

import henu.entity.DaysStat;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yanliming
 * @create 2019-11-26 21:04
 */
@Repository
public interface Daydao {
    public List<DaysStat> queryAll();
    public List<DaysStat> queryByday(String day);
    public List<DaysStat> queryDayplus(int day);
}

