package garden.radiant.outbusinessproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    private EnterpriseProjectService enterpriseProjectService;

    ProjectController(EnterpriseProjectService enterpriseProjectService) {
        this.enterpriseProjectService = enterpriseProjectService;
    }

    @RequestMapping(method = RequestMethod.GET,  value = "/api/projects")
    public List<Project> findAllProjectsWithEnterprises() {
        return this.enterpriseProjectService.findAllProjects();
    }
}
