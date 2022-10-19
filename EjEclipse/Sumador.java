import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sumador {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]), solution = 0;
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) solution += i;
		}
		else {
			for(int i = num1; i <= num2; i++) solution += i;
		}

		System.out.println(solution);

	}
}
