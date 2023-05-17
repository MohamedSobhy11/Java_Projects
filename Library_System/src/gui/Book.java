package gui;

public class Book {

    private String id;
    private String callNo;
    private String name;
    private String author;
    private String publisher;
    private String quantity;
    private String issued;
    private String added_date;

    public Book(String id, String callNo, String name, String author, String publisher, String quantity, String issued, String added_date) {

        this.id = id;
        this.callNo = callNo;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
        this.issued=issued;
        this.added_date=added_date;

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the callNo
     */
    public String getCallNo() {
        return callNo;
    }

    /**
     * @param callNo the callNo to set
     */
    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the issued
     */
    public String getIssued() {
        return issued;
    }

    /**
     * @param issued the issued to set
     */
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * @return the added_date
     */
    public String getAdded_date() {
        return added_date;
    }

    /**
     * @param added_date the added_date to set
     */
    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }

}
