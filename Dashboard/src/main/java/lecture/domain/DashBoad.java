package lecture.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="DashBoad_table")
@Data
public class DashBoad {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Boolean isIndexed;
        private String videoUrl;
        private String fileName;
        private String fileId;


}
