import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		
		int a;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1000이하의 자연수를 입력하세요 : ");
		a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(i%4==0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1~"+ a + "의 배수의 합은" + sum + "입니다.");
	}
}
