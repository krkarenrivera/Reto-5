package com.example.Reto5G14.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.Reto5G14.Modelo.Cabin;
import com.example.Reto5G14.Servicio.CabinService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cabin")
public class cabinController {
    @Autowired
    private CabinService cabinService;
    @GetMapping("/all")
    public List<Cabin> getAll(){
        return cabinService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cabin> getCabin(@PathVariable("id") int id){
        return cabinService.getCabin(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabin save(@RequestBody Cabin cabin){
        return cabinService.save(cabin);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabin update(@RequestBody Cabin cabin) {
        return cabinService.update(cabin);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int cabinId){
        return cabinService.deleteCabin(cabinId);
    }

}
