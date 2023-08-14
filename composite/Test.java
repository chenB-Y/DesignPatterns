package composite;

public class Test {
    public static void main(String[] args) throws Exception {
        Employee e0 = new Engineer();
        Employee e1 = new Engineer();
        Employee e2 = new Engineer();

        Manager m1 = new Manager();
        m1.addEmpolyee(e1);
        m1.addEmpolyee(e2);

        Manager m0 = new Manager();
        m0.addEmpolyee(e0);
        m0.addEmpolyee(m1);
        //                    ********** we want to avoid from all this(create a circle) **************
        //m1.addEmpolyee(e0); //e0 con not be employee of m1 because m0 is his manager and m1's manger
        //m1.addEmpolyee(m0); //m0 is the manager of m1 so m1 cannot be his manager also
       //m1.addEmpolyee(m1); //m1 can not be the employee of himself.

        System.out.println("done!");
    }
}
