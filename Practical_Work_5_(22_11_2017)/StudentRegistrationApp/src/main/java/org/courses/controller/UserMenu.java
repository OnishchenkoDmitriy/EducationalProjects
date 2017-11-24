package org.courses.controller;

import org.courses.model.StudentJournal;
import org.courses.model.StudentNote;
import org.courses.view.ResourceManager;
import org.courses.view.TextConstants;
import org.courses.view.View;

import static org.courses.view.TextConstants.*;

import java.util.Scanner;

public class UserMenu {

    View view;
    StudentJournal studentJournal;

    public UserMenu(View view, StudentJournal studentJournal) {
        this.view = view;
        this.studentJournal = studentJournal;
    }

    /**
     * run method
     */
    public void runUserMenu(){
        ResourceManager resourceManager = ResourceManager.INSTANCE;
        Scanner scanner = new Scanner(System.in);
        resourceManager.changeResource(getStringValueFromScanner(scanner, Messages.CHOOSE_LANGUAGE,
                RegexContainer.REGEX_LANGUAGES));
        mainMenu(scanner);
    }

    /**
     * main user menu
     * @param scanner scanner
     */
    private void mainMenu(Scanner scanner) {
        view.printMessageFromBundle(Messages.WELCOME);
        boolean isExit = false;
        while (!isExit){
            view.printMessageFromBundle(Messages.WHAT_TO_DO);
            switch (scanner.nextLine()){
                case MenuConstants.SHOW:
                        showStudentsMenu();
                    break;
                case MenuConstants.CREATE:
                    createStudentMenu(scanner);
                    break;
                case MenuConstants.DELETE:
                    //deleteStudentsMenu(scanner);
                    break;
                case MenuConstants.EXIT:
                    isExit = true;
                    break;
                default:
                    view.printMessageFromBundle(Messages.WRONG_INPUT);
                    break;
            }
        }
    }

    /**
     * menu that shows all student notes from student journals
     */
    private void showStudentsMenu(){
        if(!studentJournal.getStudentJournal().isEmpty()){
            view.printMessageFromBundle(Messages.ALL_STUDENTS);
            view.displayElementsFromList(studentJournal.getStudentJournal());
        }else {
            view.printMessageFromBundle(Messages.LIST_OF_STUDENTS_IS_EMPTY);
        }
    }

    /**
     * menu for new student note creating
     * @param scanner scanner
     */
    private void createStudentMenu(Scanner scanner){
        view.printMessageFromBundle(Messages.CREATE_STUDENT);
        String test = "";
        do{
            studentJournal.add(createStudentNote(scanner));
            test = getStringValueFromScanner(scanner, Messages.NOTE_CREATED, RegexContainer.REGEX_YES_NO);
        } while (test.equals(view.getBundleString(Messages.YES)));
    }

    /**
     * get some string value from scanner depends on regex
     * @param scanner scanner
     * @param message message that will be printed before input
     * @param regex regex
     * @return string result depends on regex
     */
    public String getStringValueFromScanner(Scanner scanner, String message, String regex){
        view.printMessageFromBundle(message);
        regex = view.getBundleString(regex);
        String result = scanner.nextLine();
        while (!result.matches(regex)){
            view.printMessageFromBundle(TextConstants.Messages.WRONG_INPUT);
            result = scanner.nextLine();
        }
        return result;
    }


    /**
     * create new student note and set all parameters
     * @param scanner
     * @return new student note
     */
    private StudentNote createStudentNote(Scanner scanner){
            StudentNote studentNote = new StudentNote();
            studentNote.setName(getStringValueFromScanner(scanner, TextConstants.Messages.ENTER_STUDENT_NAME,
                    TextConstants.RegexContainer.REGEX_NAME));
            studentNote.setSurName(getStringValueFromScanner(scanner, TextConstants.Messages.ENTER_STUDENT_SURNAME,
                    TextConstants.RegexContainer.REGEX_SURNAME));
            studentNote.setTelephone(getStringValueFromScanner(scanner, TextConstants.Messages.ENTER_STUDENT_TELEPHONE,
                    RegexContainer.REGEX_TELEPHONE));
            studentNote.setBirthDate(getStringValueFromScanner(scanner, Messages.ENTER_STUDENT_BIRTH_DATE,
                    RegexContainer.REGEX_BIRTH_DATE));
            return studentNote;
    }

}
