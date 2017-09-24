package pkgMain;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
	}
	public int getiValue() {
		return iValue;
	}
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		return (iValue % 2 == 0 ? true : false);
	}
		
	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		if (iValue < 2) return true;
		if (iValue == 2) return true;
		if (iValue % 2 == 0) return false;
		for (int i = 3; i * i <= iValue; i += 2)
			if (iValue % i == 0) return false;
		return true;
	}
	
	public boolean isEven(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	
	public boolean isOdd(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	
	public boolean isPrime(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	
	public boolean isEven(MyInteger myInt)
	{
		return myInt.isEven();
	}
	
	public boolean isOdd(MyInteger myInt)
	{
		return myInt.isOdd();
	}
	
	public boolean isPrime(MyInteger myInt)
	{
		return myInt.isPrime();
	}
	
	public boolean isEquals(int iValue)
	{
		return (this.iValue == iValue ? true : false);
	}
	
	public boolean isEquals(MyInteger myInt)
	{
		return myInt.isEquals(iValue);
	}
	
			
		
		
	}


