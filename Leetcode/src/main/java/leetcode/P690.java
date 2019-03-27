package leetcode;

import java.util.List;

public class P690 {
	class Employee {
	    // It's the unique id of each node;
	    // unique id of this employee
	    public int id;
	    // the importance value of this employee
	    public int importance;
	    // the id of direct subordinates
	    public List<Integer> subordinates;
	};
	public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        for(Employee e : employees) {
        	if(e.id == id) {
        		//return e.importance + getSubOrdinatesImportance(e);
        		total += e.importance;
        		if(e.subordinates == null || e.subordinates.isEmpty()) {
        			return total;
        		}
        		for(Integer i : e.subordinates) {
        			total += getImportance(employees, i);
        		}
        	}
        }
        return total;
    }
	
}
