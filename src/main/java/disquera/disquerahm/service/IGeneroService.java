package disquera.disquerahm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import disquera.disquerahm.models.Genero.Genero;

@Service
public interface IGeneroService {
    public List<Genero> findAll();
    public void save (Genero genero);
    public Genero findOne (Integer id);
    public void delete(Integer id);
}