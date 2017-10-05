package com.tekcel.assignment;

import java.sql.SQLException;
import java.util.List;

public class BookAPI {

	public static void main(String[] args) throws SQLException {

		BookDAO bookDAO = new BookDAOImpl();

		Book b1 = new Book(1, "Venkatesh", "C++", "Education");
		Book b2 = new Book(2, "Venkatesh", "Java", "Education");
		Book b3 = new Book(3, "Venkatesh", "C", "Education");
		Book b4 = new Book(4, "Venkatesh", "C#", "Education");

		// Insertion
		bookDAO.createBook(b1);
		bookDAO.createBook(b2);
		bookDAO.createBook(b3);
		bookDAO.createBook(b4);

		// Reading data from DB
		List<Book> listOfBooks = bookDAO.readBook();

		for (Book b : listOfBooks) {
			System.out.println(b);
		}

		// Updating Book using id
		bookDAO.updateBook(new Book(4, "Manikanta", "C#", "Education"));

		// Reading data from DB using id
		// After updating.
		System.out.println(bookDAO.readBook(4));

		// Delete Book using Book id
		// After Deleting
		System.out.println(bookDAO.deleteBook(4));

		// Reading data from DB
		listOfBooks = bookDAO.readBook();

		for (Book b : listOfBooks) {
			System.out.println(b);
		}

		DBConnection.getInstance().close();
	}
}
