package week2day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Library lib1 = new Library();
 
 String bookTile= lib1.addBook("Rocket");
 System.out.println(bookTile);
 lib1.issueBook();
 
	}

}
