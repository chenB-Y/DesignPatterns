package composite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Manager extends Employee{
    static HashSet<Employee> hasAManager = new HashSet<>();
    List<Employee> employeess;
    public Manager(){
        employeess = new ArrayList<>();
    }
    public void addEmpolyee(Employee e) throws Exception{
        if (hasAManager.contains(e) || findMe(e))
            throw new Exception("this employee already has a manager ");
        else {
            employeess.add(e);
            hasAManager.add(e);
        }
    }
    private boolean findMe(Employee e){
        if (e==this)
            return true;
        if(e.getClass()== Manager.class){
            Manager m  = (Manager) e;
            for (Employee emp: m.employeess)
                if (findMe(emp))
                    return true;
        }
        return false;
    }
}
