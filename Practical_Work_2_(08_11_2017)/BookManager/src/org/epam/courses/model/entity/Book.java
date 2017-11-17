package org.epam.courses.model.entity;

import java.util.Comparator;

public class Book {
    private String name;
    private String author;
    private String publishingHouse;
    private int publishingYear;
    private int pageAmount;
    private double priceInDollar;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageAmount() {
        return pageAmount;
    }
    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public double getPriceInDollar() {
        return priceInDollar;
    }
    public void setPriceInDollar(double priceInDollar) {
        this.priceInDollar = priceInDollar;
    }

    public static Comparator<Book> PublishingYearComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            if(o1 == null || o2 == null){
                return 1;
            }
            return (int)(o1.getPublishingYear() - o2.getPublishingYear());
        }
    };

    public static Comparator<Book> PublishingHouseComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            if(o1 == null || o2 == null){
                return 1;
            }
            return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
        }
    };

    public static Comparator<Book> AuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            if(o1 == null || o2 == null){
                return 1;
            }
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };

    public static Comparator<Book> PriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            if(o1 == null || o2 == null){
                return 1;
            }
            return (int)(o1.getPriceInDollar() - o2.getPriceInDollar());
        }
    };

    public static Comparator<Book> NameComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            if(o1 == null || o2 == null){
                return 1;
            }
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageAmount=" + pageAmount +
                ", priceInDollar=" + priceInDollar +
                '}';
    }
}
