package com.example.tacocloud.repository;

import com.example.tacocloud.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
