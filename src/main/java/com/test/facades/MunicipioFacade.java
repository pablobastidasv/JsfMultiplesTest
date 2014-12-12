package com.test.facades;

import com.test.entities.Departamento;
import com.test.entities.Municipio;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by pbastidas on 12/7/14.
 */
@Stateless
public class MunicipioFacade {

    @PersistenceUnit
    private EntityManagerFactory emf;
    private EntityManager em;

    @PostConstruct
    private void init(){
        em = emf.createEntityManager();
    }

    public List<Municipio> municipioListByDepartamento(Departamento departamento){
        return em.createNamedQuery("Municipio.findByDepartamento", Municipio.class)
                .setParameter("departamento", departamento)
                .getResultList();
    }
}
