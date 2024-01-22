package array;

public class ArrayDi0 {
    public static void main(String[] args) {

//        2x3 2차원 배열을 만든다.
//        int [][] array = new int[2][3];

//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;

//        1차 리펙토링
//        for (int row = 0; row < 2; row++){
//            System.out.print(array[row][0] + " ");
//            System.out.print(array[row][1] + " ");
//            System.out.print(array[row][2] + " ");
//            System.out.println();
//        }

        int[][] array = new int[][]{
                {1, 2, 3}, {4, 5, 6}
        };

//        2차 리펙토링
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }


//        System.out.print(array[0][0] + " ");
//        System.out.print(array[0][1] + " ");
//        System.out.print(array[0][2] + " ");
//        System.out.println();
//
//        System.out.print(array[1][0] + " ");
//        System.out.print(array[1][1] + " ");
//        System.out.print(array[1][2] + " ");
    }
}
