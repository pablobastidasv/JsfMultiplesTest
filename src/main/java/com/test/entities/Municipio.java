package com.test.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by pbastidas on 12/7/14.
 */
@Entity
@Table(name = "municipio")
@NamedQueries({
        @NamedQuery(name = "Municipio.findByDepartamento", query = "SELECT m FROM Municipio m where m.departamento = :departamento")
})
@Data
public class Municipio implements Serializable{

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento", nullable = false)
    @Getter @Setter
    private Departamento departamento;

}
