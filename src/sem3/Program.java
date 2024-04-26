package sem3;

import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {

        try
        {

            Emploee worker1 = Worker.create("User #1", 2500.0, 10000.0, 2000.0);
            Emploee worker2 = Worker.create("User #2", 2300.0, 10000.0, 2000.0);
            Emploee worker3 = Worker.create("User #3", 2400.0, 10000.0, 2000.0);
            System.out.println(worker1);

            Emploee freeLancer1 = FreeLancer.create("User #1", 20.8 * 8 * 3);
            Emploee freeLancer2 = FreeLancer.create("User #2", 20.8 * 8 * 3);

            System.out.println(freeLancer1);

            ArrayList<Worker> input_array = new ArrayList<Worker>();

            input_array.add((Worker)worker1);
            input_array.add((Worker)worker2);
            input_array.add((Worker)worker3);

            System.out.println(input_array);


            ArrayList<FreeLancer> input_array1 = new ArrayList<FreeLancer>();

            input_array1.add((FreeLancer)freeLancer1);
            input_array1.add((FreeLancer)freeLancer2);
            System.out.println(input_array1);

        }

        catch (Exception e){
            e.printStackTrace();
        }



    }
}