class A
{
	protected void test(int a,int b) {
		System.out.println("=====>"+(a-b));
		
	}
	int add(int a,int b) {
		return a+b;
	}
}
class B extends A{
	@Override
	protected void test(int a,int b) {
		System.out.println("=====>"+(a+(b*a)));
		
	}
}
 class C  extends A{
	
}
public class InheritanceEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B ob=new B();
System.out.println(ob.add(2, 10));

		
	}

}
