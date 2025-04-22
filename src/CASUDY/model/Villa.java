package CASUDY.model;

public class Villa extends Facility {
    private String roomStandards;
    private int swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandards, int swimmingPoolArea,
                 int numberOfFloors, int serviceId, String serviceName, int area,
                 double expense, int maximum, String rentalType) {
        super(serviceId, serviceName, area, expense, maximum, rentalType);
        this.roomStandards = roomStandards;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(int swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
