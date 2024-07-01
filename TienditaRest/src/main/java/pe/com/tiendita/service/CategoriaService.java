package pe.com.tiendita.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.entity.CategoriaEntity;

public interface CategoriaService {

    List<CategoriaEntity> findAll();

    List<CategoriaEntity> findAllCustom();

    Optional<CategoriaEntity> findById(long id);

    CategoriaEntity add(CategoriaEntity c);

    CategoriaEntity update(CategoriaEntity c);

    CategoriaEntity delete(CategoriaEntity c);
}
