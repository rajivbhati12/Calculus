/**
 * Created by rajivbhati on 1/28/17.
 */
public class Calculus {


    public static void main(String[] args){
        CalculusAddition calculusAddition = new CalculusAddition();
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
