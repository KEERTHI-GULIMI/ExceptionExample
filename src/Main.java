
class ThrowExcep {

    static void fun() {
        try {
            System.out.println("its sleepy");
            throw new Exception("demo");
        } catch (Exception e) {
            System.out.println("Caught inside fun().");
            //throw e;
        }

        System.out.println("yeah its afternoon");
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("Caught in main.");
        }
        //  int a=2/0;
        System.out.println("hey dont sleep");
    }
}
