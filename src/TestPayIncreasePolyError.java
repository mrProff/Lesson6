import com.practicaljava.lesson6.Contractor;
import com.practicaljava.lesson6.Employee;
import com.practicaljava.lesson6.ForeignContractor;
import com.practicaljava.lesson6.Person;
import com.practicaljava.lesson6.Payable;

public class TestPayIncreasePolyError {

	public static void main(String[] args) {
		Payable workers[] = new Payable[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new ForeignContractor("Boris"); // Compile-time error
				
		for (Payable p: workers) {
			//((Payable)p).increasePay(30);
			p.increasePay(30);
		}
	}

}
