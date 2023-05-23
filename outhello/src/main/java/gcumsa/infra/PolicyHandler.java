package gcumsa.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import gcumsa.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import gcumsa.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired WorldRepository worldRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Default'")
    public void wheneverDefault_Helloworld(@Payload Default default){

        Default event = default;
        System.out.println("\n\n##### listener Helloworld : " + default + "\n\n");


        

        // Sample Logic //

        

    }

}


