package biblioteca;

import java.util.Date;


public class Loan {
    private long id;
    private Customer customer;
    private Book book;
    private Date loanDate;
    private Date returnDate;
    private double loanValue;
    private boolean isReturned;

    public Loan(long id, Customer customer, Book book, Date loanDate, Date returnDate, double loanValue, boolean isReturned) {
        this.id = id;
        this.customer = customer;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.loanValue = loanValue;
        this.isReturned = isReturned;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getLoanValue() {
        return loanValue;
    }

    public void setLoanValue(double loanValue) {
        this.loanValue = loanValue;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }


    public double calculateFine(){
        if(isReturned && returnDate.after(loanDate)){
            long difference = returnDate.getTime() - loanDate.getTime();
            long lateDays = difference / (1000*60*60*24);
            return lateDays * (loanValue * 0.10);
        }else{
            return 0;
        }
    }
}
