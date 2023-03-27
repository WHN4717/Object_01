package com.example.parking;

import java.util.List;

public interface ParkingDAO {
    ParkingLot createParkingLot(ParkingLot parkingLot);
    ParkingSpace createParkingSpace(ParkingSpace parkingSpace);
    Car createCar(Car car);
    ParkingRecord createParkingRecord(ParkingRecord parkingRecord);
    List<ParkingLot> getParkingLots();
    ParkingLot getParkingLotById(int id);
    List<ParkingSpace> getParkingSpacesByLotId(int lotId);
    ParkingSpace getParkingSpaceById(int id);
    Car getCarById(int id);
    ParkingRecord getParkingRecordById(int id);
    ParkingRecord getActiveParkingRecordByCarId(int carId);
    boolean updateParkingSpace(ParkingSpace parkingSpace);
    boolean updateCar(Car car);
    boolean updateParkingRecord(ParkingRecord parkingRecord);
}
