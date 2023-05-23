package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Default extends AbstractEvent {

    private Long id;

    public Default(Hello aggregate) {
        super(aggregate);
    }

    public Default() {
        super();
    }
}
