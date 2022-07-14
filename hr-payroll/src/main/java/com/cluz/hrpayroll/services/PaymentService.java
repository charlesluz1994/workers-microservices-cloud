package com.cluz.hrpayroll.services;

import com.cluz.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    /**
     * This method receive informations of the worker, and instanciate a new payment.
     * @param workerID, find in the ms worker, how is the specific id.
     * @param days
     * @return return a object of payment.
     */
    public Payment getPayment(long workerID, int days){
        return new Payment("Nathalia L.", 100.0, days) ;
    }

}
