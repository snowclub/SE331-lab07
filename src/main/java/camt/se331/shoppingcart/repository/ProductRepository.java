package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by macbookpro on 3/22/16 AD.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByNameLike(String name);
    public List<Product> fingByNameContaining(String name);
}
