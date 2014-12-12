package com.test.controles;

import com.test.facades.DepartamentoFacade;
import com.test.entities.Departamento;
import com.test.entities.Municipio;
import com.test.facades.MunicipioFacade;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pbastidas on 12/7/14.
 */
@Named
@ViewScoped
public class SimpleComboBoxController implements Serializable {

    @Getter @Setter
    private List<Departamento> departamentos;
    @Getter @Setter
    private List<Municipio> municipios;
    @Getter @Setter
    private Departamento departamentoSel;
    @Getter @Setter
    private Municipio municipioSel;
    @EJB
    private DepartamentoFacade departamentoFacade;
    @EJB
    private MunicipioFacade municipioFacade;

    @PostConstruct
    public void init() {
        departamentos = departamentoFacade.departamentoList();
    }

    public void departamentoChangeListener(ValueChangeEvent event){
        departamentoSel = (Departamento) event.getNewValue();

        municipios = municipioFacade.municipioListByDepartamento(departamentoSel);

        if(municipios.size() == 1){
            municipioSel = municipios.get(0);
        } else{
            municipioSel = null;
        }
    }
}
