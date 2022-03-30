package com.bllose.interfaceRelevant.example1;

public interface TopInterface {

    default void aggreegateFunctionEntry(String params){
        System.out.println("执行某些都需要执行的逻辑, 然后将处理过后的参数传递给需要被实现的方法中。");

        String beHanldedParams = "beHanldedParams";
        System.out.println("接收到请求参数：" + params + "; 通过逻辑处理获取调用其他类实现方法的参数：" + beHanldedParams);
        shouldBeImplemented(beHanldedParams);
    }

    void shouldBeImplemented(String params);
}
