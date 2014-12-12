package com.test.controles;

import com.ocpsoft.pretty.faces.annotation.URLBeanName;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLQueryParameter;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

/**
 * Created by pbastidas on 12/7/14.
 */
@Model
@URLBeanName("prettyfacesParametersController")
@URLMapping(id="prettyfacesparam", pattern="/prettyfaces/example/params/", viewId = "/prettyFacesParamExample.page")
public class PrettyfacesParametersController {
    @URLQueryParameter("param")
    @Getter @Setter
    private String param;

    @PostConstruct
    public void init(){

    }
}
