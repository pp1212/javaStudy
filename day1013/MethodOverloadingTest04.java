class SistUtil
{
	
	//�� ���� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ� ����
	public static void max(double a,double b){    
		double r = a;
		if (b>r){
			r = b;
		}
		System.out.println("ū���� "+ r +"�Դϴ�.");
	}

}


class  MethodOverloadingTest04
{
	public static void main(String[] args) 
	{
		//�� ���� max�޼ҵ带 ȣ��
		
		SistUtil.max(20,30);
		//�� �´� int�� ���� �޼ҵ尡 ������ �ű�� ������
		//���ٸ� double�� int�� �����ϴϱ� double�� ���� �޼ҵ尡 ����

		SistUtil.max(25.7,25.8);
	}
}

//���� �޼ҵ���� Ŭ�����޼ҵ�� �����ϱ�