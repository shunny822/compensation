package compensation.domain;

import compensation.domain.*;
import compensation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OutOfStack extends AbstractEvent {

    private Long id;
    private Long stock;
    private Long orderId;

    public OutOfStack(Inventory aggregate) {
        super(aggregate);
    }

    public OutOfStack() {
        super();
    }
}
//>>> DDD / Domain Event
