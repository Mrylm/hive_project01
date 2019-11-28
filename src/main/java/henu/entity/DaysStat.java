package henu.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author yanliming
 * @create 2019-11-26 20:58
 */
public class DaysStat {
    private Integer value;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date statdate;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getStatdate() {
        return statdate;
    }

    public void setStatdate(Date statdate) {
        this.statdate = statdate;
    }

}

