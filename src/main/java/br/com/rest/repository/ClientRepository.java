package br.com.rest.repository;

import br.com.rest.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "clients",collectionResourceRel = "clients")
public interface ClientRepository extends CrudRepository<Client,Long>, PagingAndSortingRepository<Client,Long> {
    List<Client>findByName(@Param("name") String name);
}
