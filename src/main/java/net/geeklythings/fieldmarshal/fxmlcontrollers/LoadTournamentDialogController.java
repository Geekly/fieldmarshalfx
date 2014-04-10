/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.geeklythings.fieldmarshal.fxmlcontrollers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import net.geeklythings.fieldmarshal.model.entity.Tournament;

/**
 * FXML Controller class
 *
 * @author ENG-5 USER
 */
public class LoadTournamentDialogController implements Initializable {
    @FXML private TableView<Tournament> tableTournamentList;
    @FXML private TableColumn<Tournament, String> columnDate;
    @FXML private TableColumn<Tournament, String> columnLocation;
    @FXML private TableColumn<Tournament, String> columnNumRounds;
    @FXML private TableColumn<Tournament, String> columnFormat;
    @FXML private Button buttonNewTournament;
    @FXML private Button buttonLoadTournament;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newTournament(ActionEvent event) {
    }

    @FXML
    private void loadTournament(ActionEvent event) {
    }
    
}
