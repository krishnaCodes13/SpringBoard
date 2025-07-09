package aggrigation;

public class Room {
	private int roomNo;
	private int capacity;
	private static int roomCounter;
	
	public Room() {
		this.roomNo=++Room.roomCounter;
		this.capacity=4;
	}
	
	static {
		roomCounter=500;
	}
	
	public int getRoomNo() {
		return this.roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static int getRoomCounter() {
		return roomCounter;
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
	
}
