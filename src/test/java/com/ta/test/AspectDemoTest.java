package com.ta.test;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: andy.lai
 * Date: 11/17/16
 * Time: 10:29 AM
 */
public class AspectDemoTest {

    @Test
    public void runTest(){
        AspectMethod.print();
//        AspectMethod.print(2, 4);
//        AspectMethod.print(2,"4");
//        AspectMethod.print(2);
//        try {
//            AspectMethod.printThrowException(2,3);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

}
