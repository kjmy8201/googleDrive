package lecture.infra;

import lecture.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="dashBoads", path="dashBoads")
public interface DashBoadRepository extends PagingAndSortingRepository<DashBoad, Long> {

    

    
}
