package test;

public class TestEquals {
	
	
	private int age=27;
	private String name="prakash";
	

	public int getAge() {
		
		return this.age;
	}
	
	public void setAge(int age) {
		
		this.age=age;
		
	}
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getNam() {
		
		return this.name;
	}
	
	@override
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
	    if(obj==null) 
	    	return false;
	    
	    if(this.getClass()!=obj.getClass()) 
	    	return false;
	    
	    TestEquals other = (TestEquals)obj;
	    
	    if(this.age!=other.age) return false;
	    
	    if (this.name==null) {
	    	
	    	if(other.name!=null) return false;
	    		
	    	}
	    else if(!this.name.equals(other.name)) return false;
	    
	    
	    return true;
	}
	
	public static void main(String[] args) {
		
		
		TestEquals te1 = new TestEquals();
		te1.setAge(27);
		te1.setName("prakash");
		
		TestEquals te2 = new TestEquals();
		te2.setAge(27);
		te2.setName("prakash");
		
		if(te1.equals(te2)) {
			
			System.out.println("equal content");
		}
		
		else {
			
			System.out.println("Not equal content");
		}
	}
}
