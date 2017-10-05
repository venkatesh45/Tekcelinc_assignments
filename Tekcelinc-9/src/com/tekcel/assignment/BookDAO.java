package com.tekcel.assignment;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {

	public void createBook(Book b) throws SQLException;
	public List<Book> readBook() throws SQLException;
	public Book readBook(int bid) throws SQLException;
	public int updateBook(Book b) throws SQLException;
	public int deleteBook(int bid) throws SQLException;
}
