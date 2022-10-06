package lecture.domain;

import lecture.domain.*;
import lecture.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
    private String status;
}


