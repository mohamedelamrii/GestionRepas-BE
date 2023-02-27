package ma.enova.repas.workflow.responsable.process.planning.save;
import ma.enova.repas.service.facade.responsable.PlanningResponsableService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanningSaveResponsableInjector{

    @Bean
    public PlanningSaveResponsableProcess planningSaveResponsable(PlanningResponsableService service, PlanningSaveResponsableConverter converter) {
        return new PlanningSaveResponsableProcessImpl(service,converter);
    }

}
