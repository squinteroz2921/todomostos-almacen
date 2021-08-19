package com.todomotos.almacen.persistence.mapper;

import com.todomotos.almacen.domain.Category;
import com.todomotos.almacen.persistence.entity.Categoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-17T15:05:06-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        Category category = new Category();

        if ( categoria.getIdCategoria() != null ) {
            category.setCategoryId( categoria.getIdCategoria() );
        }
        category.setCategory( categoria.getDescripcion() );
        if ( categoria.getEstado() != null ) {
            category.setActive( categoria.getEstado() );
        }

        return category;
    }

    @Override
    public Categoria toCategoria(Category category) {
        if ( category == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setIdCategoria( category.getCategoryId() );
        categoria.setDescripcion( category.getCategory() );
        categoria.setEstado( category.isActive() );

        return categoria;
    }
}
