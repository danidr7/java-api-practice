package br.com.danidr7.repository;

import br.com.danidr7.domain.Saiyajin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SaiyajinRepository extends MongoRepository<Saiyajin, String> {

    public List<Saiyajin> findByName(String name);

}
