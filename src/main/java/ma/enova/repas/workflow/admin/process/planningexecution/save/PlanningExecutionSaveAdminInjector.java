package ma.enova.repas.workflow.admin.process.planningexecution.save;
import ma.enova.repas.service.facade.admin.PlanningExecutionAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanningExecutionSaveAdminInjector{

    @Bean
    public PlanningExecutionSaveAdminProcess planningExecutionSaveAdmin(PlanningExecutionAdminService service, PlanningExecutionSaveAdminConverter converter) {
        return new PlanningExecutionSaveAdminProcessImpl(service,converter);
    }

}
