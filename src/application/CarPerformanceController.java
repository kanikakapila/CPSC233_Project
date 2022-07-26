package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

	public Stage applicationStage;

    @FXML 
    void proceedToAppearance(ActionEvent event) {   
    	VBox ColourofCarContainer = new VBox(); 
    	Label ColourofCarLabel = new Label("Colour of Car");
    	TextField ColourofCarTextfield = new TextField();  
    	Label TypeofCarLabel = new Label("Type of Car");
    	TextField TypeofCarTextfield = new TextField();
    	
    	 
    	
    	
    	Button backButton = new Button("Back"); 
    	Button nextButton = new Button("Next");
    	ColourofCarContainer.getChildren().addAll(ColourofCarLabel,ColourofCarTextfield);  
    	ColourofCarContainer.getChildren().addAll(TypeofCarLabel,TypeofCarTextfield,backButton,nextButton);
    	
    	
    	
    	Scene proceedToApplicationScene = new Scene(ColourofCarContainer,900,400);
    	
    	//backButton.setOnAction(backEvent -> primaryStage(Performance)); 
    	applicationStage .setScene(proceedToApplicationScene);
    	//System.out.println("Button pressed");

    }

}
