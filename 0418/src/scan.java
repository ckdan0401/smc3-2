import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		
		int a;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1000������ �ڿ����� �Է��ϼ��� : ");
		a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(i%4==0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1~"+ a + "�� ����� ����" + sum + "�Դϴ�.");
	}
}
