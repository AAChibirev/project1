package javaTasksOOP1;

import java.util.ArrayList;

class Book {
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int quantity;

    public Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, ArrayList<Author> authors, double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //crutches and pain
    public String getAuthorNames(){
        String authorNames = "";
        for(int i = 0; i< authors.size() - 1; i++){
            authorNames += authors.get(i).getName() + "," ;
        }
        authorNames += authors.get(authors.size()-1).getName();
        return authorNames;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
