package garden.radiant.outbusinessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service()
public class EnterpriseProjectService {
    @PersistenceContext
    private EntityManager entityManager;

    EnterpriseProjectService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return  this.entityManager;
    }

    public Project newProject(String title, String description, Enterprise enterprise) {
        Project p = new Project();
        p.setTitle(title);
        p.setDescription(description);
        p.setEnterprise(enterprise);
        this.entityManager.persist(p);
        this.entityManager.flush();
        return p;
    }

    public Project findProjectById(Long projectId) {
        return this.entityManager.find(Project.class, projectId);
    }

    public Enterprise newEnterprise(String aName, String aDescription, String aContactName, String mail) {
        Enterprise e = new Enterprise();
        e.setName(aName);
        e.setDescription(aDescription);
        e.setContactName(aContactName);
        e.setContactEmail(mail);
        this.entityManager.persist(e);
        this.entityManager.flush();
        return e;
    }

    public Enterprise findEnterpriseById(Long id) {
        return this.entityManager.find(Enterprise.class, id);
    }

    public Project newProject(String aTitle, String aDescription) {
        Project p = new Project();
        p.setTitle(aTitle);
        p.setDescription(aDescription);
        this.entityManager.persist(p);
        this.entityManager.flush();
        return p;
    }
}
