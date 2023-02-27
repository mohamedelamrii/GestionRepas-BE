package ma.enova.repas.workflow.responsable.process.planningexecution.save;
import ma.enova.repas.service.facade.responsable.PlanningExecutionResponsableService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanningExecutionSaveResponsableInjector{

    @Bean
    public PlanningExecutionSaveResponsableProcess planningExecutionSaveResponsable(PlanningExecutionResponsableService service, PlanningExecutionSaveResponsableConverter converter) {
        return new PlanningExecutionSaveResponsableProcessImpl(service,converter);
    }

}
