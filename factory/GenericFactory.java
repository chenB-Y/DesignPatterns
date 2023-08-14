package factory;

import java.util.HashMap;

public class GenericFactory<Product> {

    private interface Creator<Product>{
        Product create();
    }

    HashMap<String,Creator<Product>> map ;

    public GenericFactory() {
        this.map = new HashMap<>();
    }

    public void insertProduct(String key, Class<? extends Product> c){ // all the class that have a same type like product
        map.put(key, new Creator<Product>() {
            @Override
            public Product create() {
                try {
                    return c.newInstance();
                } catch (InstantiationException | IllegalAccessException e){
                    e.printStackTrace();
                }
                return null;
            }
        });
    }

    public Product getNewProduct(String key){
        if (map.containsKey(key))
            return map.get(key).create();
        return null;
    }
}
