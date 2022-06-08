package disquera.disquerahm.models.Genero;

import java.util.List;

public interface IGenero {
    public List<Genero> findAll();
    public void save (Genero genero);
    public Genero findOne (Integer id);
    public void delete(Integer id);
}