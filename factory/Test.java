package factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.chrono.ThaiBuddhistEra;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        Employee e= null;
        EmpFactory ef = new EmpFactory();
        GenericFactory<Employee> gf = new GenericFactory<>();
        //gf.insertProduct("dev",Developer.class); // genericFactory
        //gf.insertProduct("man",Manager.class);  // genericFactory
        //gf.insertProduct("arc",Architect.class); // genericFactory
        while(!(input = in.readLine()).equals("done")){
           e = ef.createEmp(input);
        //    e = gf.getNewProduct(input); // genericFactory
            if (e != null)
                System.out.println(e.getClass() + " was created");
            else
                System.out.println("this type of employee dosent exist!");
        }
    }
}
