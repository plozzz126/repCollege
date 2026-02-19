package jw.ffeflss;

public class Book {
    private String Title;
    private String Author;
    private int pages;

    public Book(String Title, String Author, int pages){
        this.Title = Title;
        this.Author = Author;
        
        if (pages < 0 ){
            this.pages = 0;
        }else{
            this.pages = pages;
        }
    }

    public void info(){
        System.out.println(Title);
        System.out.println(Author);
        System.out.println(pages);
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
