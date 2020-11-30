package com.kenny.optional;

import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 15:16
 */
public class Address {
    private Country country;

    public Optional<Country> getCountry() {
        return Optional.ofNullable(country);
    }
}
