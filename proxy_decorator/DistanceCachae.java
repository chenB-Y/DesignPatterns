package proxy_decorator;

import java.awt.*;
import java.util.HashMap;

public class DistanceCachae implements DistanceCalcolator{
   DistanceCalcolator dc;
    HashMap<String,Double> map;

    public DistanceCachae(DistanceCalcolator dc) {
        this.dc= dc;
        map = new HashMap<>();
    }

    @Override
    public double getDistance(Point p1, Point p2) {
        String k1 = p1.toString() + "," + p2.toString();
        if (map.containsKey(k1))
            return map.get(k1);
        String k2 = p2.toString() + "," + p1.toString();
        if(map.containsKey(k2))
            return map.get(k2);
        else {
            double dist = dc.getDistance(p1,p2);
            map.put(k1,dist);
            map.put(k2,dist);
            return  dist;
        }
    }
}
