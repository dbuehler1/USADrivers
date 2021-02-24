package edu.wctc;

import java.sql.Driver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidBirthdayException, MissingNameException, UnknownGenderCodeException {
	Scanner reader = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fName = reader.nextLine().toUpperCase();
        System.out.println("Enter Middle Initial: ");
        String middleInit = reader.nextLine().toUpperCase();
        System.out.println("Enter Last Name: ");
        String lName = reader.nextLine().toUpperCase();
        System.out.print("Enter Date of birth(format mm-dd-yyyy): ");
        String[] dob = reader.nextLine().split("-");
        System.out.println("Male or Female(M or F): ");
        char genderCode = reader.nextLine().toUpperCase().charAt(0);

        DriversLicense driver1 = new DriversLicense();
        FirstNameUtility fUtil = new FirstNameUtility();
        LastNameUtility lUtil = new LastNameUtility();
        MonthDayGenderUtility mdgUtil = new MonthDayGenderUtility();
        try{
            driver1.setSSSS(lUtil.encodeLastName(lName));
            driver1.setFFF(fUtil.encodeFirstName(fName, middleInit));
            driver1.setDDD(mdgUtil.encodeMonthDayGender(Integer.parseInt(dob[2]), Integer.parseInt(dob[0]), Integer.parseInt(dob[1]), genderCode));
            driver1.setYY(Integer.parseInt(dob[2].substring(2)));
        }

        catch(MissingNameException | UnknownGenderCodeException | InvalidBirthdayException m){
            throw m;
        }
        WisconsinFormatter wisFormat = new WisconsinFormatter();
        FloridaFormatter floFormat = new FloridaFormatter();
        System.out.println(wisFormat.formatLicenseNumber(driver1));
        System.out.println(floFormat.formatLicenseNumber(driver1));


    }
}
