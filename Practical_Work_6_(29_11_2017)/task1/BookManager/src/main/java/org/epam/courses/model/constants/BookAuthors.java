package org.epam.courses.model.constants;

public enum BookAuthors {

    AUTHOR_1("Chinua Achebe"),
    AUTHOR_2("Peter Ackroyd"),
    AUTHOR_3("Constance Briscoe"),
    AUTHOR_4("Carmen Callil"),
    AUTHOR_5("Lauren Child"),
    AUTHOR_6("Roald Dahl"),
    AUTHOR_7("Germaine Greer"),
    AUTHOR_8("David Harsent"),
    AUTHOR_9("Nick Hornby"),
    AUTHOR_10("Aldous Huxley"),
    AUTHOR_11("Jay McInerney"),
    AUTHOR_12("Ken Follett"),
    AUTHOR_13("Milan Kundera"),
    AUTHOR_14("Tony Kushner"),
    AUTHOR_15("Edwin Morgan");

    private String authorName;

    BookAuthors(String authorName){
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
}
