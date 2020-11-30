package com.kenny.optional;

import java.util.LinkedList;
import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 15:17
 */
public class test1 {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setEmail("123@456.com");
        admin.setName("1001");
        admin.setMoney(3000d);
        Optional<String> op1 = Optional.ofNullable(admin)
                .flatMap(u -> u.getAddress())
                .flatMap(s -> s.getCountry())
                .map(c -> c.getIsoCode())
                .orElse(Optional.of("default"));
        Optional<String> op2 = Optional.ofNullable(admin)
                .flatMap(Admin::getAddress)
                .flatMap(Address::getCountry)
                .map(Country::getIsoCode)
                .orElse(Optional.ofNullable("default"));
        System.out.println(op1.get());
        System.out.println(op2.get());

        LinkedList<Admin> admins = new LinkedList<>();
        Admin admin1 = admins.stream().findFirst().orElse(new Admin());
        System.out.println(admin1);
    }
}
