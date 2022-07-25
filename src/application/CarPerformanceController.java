package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class CarPerformanceController {

    @FXML
    private Label typeOfTires;

    @FXML
    private Label horsePower;

    @FXML
    private Label yourEngineSize;

    @FXML
    private Label transmissionType;

    @FXML
    private ChoiceBox<?> FXCollections;

    @FXML
    private Label methodOfFuel;

    @FXML
    void proceedToAppearance(ActionEvent event) { 
    	System.out.println("Button pressed");

    }

}
