package disquera.disquerahm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import disquera.disquerahm.models.Artista.IArtista;
import disquera.disquerahm.models.Artista.Artista;

@Service
public class ArtistaServiceImpl implements IArtistaService {
    @Autowired
    private IArtista genered;

    @Override
    public List<Artista> findAll() {
    return (List<Artista>) genered.findAll();
    }

    @Override
    public Artista findOne(Integer id) {
    return genered.findById(id).orElse(null);
    }

    public void save(Artista artista) {
    genered.save(artista);
    }

    @Override
    public void delete(Integer id) {
    genered.deleteById(id);
    }
}
