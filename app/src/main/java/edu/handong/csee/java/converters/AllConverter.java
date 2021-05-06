package edu.handong.csee.java.converters;

/**
 * This is the class that converts single input to multiple outputs
 */
public class AllConverter {

    private double toConvert = 0;
    private String unit = null;

    /**
     * This method returns the user input
     * @param fromValue user input
     * @return fromValue
     */
    public AllConverter setFromValue(double fromValue) {
        this.toConvert = fromValue;
        return this;
    }

    /**
     * This method returns the unit of the input
     * @param originalMeasure unit of the input
     * @return originalMeasure
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.unit = originalMeasure;
        return this;
    }

    /**
     * This method converts and prints the value
     */
    public void convertAndPrintOut() {
        if(unit.equals("KM")) {
            System.out.println(toConvert + " " + unit + " to " + toConvert * 1000 + " " + "M");
            System.out.println(toConvert + " " + unit + " to " + toConvert / 1.6 + " " + "MILE");
        } else if(unit.equals("TON")) {
            System.out.println(toConvert + " " + unit + " to " + toConvert * 1000 + " " + "KG");
            System.out.println(toConvert + " " + unit + " to " + toConvert * 1000000 + " " + "G");
        } else {
            System.out.println("AllConverter cannot support the measure!");
        } 
    }
}
