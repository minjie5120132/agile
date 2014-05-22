package example;

public class Triangle {

	double a,b,c;
	
	public Triangle(double a,double b,double c)
	{
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	//������֤
	public boolean isValid()
	{
		
		if(isNoTreeSidesAllBiggerThanZero() == true)
		{
			return false;
		}
		if(isNoTwoSidesAddBiggerThanTheOther() == true)
		{
			return false;
		}
		if(isTwoSidesSubtractLitterThanTheOther())
		{
			return true;
		}
		
		return false;
	}
	private boolean isTwoSidesSubtractLitterThanTheOther() {
		if(a-b<c && a-c<b && b-c<a)
		{
			return true;
		}
		return false;
	}
	private boolean isNoTwoSidesAddBiggerThanTheOther() {
		if(a+b<=c || a+c<=b || b+c<=a)
		{
			return true;
		}
		return false;
	}
	private boolean isNoTreeSidesAllBiggerThanZero() {
		if(a<0 || b<0 || c<0)
		{
			return true;
		}
		return false;
	}
	//��ͨ������
	public boolean isValidGeneralTriangle()
	{
		boolean flag1 = (a != b);
		boolean flag2 = (a!=c);
		boolean flag3 = (b!=c);
		if(this.isValid()){
			if(flag1 && flag2 && flag3)
			{
				return true;
			}
		}
		
		return false;
		
	}
	//����������
	public boolean isValidIsosceles()
	{
		boolean flag1 = (a==b)&&(a!=c);
		boolean flag2 = (a==c)&&(a!=b);
		boolean flag3 = (b==c)&&(a!=c);
		if(this.isValid())
		{
			if(flag1 || flag2 || flag3)
			{
				return true;
			}
			
		}
		return false;
		
	}
	//�ȱ�������
	public boolean isValidEquilateral()
	{
		boolean flag1 = (a==b);
		boolean flag2 = (b==c);
		boolean flag3 = (a==c);
		if(this.isValid())
		{
			if(flag1 && flag2 && flag3)
			{
				return true;
			}
			
		}
		return false;
	}
	
}
