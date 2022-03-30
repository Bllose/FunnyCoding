package com.bllose.interfaceRelevant.example1;

public class SpecificClass {
    private String parameter;

    public void shouldBeImplemented(String params){
        System.out.println("通过实现当前接口方法， 实现了自己的逻辑");
        parameter = params;
    }

    public void specificFunctions(){
        System.out.println("这是自己特定的方法， 用来实现特定的任务, 该任务以来外来参数: " + parameter);
    }
}
