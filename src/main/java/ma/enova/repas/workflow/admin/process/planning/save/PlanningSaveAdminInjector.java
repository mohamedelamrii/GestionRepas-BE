package ma.enova.repas.workflow.admin.process.planning.save;
import ma.enova.repas.service.facade.admin.PlanningAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanningSaveAdminInjector{

    @Bean
    public PlanningSaveAdminProcess planningSaveAdmin(PlanningAdminService service, PlanningSaveAdminConverter converter) {
        return new PlanningSaveAdminProcessImpl(service,converter);
    }

}
