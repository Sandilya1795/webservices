package edu.learn.java;

import edu.learn.java.api.LibraryInterface;

public class LibraryImpl implements LibraryInterface {

    public void borrowBooks(){
       System.out.println("Borrowed Books.");
    }

    public void returnBooks(){
        System.out.println("Returned Books.");
    }

    public static void main(String[] args) {
        LibraryImpl library = new LibraryImpl();
        library.borrowBooks();
        library.returnBooks();
    }
}
