package disquera.disquerahm.service;

import disquera.disquerahm.models.Genero.IGenero;

@Service
public interface IGeneroService {
    public List<Genero> findAll();
    public void save (Genero genero);
    public Genero findOne (Integer id);
    public void delete(Integer id);
}