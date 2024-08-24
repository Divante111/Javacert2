package academy.learnprogramming.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO = plain old java object
public class Company {
    
    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorter(){
        System.out.println("companyName = " + name);

        Collections.sort(employees);
        System.out.println("sorted  = " + employees);
    }

    public void setName(String name){
        if(name == null){
            System.out.println("Name cant be null");
            return;
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void addEmployee(String name){
        if (name == null || name.isEmpty()){
            System.out.println("can't add null employee");
            return;
        }
        employees.add(name);
    }
    
}
