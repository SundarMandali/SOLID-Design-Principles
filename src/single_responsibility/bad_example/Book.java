package single_responsibility.bad_example;

public class Book {
	private String bookName;
	private String author;
	public Book(String bookName,String author){
		this.bookName=bookName;
		this.author=author;
	}
	
	//Responsibility 1: providing book details
	public void getDetails(){
		System.out.println("Book Name: "+bookName+" author:"+author);
	}
	
	//Responsibility 2: printing the book
	public void printBook(){
		System.out.println("Printing: ");
		getDetails();
	}
	
	//Responsibility 3: saving the book to db
	public void saveToDatabase(){
		System.out.println("Saving the book to Database");
	}
}
/*
Here a single book class is handling all the multiple responsibilities which is 
a bad practice because 
=>if we want to modify the logic in saveToDatabase or printing then the Book class must be
modified.This violates the Single Responsibility Principle.
*/ 