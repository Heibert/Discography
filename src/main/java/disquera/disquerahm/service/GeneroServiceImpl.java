package disquera.disquerahm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import disquera.disquerahm.models.Genero.IGenero;
import disquera.disquerahm.models.Genero.Genero;

@Service
public class GeneroServiceImpl implements IGeneroService {
    @Autowired
    private IGenero genered;

    @Override
    public List<Genero> findAll() {
    return (List<Genero>) genered.findAll();
    }

    @Override
    public Genero findOne(Integer id) {
    return genered.findById(id).orElse(null);
    }

    public void save(Genero genero) {
    genered.save(genero);
    }

    @Override
    public void delete(Integer id) {
    genered.deleteById(id);
    }
}
