package opsys.com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.function.DoubleToLongFunction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner yes = new Scanner(System.in);
        Scanner yesNo = new Scanner(System.in);
        Scanner Lakes = new Scanner (System.in);
        Scanner values = new Scanner(System.in);
        Scanner numberOFtimesperlenght = new Scanner(System.in);

        HashMap<String, ArrayList<Double>> Lakesandtimes = new HashMap<String,ArrayList<Double>>();
        HashMap<String, Double> best = new HashMap<String, Double>();
        //System.out.println("Enter a lake name");

        //System.out.println("How many different lakes did you run ");
        //int time = lakes.nextInt();
        System.out.println("Do you want to enter lake time values? (y/n)");
        String x = yes.nextLine();

       // for (int q = 0; q < time; q++){
        while(true){
            System.out.println("Do you want to enter a value of a lake? (y/n) ");
            String q = yesNo.nextLine().toLowerCase();
            if (q.equals("n")){
                System.out.println("this it watch your code run!!!");
                //System.out.println(Lakesandtimes);
                break;
            }
            System.out.println("Enter the Name of the Lake");
            String name = Lakes.nextLine();
            while (Lakesandtimes.containsKey(name)){
                System.out.println("Lake name has already been entered");
                System.out.println("Enter new lake");
                String name2 = Lakes.nextLine();
                if (Lakesandtimes.containsKey(name2) == false){
                    name = name2;
                    break;
                }
            }
           //k String times2 = "";
            ArrayList<Double> LakeTimes = new ArrayList<Double>();
            System.out.println("How many times did you run that lake");
            int lakecount = numberOFtimesperlenght.nextInt();
            for (int i = 0; i < lakecount; i++) {
                System.out.println("enter lake time " + name + " " + i);
                Double tt = values.nextDouble();
                LakeTimes.add(tt);



                Lakesandtimes.put(name, LakeTimes);
                //best.put(name, )

            }
            Double max = 1000.0;
            for (int b = 0; b < LakeTimes.size(); b++){
                if (LakeTimes.get(b) < max){
                    max = LakeTimes.get(b);
                }


            }
            best.put(name, max);

            //.out.println("How many times did you run the length");
           // int value = numberOFtimesperlenght.nextInt();
            //System.out.println("print values for enties");
            //System.out.println(Lakesandtimes);
        }
        System.out.println("print values for entries ");
        System.out.println(Lakesandtimes);
        System.out.println("print the best times entries");
        System.out.println(best);

        //Set keyset = Lakesandtimes.keySet();

        }



    }

