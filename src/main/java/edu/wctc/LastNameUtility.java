package edu.wctc;

import org.apache.commons.codec.language.Soundex;

import java.util.Locale;

public class LastNameUtility {
    private Soundex soundex = new Soundex();
    public String encodeLastName(String lastName) throws MissingNameException{
        if(lastName.equals(null)){
            throw new MissingNameException("Last Name");
        }
        else return soundex.encode(lastName.toLowerCase());
    }
}
