package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel="req", path="req")
public interface EmpRepos extends JpaRepository<Emp, Integer>{

}
