package NewProblems;

import java.util.Scanner;

public class NextPrimechatgpt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Next prime: " + findNextPrime(num));
    }
    public static int findNextPrime(int num) {
        num++;
        while (!isPrime(num)) num++;
        return num;
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
	}

}
