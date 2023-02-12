package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Controller {
   @FXML
   public void WindowsExplorerOpen() throws IOException {
      Process p = new ProcessBuilder("explorer.exe", "/select,C:\\directory\\selectedFile").start();
   }
   @FXML
   public void NewPlayerPane() throws IOException {
      URL fxmlResource = getClass().getResource("nouveauJoueur.fxml");
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(fxmlResource);
      Parent root = loader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setOpacity(1);
      stage.setTitle("My New Stage Title");
      stage.setScene(new Scene(root, 450, 450));
      stage.showAndWait();
   }
   @FXML
   public void FirstGameResultsPane() throws IOException {
      URL fxmlResource = getClass().getResource("saisirResultats.fxml");
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(fxmlResource);
      Parent root = loader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setOpacity(1);
      stage.setTitle("My New Stage Title");
      stage.resizableProperty().setValue(false);
      stage.setScene(new Scene(root, 600, 400));

      stage.showAndWait();
   }
   @FXML
   public void ReverseDocking() throws IOException {
      URL fxmlResource = getClass().getResource("permuterAppareillage.fxml");
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(fxmlResource);
      Parent root = loader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setOpacity(1);
      stage.setTitle("My New Stage Title");
      stage.resizableProperty().setValue(false);
      stage.setScene(new Scene(root, 600, 400));

      stage.showAndWait();
   }


   @FXML
   public void ManageTables() throws IOException {
      URL fxmlResource = getClass().getResource("gestionDesTables.fxml");
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(fxmlResource);
      Parent root = loader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setOpacity(1);
      stage.setTitle("My New Stage Title");
      stage.resizableProperty().setValue(false);
      stage.setScene(new Scene(root, 600, 400));

      stage.showAndWait();
   }
   @FXML
   public void PrintingParameter() throws IOException {
      URL fxmlResource = getClass().getResource("parametresImpression.fxml");
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(fxmlResource);
      Parent root = loader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setOpacity(1);
      stage.setTitle("My New Stage Title");
      stage.resizableProperty().setValue(false);
      stage.setScene(new Scene(root, 600, 400));

      stage.showAndWait();
   }

   @FXML
   public void PlayerPersonnaPrinting() throws IOException {
      URL fxmlResource = getClass().getResource("impressionFichesJoueurs.fxml");
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(fxmlResource);
      Parent root = loader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setOpacity(1);
      stage.setTitle("My New Stage Title");
      stage.resizableProperty().setValue(false);
      stage.setScene(new Scene(root, 600, 400));

      stage.showAndWait();
   }
}
