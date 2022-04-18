package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button addButton;
    @FXML
    private ListView userListView;
    @FXML
    private ListView reservationListView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField ktTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private ListView tripListView;

    private DataFactory dataFactory = new DataFactory();
    private ObservableList<Passenger> passengers = FXCollections.observableArrayList();
    private ObservableList<Trip> trips = FXCollections.observableArrayList();


    public void addButtonOnActivity(ActionEvent event){
        passengers.add(new Passenger(ktTextField.getText(), usernameTextField.getText(),emailTextField.getText()));

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        passengers = dataFactory.getPassenger(); //fáum hér inn farþegana
        trips = dataFactory.getTrip();

        userListView.setItems(passengers);
        tripListView.setItems(trips);


    }

    public void listViewMouseClicked(javafx.scene.input.MouseEvent mouseEvent) {
        Passenger selectedItem = (Passenger) userListView.getSelectionModel().getSelectedItem();
        usernameTextField.setText(selectedItem.getName());
        emailTextField.setText(selectedItem.getEmail());
        ktTextField.setText(selectedItem.getKt());

        reservationListView.setItems(getReservedTrips(selectedItem));
    }
    private ObservableList<Trip> getReservedTrips(Passenger passenger){
        ObservableList<Trip> reservedTrips = FXCollections.observableArrayList();
        ArrayList<Reservation> reservations = passenger.getReservations();
        for(Reservation reservation: reservations){
            reservedTrips.add(reservation.getTrip()); //getTrip?
        }
        return reservedTrips;
    }
}
