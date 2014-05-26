package domain;

import java.util.ArrayList;
import java.util.List;

public class Shape {
	
	private double sides[] ;
	
	public Shape(double sides[]) {
		this.sides = sides;
	}
	public boolean isValidShape() {
		if(isSidesCountBiggerThanTwO() == false)
		{
			return false;
		}
		if(isAllSidesBiggerThanZero() == false)
		{
			return false;
		}
		if(isOneSideBiggerTheOtherAdd() ==false)
		{
			return false;
		}
		return true;
	}
	
	private boolean isSidesCountBiggerThanTwO() {
		if(sides.length<=2)
		{
			return false;
		}
		return true;
	}
	private boolean isAllSidesBiggerThanZero() {
		int i = 0;
		for(;i<sides.length;++i)
		{
			if(sides[i]<=0)
			{
				return false;
			}
		}
		return true;
	}
	private boolean isOneSideBiggerTheOtherAdd() {
		int i = 0;
		double sum = 0,sumExceptOne = 0;
		
		sum = sidesSum();
		
		for(;i<sides.length;i++)
		{
			sumExceptOne = sum - sides[i];
			if(sumExceptOne < sides[i])
			{
				return false;
			}
		}
		return true;
	}
	
	private double sidesSum() {
		
		double sum = 0;
		for(int i=0;i<sides.length;i++)
		{
			sum += sides[i];
		}
		return sum;
	}
	
	public boolean hasNEqualSides(int n) {
		
		if(isValidShape() == false)
		{
			return false;
		}
		List<Double>  list = new ArrayList<Double>();
		boolean flag = false;
		for(int i=0;i<sides.length;i++)
		{
			list.add(sides[i]);
		}
		int count;
		for(int i=0;i<list.size();i++)
		{
			count = 1;
			
			for(int j=i+1;j<list.size();)
			{
				if(list.get(i). doubleValue() == list.get(j).doubleValue())
				{
					++count;
					list.remove(j);
					continue;
				}else{
					j++;
				}
				
			}
			if(count == n)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}

}
