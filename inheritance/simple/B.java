public class B extends A {

    public static void main(String[] args) {

        B obj = new B();

        obj.show();   // inherited method
        System.out.println("x from parent: " + obj.x);
    }
}
