package com.cluz.hrpayroll.feignclients;


import com.cluz.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/workers") //name is the name of the other microservice, path : resource to be accessed.
public interface WorkerFeignClient {

    //interface Worker feign client. Defines how to call worker
    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> getWorkerById(@PathVariable Long id );

}