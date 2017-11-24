package org.courses.view;

public interface TextConstants {

    interface Messages{
        String WELCOME = "welcome";
        String CHOOSE_LANGUAGE = "choose.language";
        String WHAT_TO_DO = "what.to.do";
        String CREATE_STUDENT = "create.student";

        String ENTER_STUDENT_NAME = "enter.student.name";
        String ENTER_STUDENT_SURNAME = "enter.student.surname";
        String ENTER_STUDENT_TELEPHONE = "enter.student.telephone";
        String ENTER_STUDENT_BIRTH_DATE = "enter.student.birth.date";

        String ALL_STUDENTS = "all.students";

        String LIST_OF_STUDENTS_IS_EMPTY = "list.of.students.is.empty";
        String WRONG_INPUT = "wrong.input";
        String NOTE_CREATED = "note.created";
        String TURN__BACK = "turn.back";

        String YES = "yes";

    }

    interface RegexContainer{
        String REGEX_NAME = "regex.name";
        String REGEX_SURNAME = "regex.surname";
        String REGEX_BIRTH_DATE = "regex.birth.date";
        String REGEX_TELEPHONE = "regex.telephone";
        String REGEX_ADDRESS = "regex.address";
        String REGEX_YES_NO = "regex.yes.no";
        String REGEX_LANGUAGES = "regex.languages";
    }

    interface MenuConstants{
        String SHOW = "1";
        String CREATE = "2";
        String DELETE = "3";
        String EXIT = "4";
        String BACK = "0";
    }
}
