package utility;

public class classTest {
	int id;
		String name;
		void employee(int i,String n)
		{
			id=i;
			name=n;
		}
	void display()
	{
		System.out.println (id +" "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classTest a=new classTest();
		classTest b=new classTest();
		a.employee(111, "hana");
		b.employee(112, "zayan");
		a.display();
		b.display();
				

	}

}
