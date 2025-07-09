package polymorphism;

public class Point {
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
	}
	
	public double calculateDistance() {
		return Math.round(Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate)*100.00)/100.00;
	}
	
	public double calculateDistance(Point point) {
		double dx = this.xCoordinate - point.xCoordinate;
        double dy = this.yCoordinate - point.yCoordinate;
        return Math.round(Math.sqrt(dx * dx + dy * dy)*100.00)/100.00;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinatel) {
		this.yCoordinate = yCoordinatel;
	}

}
