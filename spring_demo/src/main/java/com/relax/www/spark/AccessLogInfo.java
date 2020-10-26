package com.relax.www.spark;

import java.io.Serializable;

/**
 * @author wusong
 * @create 2018-01-19 15:23
 **/
public class AccessLogInfo implements Serializable {
    private static final long serialVersionUID = 7247714666080613254L;
    private Long timeStramp;
    private Long upTraffic;
    private Long downTraffic;

    public AccessLogInfo(Long timeStramp, Long upTraffic, Long downTraffic) {
        this.timeStramp = timeStramp;
        this.upTraffic = upTraffic;
        this.downTraffic = downTraffic;
    }

    public Long getTimeStramp() {
        return timeStramp;
    }

    public void setTimeStramp(Long timeStramp) {
        this.timeStramp = timeStramp;
    }

    public Long getUpTraffic() {
        return upTraffic;
    }

    public void setUpTraffic(Long upTraffic) {
        this.upTraffic = upTraffic;
    }

    public Long getDownTraffic() {
        return downTraffic;
    }

    public void setDownTraffic(Long downTraffic) {
        this.downTraffic = downTraffic;
    }
}
