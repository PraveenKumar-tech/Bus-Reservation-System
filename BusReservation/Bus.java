package BusReservation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int no, boolean ac, int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusno() {
		return busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public int getCapacity() { // Accessory method
		return capacity;
	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	public void setCapacity(int cap) { // mutators
		capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No:"+ busNo + "A/c:"+ ac + " Total Capacity: "+ capacity);
	}
}
