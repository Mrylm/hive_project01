package henu.service;

import henu.entity.DaysStat;

import java.util.List;

/**
 * @author yanliming
 * @create 2019-11-26 21:08
 */

public interface DayService {
    public List<DaysStat> queryAll();
    public List<DaysStat> queryByday(String day);
    public List<DaysStat> queryDayplus(int day);
}
