package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense){
        return "Wisconsin License: " + driversLicense.getSSSS() + "-"
                + String.format("%03d",driversLicense.getFFF())
                + (driversLicense.getYY() + "").substring(0,1)
                + "-" + (driversLicense.getYY() + "").substring(1)
                + String.format("%03d",driversLicense.getDDD())
                + "-" + driversLicense.getNN() + "0";
    }
}
