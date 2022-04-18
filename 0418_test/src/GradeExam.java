import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Grade me = new Grade();
		System.out.println("수학점수 : ");
		me.math = sc.nextInt();
		System.out.println("과학점수 : ");
		me.science = sc.nextInt();
		System.out.println("영어점수 : ");
		me.english = sc.nextInt();

		me.average();
	
		System.out.println("평균점수는" + me.average() + "입니다.");

	}

}

class Grade {
	int math;
	int science;
	int english;

	public int average() {
		return (math + science + english) / 3;
	}
}
