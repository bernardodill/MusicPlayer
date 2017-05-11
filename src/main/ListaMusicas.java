
package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ListaMusicas{
    
    String path = System.clearProperty("user.home")+"\\Music";
    List<Musica> musicList;
    
   
    public List ListaMusicas() {
        musicList = new ArrayList();
        return musicList;
    }
    
    public void addMusica(){
       for(String musica: listaArquivos()){
           if(verificaMP3(musica)){
               musicList.add(new Musica(musica,path));
           }
       }
    }
    
    public boolean verificaMP3(String m){
        return m.endsWith("mp3");
    }

    private String[] listaArquivos() {
       return new File(path).list();
    }
    
    
    
    
    
}
