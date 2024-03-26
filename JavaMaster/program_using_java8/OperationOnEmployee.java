package program_using_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OperationOnEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("pallavi", 12345, 12);
        Employee e2 = new Employee("sachin", 112345, 32);
        Employee e3 = new Employee("sanvi", 100000, 16);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
       // increaseSalTenPer(empList);
        sortByAge(empList);
    }

    public static void  sortByAge(List<Employee> employeeList){
     List<Employee> sorted=   employeeList.stream().sorted((o1,o2)->{
            if(o1.getAge()==o2.getAge())
                return 0;
            else if(o1.getAge() > o2.getAge())
                return 1;
            else return -1;
        }).collect(Collectors.toList());
        for(Employee e:sorted)
        {
            System.out.println(e);
        }
    }

public static void  increaseSalTenPer(List<Employee> employeeList)
    {
      List<Employee> employees = employeeList.stream().filter(e->e.getAge()>25).map(e->{
            e.setSalary(e.getSalary()*2);
            return e;
        }).collect(Collectors.toList());
for(Employee e:employees)
{
    System.out.println(e);
}
    }
}
