package com.dfx.manuel.repository;

import com.dfx.manuel.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


public interface UserRepository extends ListCrudRepository<loader, Integer>, List<loader> {


}
