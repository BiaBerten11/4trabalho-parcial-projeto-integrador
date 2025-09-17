package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CicloMenstrual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "usuarioId")
    public Integer codigo;
    public Usuario usuario;
    public LocalDate dataInicio;
    public int duracaoCiclo;
    public int duracaoMenstruacao;

}
