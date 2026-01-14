package c;

import b.B;

public class C {
    public String hello() { return new B().hello() + ", and C"; }
}
