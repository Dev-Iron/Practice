package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {

        int maxProducts = 10;
        String[] productsNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCounts = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.상품 등록 | 2.상품 목록 | 3.종료\n메뉴를 선택하세요:");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                if (productCounts >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("상품 이름을 입력하세요:");
                productsNames[productCounts] = sc.nextLine();

                System.out.println("상품 가격을 입력하세요:");
                productPrices[productCounts] = sc.nextInt();

                productCounts++;
            } else if (menu == 2) {

                if (productCounts == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCounts; i++) {
                    System.out.println(productsNames[i] + ": " + productPrices[i] + "원");
                }

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

    }
}
