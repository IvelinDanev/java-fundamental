package objectsClasses.VehicleCatalogue_05;

public class Vehicle {
    private final String typeOfVehicle;
    private final String modelOfVehicle;
    private final String colorOfVehicle;
    private final int horsepowerOfVehicle;

    public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return this.modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return this.colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return this.horsepowerOfVehicle;
    }
}
