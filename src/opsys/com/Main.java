package opsys.com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //
        Scanner yes = new Scanner(System.in);
        Scanner yesNo = new Scanner(System.in);
        Scanner Lakes = new Scanner(System.in);
        Scanner values = new Scanner(System.in);
        Scanner numberOFtimesperlenght = new Scanner(System.in);

        //Have a Hashmap to get all of the Lake Values for a particular lake

        HashMap<String, ArrayList<Double>> Lakesandtimes = new HashMap<String, ArrayList<Double>>();
        //Have a second HashMap get all of the best values for one lake
        HashMap<String, Double> best = new HashMap<String, Double>();

        //System.out.println("Do you want to enter lake time values? (y/n)");
        //String x = yes.nextLine();

      //  if (x.equals('y')) {
            // for (int q = 0; q < time; q++){
            while (true) {
                System.out.println("Do you want to enter a value of a lake? (y/n) ");
                String q = yesNo.nextLine().toLowerCase();
                if (q.equals("n")) {
                    System.out.println("this it watch your code run!!!");
                    //System.out.println(Lakesandtimes);
                    break;
                }
                System.out.println("Enter the Name of the Lake");
                String name = Lakes.nextLine();
                while (Lakesandtimes.containsKey(name)) {
                    System.out.println("Lake name has already been entered");
                    System.out.println("Enter new lake");
                    String name2 = Lakes.nextLine();
                    //We are only allowing for one set of lake time entries
                    if (Lakesandtimes.containsKey(name2)) {
                        //set name = name2
                        name = name2;
                        break;
                    }
                }
                //Have an arraylist for LakeTimes to be gathered for each lake name entered
                ArrayList<Double> LakeTimes = new ArrayList<Double>();
                //How many times did the person run that particular lake
                System.out.println("How many times did you run that lake");

                int lakecount = numberOFtimesperlenght.nextInt();
                for (int i = 0; i < lakecount; i++) {
                    System.out.println("enter lake time " + name + " " + i);
                    Double tt = values.nextDouble();
                    LakeTimes.add(tt);
                    Lakesandtimes.put(name, LakeTimes);
                }
                Double max = 1000.0;
                for (int b = 0; b < LakeTimes.size(); b++) {
                    if (LakeTimes.get(b) < max) {
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


