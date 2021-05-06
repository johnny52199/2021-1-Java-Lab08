package edu.handong.csee.java.converters;

/**
 * This is the class that converts KM to Mile
 */
public class KMToMILEConverter implements Convertible {

    private double convertedValue = 0;
    private double toConvert = 0;

    /**
     * This is a method that sets the value to convert
     */
    public void setFromValue(double fromValue) {
        toConvert = fromValue;
    }

    /**
     * This is a method that reteruns the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }

    /**
     * This is a method that converts km to mile
     */
    public void convert() {
        convertedValue = toConvert / 1.6;
    }

}
