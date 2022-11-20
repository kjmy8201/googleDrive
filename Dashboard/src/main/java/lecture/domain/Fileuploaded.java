package lecture.domain;

import lecture.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Fileuploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
}
