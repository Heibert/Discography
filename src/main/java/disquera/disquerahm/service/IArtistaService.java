package disquera.disquerahm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import disquera.disquerahm.models.Artista.Artista;

@Service
public interface IArtistaService {
    public List<Artista> findAll();
    public void save (Artista artista);
    public Artista findOne (Integer id);
    public void delete(Integer id);
}