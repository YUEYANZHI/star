package com.design.pattern.strategy.multiplePattern.StrategyPattern;

import com.design.pattern.strategy.multiplePattern.StrategyPattern.DuckCall;

/**
 * @author yueyz
 * @date 2021-12-05-19:26
 */
public class DuckCallDuck implements DuckCall {
    @Override
    public void duckCall() {
        System.out.println("猎人用鸭鸣器模仿了鸭叫声");
    }
}
