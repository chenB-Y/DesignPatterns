package proxy_decorator;

import java.awt.*;

public class EuclideanDis implements DistanceCalcolator{

    public static int calls = 0;
    @Override
    public double getDistance(Point p1, Point p2) {
        calls++;
        int x = p1.x - p2.x;
        int y = p1.y - p2.y;
        return Math.sqrt(x*x + y*y);
    }
}
