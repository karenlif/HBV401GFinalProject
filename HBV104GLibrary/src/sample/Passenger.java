package sample;

import java.util.ArrayList;

public class Passenger {
    public Passenger(String kt, String name, String email) {
            this.kt = kt;
            this.name = name;
            this.email = email;
            this.reservations = new ArrayList<>();
        }

        private String kt;
        private String name;
        private String email;

    public String toString() {
        return name;
    }

    private ArrayList<Reservation> reservations;

        public String getKt() {
            return kt;
        }

        public void setKt(String kt) {
            this.kt = kt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public ArrayList<Reservation> getReservations() {
        return reservations;
        }

        public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
        }
}
