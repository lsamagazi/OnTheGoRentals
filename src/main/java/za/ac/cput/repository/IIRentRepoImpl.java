package za.ac.cput.repository;

import za.ac.cput.domain.Rental;

import java.util.ArrayList;
import java.util.List;

/**
 * Lonwabo Magazi-218331851
 * Date: March 2023
 * IIRentRepoImpl.java
 */

public class IIRentRepoImpl implements IRentalRepository{

    private List<Rental> rentals;
    private static IIRentRepoImpl repository = null;

    private IIRentRepoImpl() {
        rentals = new ArrayList<>();
    }

    // Singleton
    public static IIRentRepoImpl getRepository() {
        if (repository == null) {
            repository = new IIRentRepoImpl();
        }
        return repository;
    }

    @Override
    public Rental create(Rental rental) {
        rentals.add(rental);
        return rental;
    }

    @Override
    public Rental read(Integer integer) {
        return null;
    }

    @Override
    public Rental update(Rental entity) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public Rental getRentalById(Integer id) {
        return null;
    }

    @Override
    public List<Rental> getAllRentals() {
        return null;
    }
}
