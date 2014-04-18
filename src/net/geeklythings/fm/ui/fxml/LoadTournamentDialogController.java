/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.geeklythings.fm.ui.fxml;
import java.awt.Window;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import net.geeklythings.fm.MainApp;
import net.geeklythings.fm.model.entity.Tournament;

/**
 * FXML Controller class
 *
 * @author ENG-5 USER
 */
public class LoadTournamentDialogController implements Initializable {
    @FXML private TableView<Tournament> tableTournamentList;
    //@FXML private TableColumn<Tournament, String> columnDate;
    //@FXML private TableColumn<Tournament, String> columnLocation;
    //@FXML private TableColumn<Tournament, String> columnNumRounds;
    //@FXML private TableColumn<Tournament, String> columnFormat;
    @FXML private Button buttonNewTournament;
    @FXML private Button buttonLoadTournament;

    private Stage myParent;
    private Stage dialogStage;
    
    public void showDialog( Stage parentStage )
    {    
        this.myParent = parentStage;
        
        try {
            dialogStage = new Stage();
            AnchorPane dialog = FXMLLoader.load(LoadTournamentDialogController.class.getResource("/fxml/LoadTournamentDialog.fxml"));
            Scene scene = new Scene(dialog);
            dialogStage.setScene(scene);
            dialogStage.initOwner(this.myParent);
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.show();
        } catch (Exception ex) {
            System.out.println("Exception happened in show LoadTournamentController");
            ex.printStackTrace();                
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO:  Initialize with list of tournaments
        tableTournamentList.setEditable(true);         
        TableColumn columnDate = new TableColumn("Date");
        TableColumn columnLocation = new TableColumn("Location");
        TableColumn columnNumRounds = new TableColumn("NumRounds");
        TableColumn columnFormat = new TableColumn("Type");     
        
        columnDate.setMinWidth(100);
        columnDate.setCellValueFactory(
                new PropertyValueFactory<Tournament, String>("todaysDate"));
        columnLocation.setMinWidth(300);
        columnLocation.setCellValueFactory(
                new PropertyValueFactory<Tournament, String>("location"));
        columnNumRounds.setMinWidth(100);
        columnNumRounds.setCellValueFactory(
                new PropertyValueFactory<Tournament, Integer>("numRounds"));
        columnFormat.setMinWidth(300);
        /*columnFormat.setCellValueFactory(
                new PropertyValueFactory<Tournament, String>("eventFormatType"));
        */
        tableTournamentList.getColumns().addAll(columnDate, columnLocation, columnNumRounds);
        
        
        List<Tournament> tournaments = MainApp.tournamentManager.getAllTournaments();
        ObservableList<Tournament> tableData = FXCollections.observableList(tournaments);

        System.out.println( tableData.toString() );
        
        
        
        tableTournamentList.setItems(tableData);
    }    

    @FXML
    private void newTournament(ActionEvent event) {
    }

    @FXML
    private void loadTournament(ActionEvent event) {
    }
    
}