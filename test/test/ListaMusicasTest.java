/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import main.ListaMusicas;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo
 */
public class ListaMusicasTest {
    
    ListaMusicas musicList;
   
    public ListaMusicasTest() {
        musicList = new ListaMusicas();
        
    }

    

    @Test
    public void testVerificaMP3() {
        assertEquals(true, musicList.verificaMP3("musica.mp3"));        
    }
    
}
