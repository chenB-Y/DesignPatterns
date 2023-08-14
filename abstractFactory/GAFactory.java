package abstractFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class GAFactory {

    HashMap<String,String> map;

    public GAFactory(String filename) {
        map = new HashMap<>();
        try {
            Stream<String> s = Files.lines(Paths.get(filename));
            s.forEach(str->map.put(str.split("\t")[0],str.split("\t")[1]));
            s.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public <Product> Product get(String key){
        String className = map.get(key);
        if (className != null) {
            try {
                Class<?> c = ClassLoader.getSystemClassLoader().loadClass(className);
                return (Product) c.newInstance();
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
