package playwrightLearn;

public class Myphone {
	
	
	public static void getModel(int year) {
		
		if(year<2020 ) {
			
			System.out.println("iphone 12");
		 } else if(year<2021 ) {
					
					System.out.println("iphone 13");
				 }  else if(year<2022 ) {
						
						System.out.println("iphone 14");
					 }
		
		
	}
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		iphone obj = new iphone("");
		String owner = obj.getOwner();
		char turnBluetoothON = obj.turnBluetoothON();
		System.out.println(owner);
		System.out.println(turnBluetoothON);
		 int charge =  iphone.geBatteryCharge();
			System.out.println(charge);
			
			getModel(2020);
	}
    
	

}
