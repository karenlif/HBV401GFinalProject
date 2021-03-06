package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingController implements Initializable {
    @FXML
    private Button NewWindow;
    @FXML
    private ListView tripListView;
    @FXML
    private TextField tripTextField;

    private DataFactory dataFactory = new DataFactory();
    private ObservableList<Trip> trips = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        trips = dataFactory.getTrip();

        tripListView.setItems(trips);

    }

    public void ButtonNewWindow(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Booking");
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.WINDOW_MODAL);
        primaryStage.show();
    }

    public void listViewMouseClicked(javafx.scene.input.MouseEvent mouseEvent) {
        Trip selectedItem = (Trip) tripListView.getSelectionModel().getSelectedItem();
        tripTextField.setText(selectedItem.getName());

    }
}
