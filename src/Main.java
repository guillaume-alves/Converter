import java.util.Scanner;
 
public class Main {

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    public static void main(String []args) {

        char reponse = 'Y';
        double option, data, dataC, arrondDataC;
        Scanner sc0 = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            do {
                // Presentation message
                System.out.println("--------------------ALL-IN-ONE CONVERTER--------------------\n");
                System.out.println("Choose the converter mode :\n 1 - Celsius to Fahrenheit\n 2 - Fahrenheit to Celsius\n 3 - cm to Inch\n 4 - Inch to cm");
                option = sc0.nextDouble();

                // Message if no valid option
                if (option != 1 && option != 2 && option != 3 && option != 4) {System.out.println("Error - no valid option");}
            } while (option != 1 && option != 2 && option != 3 && option != 4);

            // Enter data
            System.out.println("Type the value to convert :");
            data = sc1.nextDouble();

            // Conversion Celcius - Fahrenheit
            if (option == 1) {
                dataC = ((data*(double)1.8)+32);
                arrondDataC = arrondi(dataC, 2);
                System.out.println(data + " degrees Celsius = " + arrondDataC + " degrees Fahrenheit.");
            }

            // Conversion Fahrenheit- Celcius
            else if (option == 2) {
                dataC = ((data-32)/(double)1.8);
                arrondDataC = arrondi(dataC, 2);
                System.out.println(data + " degrees Fahrenheit = " + arrondDataC + " degrees Celsius.");
            }

            // Conversion Cm - Inch
            else if (option == 3) {
                dataC = (data*0.39);
                arrondDataC = arrondi(dataC, 2);
                System.out.println(data + " cm = " + arrondDataC + " inch.");
            }

            // Conversion Inch - Cm
            else if (option == 4) {
                dataC = (data*2.54);
                arrondDataC = arrondi(dataC, 2);
                System.out.println(data + " inch " + arrondDataC + " cm.");
            }

            do {
                //Re-try message
                System.out.println("Do you want to do another conversion ? (Y/N)");
                reponse = sc2.nextLine().charAt(0);

                // Message if no valid option
                if (reponse != 'Y' && reponse != 'N') {System.out.println("Error - no valid option");}

            } while(reponse != 'Y' && reponse != 'N');

            //End of main loop
        } while (reponse == 'Y');
        System.out.println("Good-bye !");
    }
}

