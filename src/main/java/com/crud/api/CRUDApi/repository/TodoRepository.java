package com.crud.api.CRUDApi.repository;

import com.crud.api.CRUDApi.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
   /* The CrudRespository interface takes in the model and the type of the ID, in our
    case the model  and the ID type is Long. We are now able to use all the CrudRepository methods save(),
    findOne(), findById(), findAll(), count(), delete(), deleteById() without providing implementation.
    */
