package pl.javastart.OdczytPlikowPowtorzNaKOniec1111111111111111.ZADANIE;

import java.io.Serializable;


public class Company implements Serializable {
    public static final int  MAX_EMPLOYEE = 3;
    private int index = 0;

     Employee[] employeesList = new Employee[MAX_EMPLOYEE];

   public void  addEmployee (Employee employee){
       employeesList[index] = employee;
       index++;
   }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Employee[] getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(Employee[] employeesList) {
        this.employeesList = employeesList;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee : employeesList) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
