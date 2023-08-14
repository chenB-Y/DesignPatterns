package proxy_decorator;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point(30,-150);

        //DistanceCalcolator ds = new EuclideanDis(); // 3
        DistanceCalcolator ds = new DistanceCachae(new EuclideanDis()); // 1

        System.out.println(ds.getDistance(p1,p2));
        System.out.println(ds.getDistance(p1,p2));
        System.out.println(ds.getDistance(p2,p1));

        System.out.println("num of calls is: "+EuclideanDis.calls);

    }
}
