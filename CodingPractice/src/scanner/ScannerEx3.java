package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요:");
        String name = sc.nextLine();

        System.out.println("음식의 가격을 입력해주세요:");
        int price = sc.nextInt();

        System.out.println("음식의 수량을 입력해주세요:");
        int total = sc.nextInt();

        int sumTotal = price * total;
        System.out.println(name + total + "를 주문하셨니다. 총 가격은 " + sumTotal + "원 입니다.");

    }
}
