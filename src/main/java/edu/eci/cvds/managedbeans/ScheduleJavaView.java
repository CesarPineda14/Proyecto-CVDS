package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import edu.eci.cvds.persistence.ExceptionPersistence;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("deprecation")
@ManagedBean(name = "ScheduleBean")
@ApplicationScoped

public class ScheduleJavaView extends BasePageBean implements Serializable {

    private ScheduleModel eventModel;
    private ScheduleEvent<?> event;

    public ScheduleJavaView(){
        eventModel = new DefaultScheduleModel();
    }

    public void crearCalendario() throws ExceptionPersistence{
        eventModel = new DefaultScheduleModel();
        event = DefaultScheduleEvent.builder()
                .title("Reservado")
                .startDate(LocalDateTime.now().minusDays(2).withHour(20).withMinute(0).withSecond(0).withNano(0))
                .endDate(LocalDateTime.now().minusDays(2).withHour(23).withMinute(0).withSecond(0).withNano(0))
                .borderColor("orange")
                .build();
        eventModel.addEvent(event);
        event = new DefaultScheduleEvent<>();
    }

    public ScheduleModel getEventModel() {
        return eventModel;
    }

    public void setEventModel(ScheduleModel eventModel) {
        this.eventModel = eventModel;
    }

    public ScheduleEvent<?> getEvent() {
        return event;
    }

    public void setEvent(ScheduleEvent<?> event) {
        this.event = event;
    }

}