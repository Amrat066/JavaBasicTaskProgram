package practical1;


class Book{
	
	private int bookId;
	private String BookName;
	private String author;
	private int price;
	
	
	Book(int i,String name,String auth,int price)
	{
		this.bookId=i;
		this.BookName=name;
		this.author=auth;
		this.price=price;
	}
	void display() {
		System.out.println("the Bookid is:="+bookId);
		System.out.println("the BookName is:="+BookName);
		System.out.println("the author name is:="+author);
		System.out.println("the price is:="+price);
	}
}
public class ClassObject {
	
	public static void main(String args[]) {
		Book b=new Book(101,"php","james",70000);
		b.display();
		
	}

}
