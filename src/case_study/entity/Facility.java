package case_study.entity;

public abstract class Facility {
    private int serviceId;
    private String serviceName;
    private int area;
    private double expense;
    private int maximum;
    private String rentalType;

    public Facility() {
    }

    public Facility(int serviceId, String serviceName, int area,
                    double expense, int maximum, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.expense = expense;
        this.maximum = maximum;
        this.rentalType = rentalType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", expense=" + expense +
                ", maximum=" + maximum +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
