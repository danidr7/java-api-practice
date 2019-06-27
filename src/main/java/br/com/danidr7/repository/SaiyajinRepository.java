package br.com.danidr7.repository;

import br.com.danidr7.domain.Saiyajin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaiyajinRepository extends MongoRepository<Saiyajin, String> {



}
