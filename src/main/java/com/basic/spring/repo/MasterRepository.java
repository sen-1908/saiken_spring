package com.basic.spring.repo;


import com.basic.spring.model.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends CrudRepository<Master,String> {
}
