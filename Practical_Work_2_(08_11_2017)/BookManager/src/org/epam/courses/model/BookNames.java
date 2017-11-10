package org.epam.courses.model;

public enum  BookNames {
    BOOK_NAME_1("Innocent Ring"),
    BOOK_NAME_2("The Adrift Kingkiller"),
    BOOK_NAME_3("Charmer of Possession"),
    BOOK_NAME_4("The Forest's Hedge"),
    BOOK_NAME_5("The Lamp of the Year"),
    BOOK_NAME_6("Friday in the Moon"),
    BOOK_NAME_7("Hidden Ways"),
    BOOK_NAME_8("The Charnal Light"),
    BOOK_NAME_9("King of Harbor"),
    BOOK_NAME_10("The Sanctuary's Legend"),
    BOOK_NAME_11("The Land of the Land"),
    BOOK_NAME_12("Fortress in the Change"),
    BOOK_NAME_13("Red Challenge"),
    BOOK_NAME_14("The Last Wednesday"),
    BOOK_NAME_15("Quest of Ascension"),
    BOOK_NAME_16("The Day's Betrayal"),
    BOOK_NAME_17("The Money of the Need"),
    BOOK_NAME_18("Trilogy in the Wrath"),
    BOOK_NAME_19("Journeyman of Wind"),
    BOOK_NAME_20("Law in the Lord");

    private String bookName;

    BookNames(String bookName){
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }
}
