package lecture.domain;

import lecture.domain.Indexed;
import lecture.IndexerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Index_table")
@Data

public class Index  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String keyWords;
    
    
    
    
    
    private String fileKey;

    @PostPersist
    public void onPostPersist(){


        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();

    }

    public static IndexRepository repository(){
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }




    public static void makeIndex(Fileuploaded fileuploaded){

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        Indexed indexed = new Indexed(index);
        indexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileuploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);

            Indexed indexed = new Indexed(index);
            indexed.publishAfterCommit();

         });
        */

        
    }


}
