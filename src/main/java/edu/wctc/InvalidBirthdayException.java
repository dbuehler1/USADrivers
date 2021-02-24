package edu.wctc;

public class InvalidBirthdayException extends Exception{
    public InvalidBirthdayException(int year, int month, int day){
        super("Invalid Birthday: Y:" + year + " || M: " + month + " || D: " + day);

    }
}
