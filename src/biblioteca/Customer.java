package biblioteca;

public class Customer {
    private long id;
    private String name;
    private String document;


    public Customer(long id, String name, String document) {
        this.id = id;
        this.name = name;
        this.document = document;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
