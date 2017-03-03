
public class student {
	private String name , id;
	private char gender;
	private double height , weight;
	public void setname(String name1,String id1){
		name = name1;
		id = id1;
		System.out.println(name1 +" "+id1 );
	}
	public String getname(){
		return name;
	}
	public void setgender(char gender1){
		gender = gender1;
		if(gender1 == 'b'){
			System.out.println("Male");
		}
		if(gender1 == 'g'){
			System.out.println("Female");
		}
		if(gender1 != 'b'&&gender1 != 'g'){
			System.out.println("None");
		}
			
	}
	public char getgender(){
		return gender;
	}
	public void setheight(double high1,double wigh1){
		height = high1;
		weight = wigh1;
		System.out.println(high1 +" "+wigh1 );
	}
}
