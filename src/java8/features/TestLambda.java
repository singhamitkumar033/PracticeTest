package java8.features;

interface FuncInterface{
	void abstractFun(int x,int y);
}

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface fobj=(int x,int y) ->System.out.println(x*y);
		fobj.abstractFun(5,6);
	}

}
