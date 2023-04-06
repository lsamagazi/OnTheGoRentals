package za.ac.cput.domain;
/**
 * Vehicle.java
 * Interface for the Vehicle
 * Author: Peter Buckingham (220165289)
 * Date: 29 March 2021
 */

public interface IVehicle extends IDomain{
    int getId();
    String getMake();
    String getModel();
    int getYear();
    String getCategory();
    String getLicensePlate();
    boolean equals(Object o) ;
    public int hashCode() ;
}
