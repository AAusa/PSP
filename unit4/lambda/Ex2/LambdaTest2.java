package unit4.lambda.Ex2;
public class LambdaTest2 {
    public static void main(String[] args) {
        new Thread(() ->
        {
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }
        ).start();

    }
}