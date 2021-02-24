package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense){
        return "Florida License: " + driversLicense.getSSSS() + "-"
                + String.format("%03d",driversLicense.getFFF())  + "-"
                + String.format("%02d",driversLicense.getYY()) + "-"
                + String.format("%03d",driversLicense.getDDD())
                + "-" + driversLicense.getNN();
    }
}
