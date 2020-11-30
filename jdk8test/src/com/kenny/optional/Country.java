package com.kenny.optional;

import java.util.Optional;

/**
 * @author kenny
 * @version 1.0
 * @date 2020/11/30 15:15
 */
public class Country {
    private String isoCode;

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Optional<String> getIsoCode() {
        return Optional.ofNullable(isoCode);
    }
}
