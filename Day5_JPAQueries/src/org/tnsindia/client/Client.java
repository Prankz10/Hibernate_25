package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Book;
import org.tnsindia.services.BookService;
import org.tnsindia.services.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		BookService service=new BookServiceImpl();
			
		System.out.println("Listing book with Specific ID required: ");
		System.out.println("Enter the Book ID number:");
		int id=s.nextInt();
		System.out.println("Book with ID is "+id+":"+service.getBookById(id));

		
		System.out.println("Listing book with Specific Title required: ");
		System.out.println("Enter the title name:");
		String title=s.next();
		System.out.println("Book with Specific "+title+" is "+service.getBookByTitle(title));
		
		System.out.println("Listing book with Specific author required: ");
		System.out.println("Enter the author name is ");
		String author=s.nextLine();
		System.out.println("Book with Specific "+author+" is "+service.getAuthorBooks(author));
		
		System.out.println("Listing book with Specific price range are : ");
		for(Book book:service.getBookInPriceRange(300.0, 600.0))
			System.out.println(book);
		
		System.out.println("Listing all the books needed ");
		System.out.println(service.getAllBooks());
		
	}
}