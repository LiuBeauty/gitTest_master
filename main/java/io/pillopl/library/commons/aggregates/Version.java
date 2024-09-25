package io.pillopl.library.commons.aggregates;

import lombok.Value;

@Value
public class Version {
    int version;
    public void ForTest(){
        System.out.println("123");
    }
    public static Version zero() {
        return new Version(0);
    }
}
