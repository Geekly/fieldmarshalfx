package net.geeklythings.fm.ui.fxml;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Window;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML private Window loadTournamentDialog;
    @FXML private LoadTournamentDialogController loadTournamentDialogController;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
