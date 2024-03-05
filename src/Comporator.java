import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    String EName;
    String LName;
    Employee(String EName, String LName){
        this.EName = EName;
        this.LName = LName;
    }
    String getName(){
        return this.EName;
    }
}
class Comporator{
    public static void main(String[] args){
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("lett", "thom"));
        empList.add(new Employee("alan", "thom"));
        empList.add(new Employee("niwin", "anto"));
        Collections.sort(empList,new Comparator<Employee>(){

            @Override
            public int compare(Employee emp1, Employee emp2){
                return emp1.getName().compareTo(emp2.getName());
            }
        });
        for(Employee emp:empList){
            System.out.println("Name "+emp.EName);
        }
    }
}