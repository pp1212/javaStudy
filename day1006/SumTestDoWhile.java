import java.util.Scanner;
class  SumTestDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.print("N�� �Է��Ͻÿ�==>");
		n = sc.nextInt();

		int i=1;
		do{
			sum += i;
			i++;		
		}while(i<=n);
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n,sum);
	}
}