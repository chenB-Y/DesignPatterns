package factory;

import java.util.HashMap;

public class EmpFactory {

    HashMap<String,Creator> map ;

    public EmpFactory(){
        map = new HashMap<>();
        map.put("dev", () -> new Developer());
        map.put("man", () -> new Manager());
        map.put("arc", () -> new Architect());

    }

    public Employee createEmp(String key){
        if (map.containsKey(key))
            return map.get(key).create();
        return null;
    }

    private interface Creator{
        Employee create();
    }
// WE DONT NEED THIS BECAUSE THE LAMBADA EXPRESSION
  /*  private class ArcCreator implements  Creator{

        @Override
        public Employee create() {
            return new Architect();
        }
    }
    private class DevCreator implements  Creator{

        @Override
        public Employee create() {
            return new Developer();
        }
    }
    private class ManCreator implements  Creator{

        @Override
        public Employee create() {
            return new Manager();
        }
    }
*/
}
