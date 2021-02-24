package edu.wctc;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException{

        try{
            LocalDate enteredDate = LocalDate.of(year, month, day);
        }
        catch(DateTimeException bday){
            throw new InvalidBirthdayException(year, month, day);
        }
            if(genderCode == CODE_MALE){
                return (((month - 1) * 40) + day + MOD_MALE);
            }
            else if(genderCode == CODE_FEMALE){
                return (((month - 1) * 40) + day + MOD_FEMALE);
            }
            else{
                System.out.println("Not a gender code");
                throw new UnknownGenderCodeException(genderCode);
            }


    }
}
