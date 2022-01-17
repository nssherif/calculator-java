package calculator;

public class Book {
	private String author ;
    private String title ;
    private String publisher ;
    private int year ;

    public Book( String author, String title, String publisher, int year ) {
    	this.author = author ;
    	this.title = title ;
    	this.publisher = publisher ;
    	this.year = year ; 
   }
    
   public int getYear() {
	   return this.year;  
   }
   public String getAuthor() {
	   return this.author;  
   }
   public String getTitle() {
	   return this.title;  
   }
   public String getPublisher() {
	   return this.publisher;  
   }
   
   public String changeAuthor(String author) {
	   this.author = author;
	   return this.author;
   }

}
