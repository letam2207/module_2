package case_study.entity;

public class House extends Facility {
    private String roomStandards;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandards, int numberOfFloors,int serviceId,
                 String serviceName, int area,
                 double expense, int maximum, String rentalType) {
        super(serviceId,serviceName,area,expense,maximum,rentalType);
        this.roomStandards = roomStandards;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
