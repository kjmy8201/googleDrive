package lecture.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import lecture.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import lecture.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired IndexRepository indexRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Fileuploaded'")
    public void wheneverFileuploaded_MakeIndex(@Payload Fileuploaded fileuploaded){

        Fileuploaded event = fileuploaded;
        System.out.println("\n\n##### listener MakeIndex : " + fileuploaded + "\n\n");


        

        // Sample Logic //
        Index.makeIndex(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileDeleted'")
    public void wheneverFileDeleted_DeleteIndex(@Payload FileDeleted fileDeleted){

        FileDeleted event = fileDeleted;
        System.out.println("\n\n##### listener DeleteIndex : " + fileDeleted + "\n\n");


        

        // Sample Logic //
        Index.deleteIndex(event);
        

        

    }

}


