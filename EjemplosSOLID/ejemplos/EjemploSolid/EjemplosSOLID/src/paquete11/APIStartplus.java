package paquete11;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author omerb
 */
public class APIStartplus implements APIMovie {
//mmn
    private String apiKey;
    private String user;

    public String obtenerUser() {
        return user;
    }

    public void establecerUser(String us) {
        user = us;
    }

    @Override
    public void establecerApiKey(String ak) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(900000) + 100000;
        apiKey = ak + "STARTPLUS" + numeroAleatorio + user;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
