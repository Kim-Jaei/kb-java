package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {

        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}