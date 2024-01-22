package array;

public class ArrayDi1 {
    public static void main(String[] args) {

        int[][] array = new int[3][4];

        int i = 1;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = i++;
            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }

    }
}
