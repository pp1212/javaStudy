/*
�� ���α׷��� 5���� �̸�,����,����,������ �Է¹޾� ������ ����� ���� ���� ���������� �����Ͽ� ���
���������� ������ ��,������ ���� ������ �̸��� �ٲ��ְ� ����,����,����,����,��� ������ ���
�ٲٴ� ���� ���ŷο�

�̷��� �� ���� �л��� ������ �����ϱ⿡ �ʿ��� �̸�,����,����,����,����,����� �ϳ��� ��Ʈ�� ����
=>Ŭ���� ����� ��
Ŭ���� ����� �θ� �� ���� ������ ���� �ִ� ���� �ƴ϶� �ϳ��� ��Ʈ�� ǥ�� -> ������ �� ������
*/

import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}







class StudentTest04 
{
	public static void main(String[] args) 
	{
		
		

		Student []s = new Student[1];   //Student �迭 1�� ������(��ü ������ �ƴ�)
		//s[0].name = "ȫ�浿";  
		s[0] = new Student(); //��ü����
		s[0].name = "ȫ�浿";  //�� ������ �� ���� �� ����
		System.out.println(s[0].name);



		
		/*
		//Student s1;
		//Student s2;

		Student []s = new Student[2]; 
		//�̰��� Student�� ��ü ������ �ƴϰ� Student�� ��ü�� ������ �� �ִ� Student2�� ����� �ּ���
		
		s[0].name = "ȫ�浿";

		*/
	}
}


