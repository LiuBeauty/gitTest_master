package io.pillopl.library.commons.aggregates;

public class AggregateRootIsStale extends RuntimeException {

    public AggregateRootIsStale(String msg) {
        super(msg);
    }
    public void ForTest(){
        System.out.println("123");
    }
}
