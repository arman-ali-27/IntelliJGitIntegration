package com.pluralsight;

public class CalculateHelper {
    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    public void process(String statement){
        // add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0];
        leftVal = Double.parseDouble(parts[1]);
        rightVal = Double.parseDouble(parts[2]);
    }

    private void setCommandFromString(String commandFromString){
        // add -> 
    }
}
