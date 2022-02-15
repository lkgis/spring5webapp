package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * created by gisore on 2/15/22
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
