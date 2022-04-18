package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class DataFactory {
    public DataFactory() {
    }

    public ObservableList<Passenger> getPassenger() {
        ObservableList<Passenger> passengers = FXCollections.observableArrayList();
        Passenger passenger1 = new Passenger("1212903689", "Anna", "anna@gmail.com");
        Passenger passenger2 = new Passenger("1111903399", "Thomas", "thomas@gmail.com");
        Passenger passenger3 = new Passenger("1010882299", "Gabriel", "gabriel@gmail.com");

        //ArrayList<Trip> trips = getTrip(); //get available trips
        ObservableList<Trip> trips = getTrip();

        ArrayList<Reservation> reservations1 = new ArrayList<>();

        reservations1.add(new Reservation(passenger1, trips.get(1)));
        reservations1.add(new Reservation(passenger1, trips.get(2)));
        reservations1.add(new Reservation(passenger1, trips.get(3)));
        passenger1.setReservations(reservations1);

        //The same for the second user
        ArrayList<Reservation> reservations2 = new ArrayList<>();
        reservations2.add(new Reservation(passenger1, trips.get(2)));
        passenger2.setReservations(reservations2);

        ArrayList<Reservation> reservations3 = new ArrayList<>();
        reservations3.add(new Reservation(passenger3, trips.get(3)));
        passenger3.setReservations(reservations3);

        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        return passengers;
    }
    /* public ArrayList<Trip> getTrip (){
        ArrayList<Trip> trips = new ArrayList<>();
        trips.add(new Trip(1,"Bláa Lónið", 13.000,"2022,1,2, 12:00"));
        trips.add(new Trip(2,"The Golden circle", 14.000,"2022,12,2, 12:00"));
        trips.add(new Trip(3,"Hvalaskoðun", 12.000,"2022,5,2, 12:00"));
        trips.add(new Trip(4,"Skíðaferð", 69.990,"2022,8,2, 12:00"));
        return trips;
    } */
    public ObservableList<Trip> getTrip (){
        ObservableList<Trip> trips = FXCollections.observableArrayList();
        trips.add(new Trip(1,"Bláa Lónið", 13.000,"2022,1,2, 12:00"));
        trips.add(new Trip(2,"The Golden circle", 14.000,"2022,12,2, 12:00"));
        trips.add(new Trip(3,"Hvalaskoðun", 12.000,"2022,5,2, 12:00"));
        trips.add(new Trip(4,"Skíðaferð", 69.990,"2022,8,2, 12:00"));
        return trips;
    }

}
