
package main;



import java.io.File;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;


import javafx.scene.control.Slider;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class ControllerMusicPlayer {
    
    Media media;
    MediaPlayer player;
    
    @FXML
    Slider sliderVolume;
    
    @FXML
    ListView listaMusicas;
    
    @FXML
    Label nomeMusica;
    
    public ControllerMusicPlayer(){
        media = new Media(new File("C:\\Users\\Bernardo\\Music\\ego.mp3").toURI().toString());
        player = new MediaPlayer(media);
        player.volumeProperty().setValue(0.5);
        System.out.println("1");
       Label label = nomeMusica;
        //label.setText("ego");
        //ObservableList<String> items = FXCollections.observableArrayList("asdada");
        //listaMusicas.setItems(items);
        
       
        
    }
    
    
    
    public void playMusic(){
        player.play();
        
    }
    
    public void pauseMusic(){
        player.pause();
    }
    public void nextMusic(){
        
    }
     public void prevMusic(){
        
    }
    
    public void volumeMusic(){
        player.volumeProperty().setValue(sliderVolume.getValue()/100);
    }
    
    
    
    
   
}
