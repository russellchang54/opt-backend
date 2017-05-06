package com.aek56.platform.system.api.service;


import java.util.Map;

/**
 * 汇率接口
 *
 * @author zj@aek56.com
 */
@FunctionalInterface
public interface ICurrencyRateService {

    /**
     * 获得当前USD->币种汇率
     *
     * @return Map rate
     */
    Map<String, String> getRate();

}
