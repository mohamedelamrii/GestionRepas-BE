package  ma.enova.repas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;


import ma.enova.repas.zynerator.security.common.AuthoritiesConstants;
import ma.enova.repas.zynerator.security.bean.User;
import ma.enova.repas.zynerator.security.bean.Permission;
import ma.enova.repas.zynerator.security.bean.Role;
import ma.enova.repas.zynerator.security.service.facade.UserService;
import ma.enova.repas.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableFeignClients("ma.enova.repas.required.facade")
public class RepasApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(RepasApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService
    ) {
    return (args) -> {
        if(true){
            Map<String,String> etats=new HashMap<>();
            etats.put("Initialisé","initialise");
            etats.put("En cours","encours");
            etats.put("Terminé","termine");


    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);


    // Role responsable

        User userForResponsable = new User("responsable");

        Role roleForResponsable = new Role();
        roleForResponsable.setAuthority(AuthoritiesConstants.RESPONSABLE);
        List<Permission> permissionsForResponsable = new ArrayList<>();
        addPermissionForResponsable(permissionsForResponsable);
        roleForResponsable.setPermissions(permissionsForResponsable);
        if(userForResponsable.getRoles()==null)
            userForResponsable.setRoles(new ArrayList<>());

        userForResponsable.getRoles().add(roleForResponsable);
        userService.save(userForResponsable);
            }
        };
    }

    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("ResponsablePlanning.edit"));
        permissions.add(new Permission("ResponsablePlanning.list"));
        permissions.add(new Permission("ResponsablePlanning.view"));
        permissions.add(new Permission("ResponsablePlanning.add"));
        permissions.add(new Permission("ResponsablePlanning.delete"));
        permissions.add(new Permission("RepasCategoriePatient.edit"));
        permissions.add(new Permission("RepasCategoriePatient.list"));
        permissions.add(new Permission("RepasCategoriePatient.view"));
        permissions.add(new Permission("RepasCategoriePatient.add"));
        permissions.add(new Permission("RepasCategoriePatient.delete"));
        permissions.add(new Permission("PlanningRepas.edit"));
        permissions.add(new Permission("PlanningRepas.list"));
        permissions.add(new Permission("PlanningRepas.view"));
        permissions.add(new Permission("PlanningRepas.add"));
        permissions.add(new Permission("PlanningRepas.delete"));
        permissions.add(new Permission("Repas.edit"));
        permissions.add(new Permission("Repas.list"));
        permissions.add(new Permission("Repas.view"));
        permissions.add(new Permission("Repas.add"));
        permissions.add(new Permission("Repas.delete"));
        permissions.add(new Permission("TypeRepas.edit"));
        permissions.add(new Permission("TypeRepas.list"));
        permissions.add(new Permission("TypeRepas.view"));
        permissions.add(new Permission("TypeRepas.add"));
        permissions.add(new Permission("TypeRepas.delete"));
        permissions.add(new Permission("Jour.edit"));
        permissions.add(new Permission("Jour.list"));
        permissions.add(new Permission("Jour.view"));
        permissions.add(new Permission("Jour.add"));
        permissions.add(new Permission("Jour.delete"));
        permissions.add(new Permission("Patient.edit"));
        permissions.add(new Permission("Patient.list"));
        permissions.add(new Permission("Patient.view"));
        permissions.add(new Permission("Patient.add"));
        permissions.add(new Permission("Patient.delete"));
        permissions.add(new Permission("PlanningExecution.edit"));
        permissions.add(new Permission("PlanningExecution.list"));
        permissions.add(new Permission("PlanningExecution.view"));
        permissions.add(new Permission("PlanningExecution.add"));
        permissions.add(new Permission("PlanningExecution.delete"));
        permissions.add(new Permission("Planning.edit"));
        permissions.add(new Permission("Planning.list"));
        permissions.add(new Permission("Planning.view"));
        permissions.add(new Permission("Planning.add"));
        permissions.add(new Permission("Planning.delete"));
        permissions.add(new Permission("CategoriePatient.edit"));
        permissions.add(new Permission("CategoriePatient.list"));
        permissions.add(new Permission("CategoriePatient.view"));
        permissions.add(new Permission("CategoriePatient.add"));
        permissions.add(new Permission("CategoriePatient.delete"));
    }
    private static void addPermissionForResponsable(List<Permission> permissions){
        permissions.add(new Permission("ResponsablePlanning.edit"));
        permissions.add(new Permission("ResponsablePlanning.list"));
        permissions.add(new Permission("ResponsablePlanning.view"));
        permissions.add(new Permission("ResponsablePlanning.add"));
        permissions.add(new Permission("ResponsablePlanning.delete"));
        permissions.add(new Permission("RepasCategoriePatient.edit"));
        permissions.add(new Permission("RepasCategoriePatient.list"));
        permissions.add(new Permission("RepasCategoriePatient.view"));
        permissions.add(new Permission("RepasCategoriePatient.add"));
        permissions.add(new Permission("RepasCategoriePatient.delete"));
        permissions.add(new Permission("PlanningRepas.edit"));
        permissions.add(new Permission("PlanningRepas.list"));
        permissions.add(new Permission("PlanningRepas.view"));
        permissions.add(new Permission("PlanningRepas.add"));
        permissions.add(new Permission("PlanningRepas.delete"));
        permissions.add(new Permission("Repas.edit"));
        permissions.add(new Permission("Repas.list"));
        permissions.add(new Permission("Repas.view"));
        permissions.add(new Permission("Repas.add"));
        permissions.add(new Permission("Repas.delete"));
        permissions.add(new Permission("TypeRepas.edit"));
        permissions.add(new Permission("TypeRepas.list"));
        permissions.add(new Permission("TypeRepas.view"));
        permissions.add(new Permission("TypeRepas.add"));
        permissions.add(new Permission("TypeRepas.delete"));
        permissions.add(new Permission("Jour.edit"));
        permissions.add(new Permission("Jour.list"));
        permissions.add(new Permission("Jour.view"));
        permissions.add(new Permission("Jour.add"));
        permissions.add(new Permission("Jour.delete"));
        permissions.add(new Permission("Patient.edit"));
        permissions.add(new Permission("Patient.list"));
        permissions.add(new Permission("Patient.view"));
        permissions.add(new Permission("Patient.add"));
        permissions.add(new Permission("Patient.delete"));
        permissions.add(new Permission("PlanningExecution.edit"));
        permissions.add(new Permission("PlanningExecution.list"));
        permissions.add(new Permission("PlanningExecution.view"));
        permissions.add(new Permission("PlanningExecution.add"));
        permissions.add(new Permission("PlanningExecution.delete"));
        permissions.add(new Permission("Planning.edit"));
        permissions.add(new Permission("Planning.list"));
        permissions.add(new Permission("Planning.view"));
        permissions.add(new Permission("Planning.add"));
        permissions.add(new Permission("Planning.delete"));
        permissions.add(new Permission("CategoriePatient.edit"));
        permissions.add(new Permission("CategoriePatient.list"));
        permissions.add(new Permission("CategoriePatient.view"));
        permissions.add(new Permission("CategoriePatient.add"));
        permissions.add(new Permission("CategoriePatient.delete"));
    }
}


