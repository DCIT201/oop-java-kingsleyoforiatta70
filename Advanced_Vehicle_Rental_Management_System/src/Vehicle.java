public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;


    public Vehicle(String vehicleId,String model,double baseRentalRate,boolean isAvailable){
        this.vehicleId = vehicleId;
        this.model =model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }
    public String getVehicleId(){
        return vehicleId;
    }
    public String getModel(){
        return model;

    }
    public double getBaseRentalRate(){
        return baseRentalRate;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public  String toString(){
        return model + " (ID: " + vehicleId + ")";
    }
}
