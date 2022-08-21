package mg.cdan4.tp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import mg.cdan4.tp.entity.Produit;
import mg.cdan4.tp.service.ProduitService;

@Controller

public class ProduitController {
    @Autowired
    ProduitService produitService;
    
    @RequestMapping("/")
    public String viewHomePage(Model model){
      List<Produit> listProducts = produitService.listAll();
      model.addAttribute("listProducts", listProducts);
    return "index";
    }

    @RequestMapping("/new")
    public String nouveauProduit(Model model){
      Produit produit = new Produit();
      model.addAttribute("product", produit);
    return "new_produit";
    }

    @PostMapping(value= "/save")
    public String saveProduct(@ModelAttribute("product") Produit produit){
      produitService.save(produit);
      return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView afficheProduitEdit(@PathVariable(name="id")int id){
      ModelAndView mav = new ModelAndView("edit_produit");
      Produit produit = produitService.get(id);
      mav.addObject("produit", produit);
      return mav;
    }
    @RequestMapping("/delete/{id}")
    public String supprimProduit(@PathVariable(name="id")int id){
      produitService.delete(id);
      return "redirect:/";
    }
}
