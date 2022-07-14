package com.cluz.hrworker.repositories;

import com.cluz.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker,Long>{

}
