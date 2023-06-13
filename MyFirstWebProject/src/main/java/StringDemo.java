
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Basima";
		s=s.concat("2");
		System.out.println(s);
String s1,s2;
		s1="apple";
		s2="Apple";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.startsWith("ap"));
		System.out.println(s1.endsWith("ap"));
		System.out.println(s1.contains("ap"));
		System.out.println(s1.substring(2,4));
		System.out.println(s1.indexOf("p"));
		System.out.println(s.charAt(3));
		String s3="basima@in@work";
String[] split = s3.split("@");
for(String s4:split) {
System.out.print(s4+"\t");}
}

	}


