package lecture.infra;

import lecture.domain.*;
import lecture.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DashBoadViewHandler {


    @Autowired
    private DashBoadRepository dashBoadRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileuploaded_then_CREATE_1 (@Payload Fileuploaded fileuploaded) {
        try {

            if (!fileuploaded.validate()) return;

            // view 객체 생성
            DashBoad dashBoad = new DashBoad();
            // view 객체에 이벤트의 Value 를 set 함
            dashBoad.setFileId(String.valueOf(fileuploaded.getId()));
            // view 레파지 토리에 save
            dashBoadRepository.save(dashBoad);

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}

