package edu.ifmt.cobranca.ifmt.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataVencimento;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private StatusTitulo status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusTitulo getStatus() {
        return status;
    }

    public void setStatus(StatusTitulo status) {
        this.status = status;
    }
}
