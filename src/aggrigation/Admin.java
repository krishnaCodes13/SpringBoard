package aggrigation;

public class Admin {
	
	public void assignRoom(Room[] room, Member member) {
		for(int i=0; i<room.length; i++) {
			if(room[i].getCapacity()>=1) {
				member.setRoom(room[i]);
				room[i].setCapacity(room[i].getCapacity() - 1);
				return;
			}
		}
	}
}
