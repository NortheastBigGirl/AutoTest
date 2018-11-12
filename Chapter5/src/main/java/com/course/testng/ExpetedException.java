package com.course.testng;

import org.testng.annotations.Test;

public class ExpetedException {
    /**
     * 什么时候用到异常测试
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入某些不合法参数，程序会抛出异常
     * 我们的预期结果就是这个异常
     */

    //这个是失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这个是成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucceed(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
