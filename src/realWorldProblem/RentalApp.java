package realWorldProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalApp {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String vehicleType=null;
		
		String choice="yes";
		
		while(choice.equals("yes")) {
			while(true) {
				System.out.println("Enter vehicle Type (car/bike) :");
				try {
					vehicleType = br.readLine();
					if(!vehicleType.equals("car") && !vehicleType.equals("bike")) {
						throw new VehicleTypeException("Enter valid vehicle type...!");
					}
					break;
				}catch(VehicleTypeException e) {
					System.out.println(e.getMessage());
				}
			}
		
		
			System.out.println("Enter vehicle number :");
			String vehicleNumber=br.readLine();
		
			System.out.println("Enter fuel type : ");
			String fuelType = br.readLine();
		
			int numberOfSeats=0;
			int engineCapacity=0;
		
			if(vehicleType.equals("car")) {
				while(true) {
				System.out.println("Enter number of seats :");
				try {
					numberOfSeats = Integer.parseInt(br.readLine());
					if(numberOfSeats>7 || numberOfSeats<=0) {
						throw new NoSeatsException("Enter valid number of seats...!");
					}
					break;
				}catch(NoSeatsException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println("invalid data..");
				}
			}
		}else{
			while(true) {
				System.out.println("Enter engine capacity :");
				try {
					engineCapacity = Integer.parseInt(br.readLine());
					if(engineCapacity>200 || engineCapacity<50) {
						throw new EngineCapacityException("Enter valid engine capacity...!");
					}
					break;
				}catch(EngineCapacityException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println("Invalid data...");
				}
			}
		}
		
		int numberOfDays=0;
		
		while(true) {
			System.out.println("Enter number of rental days :");
			try {
				numberOfDays = Integer.parseInt(br.readLine());
				if(numberOfDays<=0) {
					throw new NoOfDaysException("Enter valid days...!");
				}
				break;
			}catch(NoOfDaysException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("Invalid data...");
			}
		}
		
		if(vehicleType.equals("car")) {
			Car car = new Car(vehicleNumber, fuelType, numberOfSeats);
			car.generateBill(numberOfDays);
			System.out.println(car);
		}else {
			Bike bike = new Bike(vehicleNumber, fuelType, engineCapacity);
			bike.generateBill(numberOfDays);
			System.out.println(bike);
		}
		
		System.out.println("Do you want to rent another vehicle ? (yes/no)");
		choice=br.readLine();
		if(choice.equals("no")) {
			System.out.println("Total Tax : "+Vehicle.totalTax);
			break;
		}
		}
		
	}
	
}
