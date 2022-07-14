package com.cluz.hrworker.resources;

import com.cluz.hrworker.entities.Worker;
import com.cluz.hrworker.repositories.WorkerRepository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository repository; //Injetando dependencia do worker repository, objeto que acessa o BD.

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Long id ){
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
