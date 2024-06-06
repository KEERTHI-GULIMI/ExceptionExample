
class SuperClass {

    void method() {
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {

    void method() throws ArithmeticException {
        int a = 2 / 0;
        System.out.println("SubClass");
    }

    public static void main(String args[]) {
        SuperClass s = new SubClass();
        s.method();
    }
}

