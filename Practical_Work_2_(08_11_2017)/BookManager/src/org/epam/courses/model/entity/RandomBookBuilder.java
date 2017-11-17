package org.epam.courses.model.entity;

import org.epam.courses.model.constants.*;

public class RandomBookBuilder {

    private BookNames[] bookNames;
    private BookAuthors[] bookAuthors;
    private PublishingHouses[] publishingHouses;
    private int indexForBookNames;

    public RandomBookBuilder() {
        bookNames = BookNames.values();
        indexForBookNames = 0;
        bookAuthors = BookAuthors.values();
        publishingHouses = PublishingHouses.values();
    }

    public int getRandomValueBetweenMinAndMax(int minValue, int maxValue){
        return (int)Math.ceil(Math.random() * (maxValue - minValue - 1) + minValue);
    }

    public String getRandomName(){
        return bookNames[indexForBookNames++].getBookName();
    }

    public String getRandomAuthor(){
        int randomIndex = getRandomValueBetweenMinAndMax(0, bookAuthors.length);
        return bookAuthors[randomIndex].getAuthorName();
    }

    public String getRandomPublishingHouse(){

        int randomIndex = getRandomValueBetweenMinAndMax(0, publishingHouses.length);
        return publishingHouses[randomIndex].getPublHouseName();
    }

    public Book buildRandomBook(){
        Book book= new Book();

        book.setName(getRandomName());
        book.setAuthor(getRandomAuthor());
        book.setPublishingHouse(getRandomPublishingHouse());
        book.setPublishingYear(getRandomValueBetweenMinAndMax(GlobalConstants.MIN_PUBLISHING_YEAR,
                GlobalConstants.MAX_PUBLISHING_YEAR));
        book.setPageAmount(getRandomValueBetweenMinAndMax(GlobalConstants.MIN_PAGE_AMOUNT,
                GlobalConstants.MAX_PAGE_AMOUNT));
        book.setPriceInDollar(getRandomValueBetweenMinAndMax(GlobalConstants.MIN_PRICE_IN_DOLLAR,
                GlobalConstants.MAX_PRICE_IN_DOLLAR));
        return book;
    }
}
