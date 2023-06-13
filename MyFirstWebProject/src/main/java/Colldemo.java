import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Colldemo {

	public static void main(String[] args) {
		List<Integer> ob1=new ArrayList<>();
ob1.add(11);
ob1.add(21);
ob1.add(31);
for(Integer i:ob1) {
	System.out.println(i+"-----");
}

Iterator<Integer> iterator = ob1.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
 ListIterator<Integer> listIterator = ob1.listIterator();
while(listIterator.hasNext()) {
	System.out.println(listIterator.next());
}
while(listIterator.hasPrevious()) {
	System.out.println(listIterator.previous());
}


	}

}
