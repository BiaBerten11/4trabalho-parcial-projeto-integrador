package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RegistroDiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "usuarioId")
    public Integer codigo;
    public Usuario usuario;
    public LocalDate data;
    public String humor;
    public String emocoes; 
    public String sintomas; 
    public String doencas;

}
