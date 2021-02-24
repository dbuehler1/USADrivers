package edu.wctc;

public class DriversLicense {
    private String SSSS; //soundex code
    private int FFF; //first name, middle initial
    private int YY; //birth year
    private int DDD; //birth month, Day, Gender
    private int NN; //overflow

    public void setSSSS(String SSSS) {
        this.SSSS = SSSS;
    }

    public void setFFF(int FFF) {
        this.FFF = FFF;
    }

    public void setYY(int YY) {
        this.YY = YY;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public void setNN(int NN) {
        this.NN = NN;
    }

    public String getSSSS() {
        return SSSS;
    }

    public int getFFF() {
        return FFF;
    }

    public int getYY() {
        return YY;
    }

    public int getDDD() {
        return DDD;
    }

    public int getNN() {
        return NN;
    }
}
