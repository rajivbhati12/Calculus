/**
 * Created by rajivbhati on 1/28/17.
 */

package main.java;

public class Calculus {
    public static void main(String[] args){
        Addition calculusAddition = new Addition();
        double output = 0;
        String arg0 = args[0];

        switch (arg0.toLowerCase()){
            case "add":
                output = calculusAddition.addValues(
                        Integer.parseInt(args[1]),
                        Integer.parseInt(args[2])
                );
                break;
        }

        System.out.print("Output = " + output);
    }
}
