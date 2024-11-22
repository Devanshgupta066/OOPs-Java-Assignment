interface I1 {
    void m1();
    void m2();
}

interface I2 {
    void m3();
    void m4();
}

interface I3 {
    void m5();
    void m6();
}

interface INew extends I1, I2, I3 {
    void newM();
}

class BaseClass {
    void baseMethod() {
        System.out.println("Method in BaseClass");
    }
}

class CombinedClass extends BaseClass implements INew {
    @Override
    public void m1() {
        System.out.println("m1 from I1");
    }

    @Override
    public void m2() {
        System.out.println("m2 from I1");
    }

    @Override
    public void m3() {
        System.out.println("m3 from I2");
    }

    @Override
    public void m4() {
        System.out.println("m4 from I2");
    }

    @Override
    public void m5() {
        System.out.println("m5 from I3");
    }

    @Override
    public void m6() {
        System.out.println("m6 from I3");
    }

    @Override
    public void newM() {
        System.out.println("newM from INew");
    }
}

public class q18 {
    static void testI1(I1 obj) {
        obj.m1();
        obj.m2();
    }

    static void testI2(I2 obj) {
        obj.m3();
        obj.m4();
    }

    static void testI3(I3 obj) {
        obj.m5();
        obj.m6();
    }

    static void testINew(INew obj) {
        obj.newM();
    }

    public static void main(String[] args) {
        CombinedClass obj = new CombinedClass();
        
        testI1(obj); 
        testI2(obj); 
        testI3(obj); 
        testINew(obj); 

        obj.baseMethod(); 
    }
}
