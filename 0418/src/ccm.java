import java.util.Scanner;

public class ccm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b=0;
		int sum=0;
		
		System.out.println("시작숫자 : ");
		a= sc.nextInt();
		System.out.println("마지막 숫자 : ");
		b= sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			sum += i;			
		}
		System.out.println(a+"부터"+b+"까지의 합은"+sum+"입니다.");
	}

}
