package edu.handong.csee.java.converters;

/**
 * This interface is for all converter classes
 */
public interface Convertible {

    /**
     * This method sets the user input
     * @param fromValue user input
     */
    public void setFromValue(double fromValue);

    /**
     * This method returns the converted value
     * @return converted value
     */
    public double getConvertedValue();

    /**
     * This method converts the input to ouput value
     */
    public void convert();

}