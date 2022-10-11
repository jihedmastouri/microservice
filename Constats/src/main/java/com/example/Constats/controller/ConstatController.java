package com.example.Constats.controller;


import com.example.Constats.entity.Constat;
import com.example.Constats.service.ConstatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController @RequestMapping("/constat")
public class ConstatController {
   @Autowired
   private ConstatService constatService;

   @PostMapping
    public Constat saveConstat( @RequestBody Constat constat){
       return constatService.saveConstat(constat);
   }
   @GetMapping
    public List<Constat> getAllConstat(){
      return constatService.fetchConstatList();
   }
   @PutMapping("/{id}")
    public Constat updateConstat(@RequestBody Constat constat ,
                                 @PathVariable("id") Long constatId)
   {
       return constatService.updateConstat(constat,constatId);
   }
   @DeleteMapping("/{id}")
    public String deleteConstat(@PathVariable("id")
                                Long constatId)
   {
       constatService.deleteConstatById(constatId);
       return "deleted" ;
   }
}
