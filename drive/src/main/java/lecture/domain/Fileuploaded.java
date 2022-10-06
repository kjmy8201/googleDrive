package lecture.domain;

import lecture.domain.*;
import lecture.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Fileuploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;

    public Fileuploaded(File aggregate){
        super(aggregate);
    }
    public Fileuploaded(){
        super();
    }
}
