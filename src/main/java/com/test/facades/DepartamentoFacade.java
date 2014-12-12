package com.test.facades;

import com.test.entities.Departamento;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by pbastidas on 12/7/14.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class DepartamentoFacade {

    @PersistenceUnit
    private EntityManagerFactory emf;
    private EntityManager em;

    @PostConstruct
    private void init(){
        em = emf.createEntityManager();
    }
    public List<Departamento> departamentoList(){
        return em.createNamedQuery("Departamento.findAll", Departamento.class).getResultList();
    }
}
