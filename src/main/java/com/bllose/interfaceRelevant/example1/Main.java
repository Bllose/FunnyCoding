package com.bllose.interfaceRelevant.example1;

/**
 * 该编程方式依赖于 1.8 版本的 lambda表达式/方法调用:: ; functional interface
 * 总体逻辑与接口、抽象类、实现类的逻辑有许多相似之处。
 * 不同之处在于：
 * 1、实现类与接口完全解耦，只要给定参数，实现类自己完全可以独立运行
 * 2、接口通过 default 方法实现固有逻辑，再调用抽象方法。 从而达到将“通用逻辑”抽离到 Function Interface中统一实现， 并且与每一个特定实现类发生交互。
 *      针对这第二个特征，与抽象、继承最大的优势在于，实现类并未被占用“继承”位。
 *      当前用法最大的限制在于 Functional interface, 这导致一次只能有一个方法被指定关联。
 * 3、就lambda表达式而言，他们本质上是相同的， 但是存在如下差异：
 *      1） lambda表达式只能执行一段自定义代码块；而Function interface总体是 总分结构， 并且“自定义代码块”还能利用“自定义方法”中其他的所有资源
 *
 * 总结：
 *      这种编程思维比较适合Adapt。 特别是那种主要逻辑已经被实现，但是由于某些原因并不好继续改造。
 *      这时候，通过Functional interface嫁接过来， 即不影响原逻辑，又能在新逻辑中享受原代码中的全量资源。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("初始化自定义方法，并实例化公共接口");
        SpecificClass sc = new SpecificClass();
        TopInterface ti = sc::shouldBeImplemented;
        System.out.println("############################");
        System.out.println("调用实例化的功能接口:");
        ti.aggreegateFunctionEntry("开始测试");
        System.out.println("############################");
        System.out.println("调用自定义方法:");
        sc.specificFunctions();
    }
}
