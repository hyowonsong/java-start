package Chapter4;

public class ScoreEx {
    public static void main(String[] args) {
        int socre = 90;

        if (socre >= 95){
            System.out.println("학점은 A입니다.");
        } else if (socre >=85) {
            System.out.println("학점은 B입니다.");
        } else if (socre >=75) {
            System.out.println("학점은 C입니다.");
        } else if (socre >= 65) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다. ");
        }
    }
}
