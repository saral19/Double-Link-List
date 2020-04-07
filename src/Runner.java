
public class Runner {

	public static void main(String[] args) {
		Dlinklist list = new Dlinklist();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtEnd(4);
		list.insertInBetween(3,50);
		list.deleteLast();
		list.deleteFirst();
		list.deleteInMiddle(3);
		list.print();
	}

}
