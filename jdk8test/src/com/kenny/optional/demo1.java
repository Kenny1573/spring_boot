package com.kenny.optional;

import com.kenny.fangfayingyong.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 13:12
 * OptionalTest
 */
public class demo1 {
    public static void main(String[] args) {
        Optional<User> optionalUser=Optional.empty();
        optionalUser = Optional.ofNullable(new User("张三",1000d));
        System.out.println(optionalUser.isPresent());
        System.out.println(optionalUser.get().getName());
        optionalUser.ifPresent(user -> System.out.println(user));
    }
}

class demo2{
    public static void main(String[] args) {
        User user1=null;
        User user2 = new User("1001", 2000d);
        System.out.println(Optional.ofNullable(user1).orElse(user2));

        User user3 = new User("1002", 4000d);
        System.out.println(Optional.ofNullable(user2).orElse(user3));

        User user4=null;
        System.out.println(Optional.ofNullable(user4).orElseGet(() -> user3));
    }
}

class demo3{
    public static void main(String[] args) {
        User u1=new User("1002",5000d);
        System.out.println("--------in orelse");
        Optional.ofNullable(u1).orElse(create());
        System.out.println("--------in orelseget");
        Optional.ofNullable(u1).orElseGet(demo3::create);
        User u2=null;
        Optional.ofNullable(u2).orElseThrow(()->new IllegalArgumentException());
    }
    public static User create(){
        System.out.println("create new op");
        return new User("1001"+ LocalTime.now().getMinute(),1003d);
    }
}
