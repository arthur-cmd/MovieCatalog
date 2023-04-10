package Controller;


import Data.CatalogItems;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/MovieCatalog")
public class MovieControler {


    @GetMapping("/{userid}")
    public List<CatalogItems> getCatalog(@PathVariable ("userid") String userid){
    return Collections.singletonList(
            new CatalogItems("Transformers","Movie about robots turning into cars",8)
    );

    }
}
