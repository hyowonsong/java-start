package Chapter8;

// 1차원 배열
public class Array1 {
    public static void main(String[] args) {
        // 여기도 students 를 한번에 사용 가능
        int[] students; // 배열 변수 선언
        students = new int[]{90,80,70,60,50}; // new int[5]를 수정

        /* 리팩토링
        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
         */

        // 변수 값 사용
        for (int i = 0; i<students.length; i++){
            System.out.println("학생" + (i+1) + " 점수:" + students[i]);
        }
    }
}
