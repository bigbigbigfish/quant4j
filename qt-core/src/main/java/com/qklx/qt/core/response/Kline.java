package com.qklx.qt.core.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author yang
 * @Date 2018/1/14
 * @Time 11:35
 * kline
 */
@Data
public class Kline {
    private long id;
    private Double amount;
    private int count;
    private Double open;
    private Double close;
    private Double low;
    private Double high;
    private Double vol;

}
