package playwrightLearn;

public class iphone {

	//constructor will be invoked when we call an object
	public iphone(){
	
		this("apple watch");
		
	}
	
    public iphone(String which){
		
    	System.out.println("Booting phone "+ which);
	}
	
	
	
	String material = "Metal";
	
	String color = "Black";

		
	public String getOwner() {
		

		return "Pradeep";
	}
	
	protected char turnBluetoothON() {
		return 'Y';
	}
	
	
			
	public static int geBatteryCharge() {
		return 70;
		
		
	}
	

		

}
