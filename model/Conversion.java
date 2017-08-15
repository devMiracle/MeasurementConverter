package conversion.model;

public class Conversion {
    
    private double feet;
    private double yard;
    private double inches;
    private double sqrFoot;
    private double sqrYard;
    private double sqrInch;
    private double cubFoot;
    private double cubInch;
    private double cubMeter;
    
    public Conversion(){}
    /**
     *      conversion from Feet to FeeT
     */
    public double feetToFeet(double newFeet){
        setFeet(newFeet);
        feet = getFeet();
        return feet;
    }
    /**
     *      conversion from Feet to Inch 
     */
    public double feetToInch(double newFeet){
        setFeet(newFeet);
        inches = 12*getFeet();
        return inches;
    }
    /**
     *      conversion from Feet to Yard
     */
    public double feetToYard(double newFeet){
        setFeet(newFeet);
        yard = getFeet()/3;
        return yard;
    }
    
    /**
     * conversion from Yard to Yard
     */
    public double yardToYard(double newYard){
        setYard(newYard);
        yard = getYard();
        return yard;
    }
    /**
     * conversion from Yard to Inch
     */
    public double yardToInch(double newYard){
        setYard(newYard);
        inches = 36*getYard();
        return inches;
    }
    /**
     * conversion from Yard to Feet
     */
    public double yardToFeet(double newYard){
        setYard(newYard);
        feet = 3*getYard();
        return feet;
    }
    /**
     * conversion from Inch To Inch
     */    
    public double inchToInch(double newInches){
        setYard(newInches);
        inches = getYard();
        return inches;
    }
    /**
     * conversion from Inch to Feet
     */
    public double inchToFeet(double newInches){
        setFeet(newInches);
        feet = getFeet()/12;
        return feet;
    }
    /**
     * conversion from Inch To Yard
     */
    public double inchToYard(double newInches){
        setYard(newInches);
        yard = getYard()/36;
        return yard;
    }
    
    
    /**
     * conversion from Square Feet To Square Inch
     */
    public double sqrFeetToSqrInch(double newSqrFoot){
        setSqrFoot(newSqrFoot);
        sqrInch = 144*getSqrFoot();
        return sqrInch;
    }
    /**
     * conversion from Square Feet To Square Yard
     */
    public double sqrFeetToSqrYard(double newSqrFoot){
        setSqrFoot(newSqrFoot);
        sqrYard = getSqrFoot()/9;
        return sqrYard;
    }
    /**
     * conversion from Square Feet To Square Feet
     */
    public double sqrFeetToSqrFeet(double newSqrFoot){
        setSqrFoot(newSqrFoot);
        sqrFoot = getSqrFoot();
        return sqrFoot;
    }
    
    /**
     * conversion from Square Inch To Square Inch
     */
    public double sqrInchToSqrInch(double newSqrInch){
        setSqrInch(newSqrInch);
        sqrInch = getSqrInch();
        return sqrInch;
    }
    /**
     * conversion from Square Inch To Square Yard
     */
    public double sqrInchToSqrYard(double newSqrInch){
        setSqrInch(newSqrInch);
        sqrYard = getSqrInch()/1296;
        return sqrYard;
    }
    /**
     * conversion from Square Inch To Square Feet
     */
    public double sqrInchToSqrFeet(double newSqrInch){
        setSqrInch(newSqrInch);
        sqrFoot = getSqrInch()/144;
        return sqrFoot;
    }
    /**
     * conversion from Square Yard To Square Inch
     */
    public double sqrYardToSqrInch(double newSqrYard){
        setSqrYard(newSqrYard);
        sqrInch = 1296*getSqrYard();
        return sqrInch;
    }
    /**
     * conversion from Square Yard To Square Feet
     */
    public double sqrYardToSqrFeet(double newSqrYard){
        setSqrYard(newSqrYard);
        sqrFoot = 9*getSqrYard();
        return sqrFoot;
    }/**
     * conversion from Square Yard To Square Yard
     */
    public double sqrYardToSqrYard(double newSqrYard){
        setSqrYard(newSqrYard);
        sqrYard = getSqrYard();
        return sqrYard;
    }

    /**
     * conversion from Cubic Feet To Cubic Inch
     */
    public double cubFeetToCubInch(double newCubFoot){
        setCubFoot(newCubFoot);
        cubInch = 1728*getCubFoot();
        return cubInch;
    }
    /**
     * conversion from Cubic Feet To Cubic Meter
     */
    
    public double cubFeetToCubMeter(double newCubFoot){
        setCubFoot(newCubFoot);
        cubMeter = getCubFoot()/35.3147;
        return cubMeter;
    }
    /**
     * conversion from Cubic Feet To Cubic Feet
     */
     public double cubFeetToCubFeet(double newCubFoot){
        setCubFoot(newCubFoot);
        cubFoot = getCubFoot();
        return cubFoot;
    }
     
    /**
     * conversion from Cubic Inch To Cubic Inch
     */
    public double cubInchToCubInch(double newCubInch){
        setCubInch(newCubInch);
        cubInch = getCubInch();
        return cubInch;
    }
    /**
     * conversion from Cubic Inch To Cubic Meter
     */
    public double cubInchToCubMeter(double newCubInch){
        setCubInch(newCubInch);
        cubMeter = getCubInch()/61023.7;
        return cubMeter;
    }
    /**
     * conversion from Cubic Inch To Cubic Feet
     */
    public double cubInchToCubFeet(double newCubInch){
        setCubInch(newCubInch);
        cubMeter = getCubInch()/1728;
        return cubMeter;
    }
    
    /**
     * conversion from Cubic Meter To Cubic Inch
     */
    public double cubMeterToCubInch(double newCubMeter){
        setCubMeter(newCubMeter);
        cubInch = 61023.7*getCubMeter();
        return cubInch;
    }
    /**
     * conversion from Cubic Meter To Cubic Feet
     */
    public double cubMeterToCubFeet(double newCubMeter){
        setCubMeter(newCubMeter);
        cubFoot = 35.3147*getCubMeter();
        return cubFoot;
    }
    /**
     * conversion from Cubic Meter To Cubic Meter
     */
    public double cubMeterToCubMeter(double newCubMeter){
        setCubMeter(newCubMeter);
        cubMeter = getCubMeter();
        return cubMeter;
    }
    /**
     * @return the feet 
     */
    public double getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(double feet) {
        this.feet = feet;
    }

    /**
     * @return the yard
     */
    public double getYard() {
        return yard;
    }

    /**
     * @param yard the yard to set
     */
    public void setYard(double yard) {
        this.yard = yard;
    }

    /**
     * @return the inches
     */
    public double getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(double inches) {
        this.inches = inches;
    }

    /**
     * @return the sqrFoot
     */
    
    public double getSqrFoot() {
        return sqrFoot;
    }

    /**
     * @param sqrFoot the sqrFoot to set
     */
    public void setSqrFoot(double sqrFoot) {
        this.sqrFoot = sqrFoot;
    }

    /**
     * @return the sqrYard
     */
    public double getSqrYard() {
        return sqrYard;
    }

    /**
     * @param sqrYard the sqrYard to set
     */
    public void setSqrYard(double sqrYard) {
        this.sqrYard = sqrYard;
    }

    /**
     * @return the sqrInch
     */
    public double getSqrInch() {
        return sqrInch;
    }

    /**
     * @param sqrInch the sqrInch to set
     */
    public void setSqrInch(double sqrInch) {
        this.sqrInch = sqrInch;
    }

    /**
     * @return the cubFoot
     */
    public double getCubFoot() {
        return cubFoot;
    }

    /**
     * @param cubFoot the cubFoot to set
     */
    public void setCubFoot(double cubFoot) {
        this.cubFoot = cubFoot;
    }

    /**
     * @return the cubInch
     */
    public double getCubInch() {
        return cubInch;
    }

    /**
     * @param cubInch the cubInch to set
     */
    public void setCubInch(double cubInch) {
        this.cubInch = cubInch;
    }

    /**
     * @return the cubMeter
     */
    public double getCubMeter() {
        return cubMeter;
    }

    /**
     * @param cubMeter the cubMeter to set
     */
    public void setCubMeter(double cubMeter) {
        this.cubMeter = cubMeter;
    }
    
    
 
  }