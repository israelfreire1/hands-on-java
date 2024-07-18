package biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Library {

    private List<Author> authors = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();


    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }


    public void registerAuthor(Author author){
        authors.add(author);
    }

    public void registerBook(Book book){
        books.add(book);
    }

    public void registerCustomer(Customer customer){
        customers.add(customer);
    }

    public void registerLoan(Loan loan){
        loans.add(loan);
    }

    public Book searchBookByTitle(String title ){
        for(Book book: books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public Book searchBookById(Long id){
        for(Book book: books){
            if(book.getId() == id){
                return book;
            }
        }
        return  null;
    }

    public  Author searchAuthorByName(String name){
        for(Author author: authors){
            if(author.getName().equalsIgnoreCase(name)){
                return author;
            }
        }
        return null;
    }

    public Author searchAuthorById(Long id){
        for(Author author: authors){
            if(author.getId() == id){
                return author;
            }
        }
        return null;
    }

    public Book searchByAuthor(String name){
        for(Book book: books){
            if(book.getAuthor().getName().equalsIgnoreCase(name)){
                return book;
            }
        }
        return null;
    }

    public Book searchBookByReleaseDate(Date releaseYear){
        for(Book book: books){
            if(book.getReleaseDate() == releaseYear){
                return book;
            }
        }
       return null;
    }

    public Customer searchCustomerByName(String name){
        for(Customer customer: customers){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }

    public Customer searchCustomerById(Long id){
        for(Customer customer: customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public Customer searchByDocument(String document){
        for (Customer customer: customers){
            if(customer.getDocument().equalsIgnoreCase(document)){
                return customer;
            }
        }
        return null;
    }

    public void listAuthors(){
        System.out.println("==================================");
        System.out.println("************   AUTHORS    ********");
        System.out.println("==================================");
        for(Author author: authors){
            System.out.println( "ID: " + author.getId()+ " Name: " + author.getName());
        }
        System.out.println("==================================");
    }

    public void listCutomers(){
        System.out.println("==================================");
        System.out.println("*********   CUSTOMERS  ************");
        System.out.println("==================================");

        for(Customer customer: customers){
            System.out.println("ID: " + customer.getId() +" Name: " + customer.getName());
        }
        System.out.println("==================================");
    }

    public void listBooks(){
        System.out.println("==================================");
        System.out.println("************   BOOKS   ***********");
        System.out.println("==================================");
        for(Book book: books){
            System.out.println("ID: " + book.getId() + " Title: " + book.getTitle() + " Author: " + book.getAuthor().getName() + " Release date: " + book.getReleaseDate());
        }

        System.out.println("==================================");
    }


    public void doReturn(Loan loan){
        Date returnDate = new Date();
        loan.setReturnDate(returnDate);
        loan.setReturned(true);
    }


    public void searchLoans(){
        for(Loan loan: loans){
            String status = loan.isReturned() ? "Returned" : "Pending";
            System.out.println("Book : " + loan.getBook().getTitle() + "Customer: " + loan.getCustomer().getName() + " Loan date: " + loan.getLoanDate() +
                    " Status: " + status + " ");
            if(loan.isReturned()){
                System.out.println("Return date: " + loan.getReturnDate() + " Fine: " + loan.calculateFine());
            }
        }
    }


}
