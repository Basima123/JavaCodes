package utility;

public class Employee {
	int sal=60000;
}
class Program extends Employee {
	
int bonus =5000;
int tot=sal+bonus;


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Program p=new Program();
System.out.println("The salary is :" +p.sal);
System.out.println("The bonus for this month :" +p.bonus);
System.out.println("Total :" +p.tot);


	

}
}