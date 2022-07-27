package com.cluz.hrpayroll.services;

import com.cluz.hrpayroll.entities.Payment;
import com.cluz.hrpayroll.entities.Worker;
import com.cluz.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    /**
     * This method receive information of the worker, and instanciate a new payment.
     *
     * @param workerID, find in the ms worker, how is the specific id.
     * @param days      worked days
     * @return return an object of payment.
     */
    public Payment getPayment(long workerID, int days) {
        Worker worker = workerFeignClient.getWorkerById(workerID).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
