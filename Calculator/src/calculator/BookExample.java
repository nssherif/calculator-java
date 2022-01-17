package calculator;

public class BookExample {

	public static void main(String[] args) {
		Book b = new Book( "Martin",
                "Logic",
                "Norton",
                2000 ) ;
		Book c = b ;
		System.out.println("before change Author for b is: " + b.getAuthor());
		b.changeAuthor("Negib");
		System.out.println("Done");
		System.out.println(c.getAuthor());
		System.out.println("after change Author for b is: " + b.getAuthor());
		System.out.println("after change Author for c is: " + b.getAuthor());
		
		int n = 9;
		int m = n;
		System.out.println("before change n is: " + n);
		System.out.println("before change m is: " + m);
		
		n = 11;
		System.out.println("before change n is: " + n);
		System.out.println("before change m is: " + m);
		
	}

}
