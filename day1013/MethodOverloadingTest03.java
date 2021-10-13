class SistUtil
{
	//두 개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드 정의
	public static void max(int a,int b){    
		max((double)a,(double)b);	//필요하다면 메소드 안에서 다른 메소드 호출 가능	
	}


	//두 개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드 정의
	public static void max(double a,double b){    
		double r = a;
		if (b>r){
			r = b;
		}
		System.out.println("큰수는 "+ r +"입니다.");
	}

}


class  MethodOverloadingTest03
{
	public static void main(String[] args) 
	{
		//두 개의 max메소드를 호출
		
		SistUtil.max(20,30);
		SistUtil.max(25.7,25.8);
	}
}

//위의 메소드들을 클래스메소드로 변경하기