package nischal.test.project.custom.jpa.query.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nischal.test.project.custom.jpa.query.entity.Boys;

@Repository
public interface BoysRepository extends CrudRepository<Boys,Integer>{
      public Boys findByHobby(String Hobby);
      public Boys findByAlahuStartsWith(String Hobby);
}
