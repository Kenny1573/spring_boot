package com.kenny.collections.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/25 17:35
 */
public class FunctionTest {

    @Test
    public void test(){
        Logger logger = LoggerFactory.getLogger(getClass());

        Function<Integer,Integer> function= i->i+1;
        Integer apply = function.apply(5);
        logger.info(apply.toString());

        Function<Integer,Integer> A=i->i+1;
        Function<Integer,Integer> B=i->i*i;
        Integer apply1 = B.apply(A.apply(5));
        System.out.println(apply1);
        Integer apply2 = A.apply(B.apply(5));
        System.out.println(apply2);
        Integer apply3 = A.compose(B).apply(5);
        System.out.println(apply3);
        Integer apply4 = B.compose(A).apply(5);
        System.out.println(apply4);
        Integer apply5 = B.compose(A).compose(A).andThen(A).apply(5);
        System.out.println(apply5);
    }
}
