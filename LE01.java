

class NishantClass {
    private int Age;
    private String Name;
    
    NishantClass(){
        Age = 20;
        Name  = "Nishant";
    }
    
    void setAge(int Age){
        this.Age = Age;
    }
    
    void setName(String Name){
        this.Name = Name;
    }
    
    void getAge(){
        System.out.println(this.Age);
    }
    
    void getName(){
        System.out.println(this.Name);
    }
}



public class Main
{
	public static void main(String[] args) {
		NishantClass obj = new NishantClass();
		obj.getAge();
		obj.getName();
		obj.setName("DOONE");
		obj.setAge(21);
		obj.getAge();
		obj.getName();
	}
}
