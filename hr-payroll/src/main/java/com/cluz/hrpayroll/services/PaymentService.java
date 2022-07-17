package com.cluz.hrpayroll.services;

import com.cluz.hrpayroll.entities.Payment;
import com.cluz.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}") //pega o valor da variavel do application properties
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;
    /**
     * This method receive informations of the worker, and instanciate a new payment.
     * @param workerID, find in the ms worker, how is the specific id.
     * @param days worked days
     * @return return an object of payment.
     */
    public Payment getPayment(long workerID, int days){
        /*Requisição para uma API externa usando o rest Template*/
        //Criando o mapa de parametros
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerID);   //""+workerID converteu o id de Long para String.

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables); //Segundo parametro é o tipo do objeto que esta buscando.
        return new Payment(worker.getName(), worker.getDailyIncome(), days) ;
    }

}
