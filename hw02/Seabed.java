package hw02;

public class Seabed {
	private String type , name , id;
	public Seabed(){
		
	}
	public Seabed(String type1,String name1){
		type = type1;
		name = name1;
	}
	public Seabed(String type1,String name1,String id1) {
		type = type1;
		name = name1;
		id = id1;
	}
	public void setType(String type2){
		type = type2;
	}
	public void setName(String name2){
		name = name2;
	}
	public void setId(String id2){
		id = id2;
	}
	public String getType(){ return type; }
	public String getName(){ return name; }
	public String   getId(){ return   id; }
	public void showAll(){
		System.out.println("-- -- -- -- -- -- -- -- -- -- --");
		System.out.println(this.getType());
		System.out.println(this.getName());
		System.out.println(this.getId());
		System.out.println("-- -- -- -- -- -- -- -- -- -- --");
	}
}
