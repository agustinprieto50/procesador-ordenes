package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Orden.
 */
@Entity
@Table(name = "orden")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Orden implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "cliente")
    private Integer cliente;

    @Column(name = "accion_id")
    private Integer accionId;

    @Column(name = "accion")
    private String accion;

    @Column(name = "operacion")
    private String operacion;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "fecha_operacion")
    private String fechaOperacion;

    @Column(name = "modo")
    private String modo;

    @Column(name = "estado")
    private String estado;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Orden id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCliente() {
        return this.cliente;
    }

    public Orden cliente(Integer cliente) {
        this.setCliente(cliente);
        return this; 
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getAccionId() {
        return this.accionId;
    }

    public Orden accionId(Integer accionId) {
        this.setAccionId(accionId);
        return this;
    }

    public void setAccionId(Integer accionId) {
        this.accionId = accionId;
    }

    public String getAccion() {
        return this.accion;
    }

    public Orden accion(String accion) {
        this.setAccion(accion);
        return this;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getOperacion() {
        return this.operacion;
    }

    public Orden operacion(String operacion) {
        this.setOperacion(operacion);
        return this;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Float getPrecio() {
        return this.precio;
    }

    public Orden precio(Float precio) {
        this.setPrecio(precio);
        return this;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public Orden cantidad(Integer cantidad) {
        this.setCantidad(cantidad);
        return this;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaOperacion() {
        return this.fechaOperacion;
    }

    public Orden fechaOperacion(String fechaOperacion) {
        this.setFechaOperacion(fechaOperacion);
        return this;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getModo() {
        return this.modo;
    }

    public Orden modo(String modo) {
        this.setModo(modo);
        return this;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getEstado() {
        return this.estado;
    }

    public Orden estado(String estado) {
        this.setEstado(estado);
        return this;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Orden)) {
            return false;
        }
        return id != null && id.equals(((Orden) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Orden{" +
            "id=" + getId() +
            ", cliente=" + getCliente() +
            ", accionId=" + getAccionId() +
            ", accion='" + getAccion() + "'" +
            ", operacion='" + getOperacion() + "'" +
            ", precio=" + getPrecio() +
            ", cantidad=" + getCantidad() +
            ", fechaOperacion='" + getFechaOperacion() + "'" +
            ", modo='" + getModo() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }
}
