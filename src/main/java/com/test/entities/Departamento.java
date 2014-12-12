package com.test.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by pbastidas on 12/7/14.
 */
@Entity
@Table(name = "departamento")
@NamedQueries({
        @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")
})
public class Departamento implements Serializable {

    @Id
    @Column(name = "codigo", length = 3)
    @Getter @Setter
    private String codigo;
    @Column(name = "nombre", nullable = false, length = 10)
    @Getter @Setter
    private String nombre;
    @Column(name = "latitud", nullable = false)
    @Getter @Setter
    private BigDecimal latitud;
    @Column(name = "longitud", nullable = false)
    @Getter @Setter
    private BigDecimal longitud;

}
