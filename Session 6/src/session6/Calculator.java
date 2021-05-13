package session6;
abstract class Calcu{
abstract int add(int a,int b);
abstract int sub(int a,int b);
abstract int mul(int a,int b);
abstract double div(int a,int b);
}
class CalImp extends Calculator{

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	double div(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}
	
}
public class Calculator
{
	public static void main(String args[]) {
		Calcu c=new Calcu();
		
	}
}
