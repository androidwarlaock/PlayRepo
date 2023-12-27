package controllers;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import io.ebean.Ebean;
import io.ebean.Transaction;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import play.i18n.MessagesApi;

import views.html.*;

public class BooksController extends Controller {
	
	  @Inject
	    FormFactory formFactory;
	  @Inject
	  private MessagesApi messagesApi;

	    // for all books

	    public Result index(){
	       List<Book> books= Book.find.all();
	       
	        return ok(index.render(books));
	    }

	    // to create book

	    public Result create(Http.Request request){
	        Form<Book> bookForm = formFactory.form(Book.class);
	        return ok(create.render(bookForm,messagesApi.preferred(request)));
	    }

	    // to save book
	   
	     public Result save(Http.Request request){
	    	 Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);
				/*
				 * if(bookForm.hasErrors()){ flash("danger","Please Correct the Form Below");
				 * return badRequest(create.render(bookForm)); }
				 */
	         Book book = bookForm.get();
	          book.save();
	         return redirect(routes.BooksController.index());
	    }

	    public Result edit(Integer id,Http.Request request){
           Book book=Book.find.byId(id);
           if(book==null)
           {
        	   return notFound("Book not found");
           }
           Form<Book> bookForm = formFactory.form(Book.class).fill(book);
           return ok(edit.render(bookForm,messagesApi.preferred(request)));
	    }

	    public Result update(Http.Request request){
	        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);

	        if (bookForm.hasErrors()){
	            
	            return badRequest();
	        }

	        Book book = bookForm.get();
	        Book oldBook = Book.find.byId(book.id);
	        System.out.println(oldBook.price);
	        if(oldBook ==null){
	         
	            return notFound();
	        }
	        
	        oldBook.setId(book.id);
	        oldBook.setTitle(book.title);
	        oldBook.setPrice(book.price);
	        oldBook.setAuthor(book.author);
	        System.out.println(oldBook.price);
	        oldBook.update();
	       
	       
	    	 return redirect(routes.BooksController.index());
	    }

	    public Result destroy(Integer id){
	    	 Book book=Book.find.byId(id);
	    	 if(book==null)
	           {
	        	   return notFound("Book not found");
	           }
	    	 book.delete();
	    	 
	        return  redirect(routes.BooksController.index());
	    }

	    public Result show(Integer id){
	    	 Book book=Book.find.byId(id);
	    	 if(book==null)
	           {
	        	   return notFound("Book not found");
	           }
	    	
	    	 
	        return  ok(show.render(book));
	    }

		public Result returnJson(String name){
			String jsn = "    {  \n" +
					"        \"employee\": {  \n" +
					"            \"name\": " +name+ ",\n"+
					"            \"salary\":      56000,   \n" +
					"            \"married\":    true  \n" +
					"        }  \n" +
					"    }  ";
			return ok(jsn);
		}


		public Result getStoredProcedure()
		{
			Transaction tx = Ebean.beginTransaction();
			String sql = "{CALL newStoredProcedure()}";
			List<Book> books =  new ArrayList<Book>() ;
			try {
				Connection dbConnection = tx.getConnection();
				CallableStatement callableStatement = dbConnection.prepareCall(sql);
				ResultSet rs = callableStatement.executeQuery();

				while (rs.next()) {
					//HOW TO CONVER row -> model ?
                  Book bk =  new Book();
				  bk.setId(rs.getInt("id"));
				  bk.setAuthor(rs.getString("author"));
				  bk.setTitle(rs.getString("title"));
				  bk.setPrice(rs.getInt("price"));
                  books.add(bk);
				}
				Ebean.commitTransaction();


			}catch (Exception e){

			}

			return  ok(index.render(books));
		}

	public Result getStoredProcedureWithParameters(Integer id)
	{
		Transaction tx = Ebean.beginTransaction();
		String sql = "{CALL getBookID(?)}";
		List<Book> books =  new ArrayList<Book>() ;
		try {
			Connection dbConnection = tx.getConnection();
			CallableStatement callableStatement = dbConnection.prepareCall(sql);
			callableStatement.setInt(1,id);
			ResultSet rs = callableStatement.executeQuery();

			while (rs.next()) {
				//HOW TO CONVER row -> model ?
				Book bk =  new Book();
				bk.setId(rs.getInt("id"));
				bk.setAuthor(rs.getString("author"));
				bk.setTitle(rs.getString("title"));
				bk.setPrice(rs.getInt("price"));
				books.add(bk);
			}
			Ebean.commitTransaction();


		}catch (Exception e){

		}

		return  ok(index.render(books));
	}
}
