package Chapter8.Example;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = new int[]{90,80,70,60,50};

        int total = 0;      // 여기서 total에 대해 미리 정의 생각했어야
        for (int i=0; i<students.length; i++){
            total += students[i];
        }
        double average = (double) total/ students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
