/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

import java.util.Random;


public class APIAmazonMovie implements APIMovie{
    
    private String apiKey;
    private String user;

    public String obtenerUser() {
        return user;
    }

    public void establecerUser(String us) {
        user = us;
    }
    
    @Override
    public void establecerApiKey(String ak){
         Random rand = new Random();
        int numeroAleatorio = rand.nextInt(900000) + 100000;
        apiKey = ak+"AMAZON"+numeroAleatorio+";"+user;
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
