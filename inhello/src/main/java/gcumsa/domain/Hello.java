package gcumsa.domain;

import gcumsa.domain.Default;
import gcumsa.InhelloApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Hello_table")
@Data

public class Hello  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        Default default = new Default(this);
        default.publishAfterCommit();

        // Get request from Hello
        //gcumsa.external.Hello hello =
        //    Application.applicationContext.getBean(gcumsa.external.HelloService.class)
        //    .getHello(/** mapping value needed */);

    }

    public static HelloRepository repository(){
        HelloRepository helloRepository = InhelloApplication.applicationContext.getBean(HelloRepository.class);
        return helloRepository;
    }






}
