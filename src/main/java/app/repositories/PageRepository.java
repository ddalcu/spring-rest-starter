package app.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.models.Page;

@RepositoryRestResource(collectionResourceRel = "page", path = "page")
public interface PageRepository extends PagingAndSortingRepository<Page, Long>{
	List<Page> findByTitle(String title);
}
