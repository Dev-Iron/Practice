package array;

public class Array1 {
    public static void main(String[] args) {
        //배열 변수 선언
//        int[] students;
//        students = new int[5];

//        1차 리펙토링 배열 생성과 초기화
//        students = new int[]{90, 80, 70, 60, 50};

//        2차 리펙토링
        int[] students = {90, 80, 70, 60, 50};

//        변수값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

//        변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
//        System.out.println("학생 1 점수: " + students[0]);
//        System.out.println("학생 2 점수: " + students[1]);
//        System.out.println("학생 3 점수: " + students[2]);
//        System.out.println("학생 4 점수: " + students[3]);
//        System.out.println("학생 5 점수: " + students[4]);

    }
}
