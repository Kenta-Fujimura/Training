public class Dog{
	public static int count=0;

	private int id;
	private String name;
	private double weight;
	private int age;
	public Dog(String name){
		this.setName(name);
		count ++;
			this.setId(count);
	
	}
	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}
	public Dog(String name,int age,double weight){
		this(name,age);
		this.setWeight(weight);
	}
	public void agePlus(){
		this.age++;
	}
	public void bow(){
		System.out.println(this.name+ "  は吠えた");
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		if(weight < 500){
         throw new IllegalArgumentException
           ("体重異常");
       }
		return this.weight;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		if(age<0){
			this.age = 0;
		}else{
			this.age=age;
		}

	}
	public void setWeight(double weight){
		if(weight<0){
			this.weight = 0d;
		}else{
			this.weight=weight;
		}
	}
}

	
