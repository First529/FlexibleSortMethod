
public class Main {
	
	public static void main(String[] args) {
		Student[] s = { new Student("Reggie", 7548), new Student("Adam", 1234), 
						new Student("James", 254), new Student("Kate", 999)
					  };
		sort(s, new NameComparator());
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName());
		}
	}
	
	static void sort(Object[] data, Comparator cmp) {
		for (int i = 0; i < data.length - 1; i++) {
			int minPos = i;	

			for (int j = i + 1; j < data.length; j++) {  
				if (cmp.compare(data[j], data[minPos]) < 0) { 
					minPos = j; 
				}
			}
			Object temp = data[minPos];
			data[minPos] = data[i];
			data[i] = temp;
		}
	}
}
