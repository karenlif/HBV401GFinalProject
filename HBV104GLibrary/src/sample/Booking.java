package sample;

import java.util.UUID;

public class Booking {
    public Booking(UUID id, int tripId, String passengerId) {
        this.id = id;
        this.tripId = tripId;
        this.passengerId = passengerId;
    }

    private UUID id;
    private int tripId;
    private String passengerId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }


}
