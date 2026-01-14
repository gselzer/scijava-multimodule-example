package b;

import a.A;

public class B {
    public String hello() { return new A().hello() + ", and B"; }
}
