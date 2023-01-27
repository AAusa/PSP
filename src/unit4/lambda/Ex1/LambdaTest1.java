package unit4.lambda.Ex1;

public class LambdaTest1 {
    public static void main(String[] args) {
        //first attemp:
        Multiply m = new Multiply();
        m.operate(3,3);

        //second attemp:
        MyFunctionalInterface e1 = new MyFunctionalInterface() {
            @Override
            public void operate(int a, int b) {
                System.out.println(a * b);
            }
        };
        e1.operate(2,3);

        //third attemp:
        MyFunctionalInterface e2 = (a, b) -> System.out.println(a+b);
        e2.operate(2,4);
    }
}
class Multiply implements MyFunctionalInterface {

    @Override
    public void operate(int a, int b) {
        System.out.println(a*b);
    }
}

class Add implements MyFunctionalInterface {

    @Override
    public void operate(int a, int b) {
        System.out.println(a+b);
    }
}
