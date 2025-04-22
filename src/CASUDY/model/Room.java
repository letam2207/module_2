package CASUDY.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService,int serviceId, String serviceName,
                int area,
                double expense, int maximum, String rentalType) {
        super(serviceId,serviceName,area,expense,maximum,rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
