package com.kenny.optional;

import com.kenny.fangfayingyong.User;

import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 14:17
 */
public class test {
    public static void main(String[] args) {
//        User user = new User("1001", 1000d);
//        String strName = Optional.ofNullable(user).map(user1 -> user1.getName())
//                .orElse("defaultName");
//        System.out.println(strName);
        filter();
    }

    /**
     * 转化
     */
    public static void map() {
        User user1 = new User("1002", 2000d);
        user1.setPosition("Develop");
        String s = Optional.ofNullable(user1).flatMap(u -> u.getPosition())
                .orElse("defalut");
        System.out.println(s);
    }

    /**
     * 过滤
     */
    public static void filter() {
        User user = new User("10001", 3000d);
        user.setEmail("123@456.com");
        Optional<User> optionalUser = Optional.ofNullable(user)
                .filter(u -> u.getEmail() != null && u.getEmail().contains("@"));
        System.out.println(optionalUser.isPresent());
        System.out.println(optionalUser.get());
        optionalUser.ifPresent(op -> System.out.println(op));
    }

}
