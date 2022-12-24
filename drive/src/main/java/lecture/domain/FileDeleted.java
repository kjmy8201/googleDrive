package lecture.domain;

import lecture.domain.*;
import lecture.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
    private String status;

    public FileDeleted(File aggregate){
        super(aggregate);
    }
    public FileDeleted(){
        super();
    }
}
