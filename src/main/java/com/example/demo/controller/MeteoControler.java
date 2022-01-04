package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// l'anotation requestparam permet de dire a spring qu'il doit recupérer des données en parametre
// dans le request param on doit recupérer le nom qui correspond au nom de l'objet généré
// le require true c'est ^pour dire que quand j'ai une érreur je génère une erreur
// le model me permet de recupérer la structure de ma vue
// quand on défini l'url on défini la méthode soit GET soit Post...... dans notre cas on fait un post
// dans un post on envoie une information dans l'url il y'a un objet
/*
toute les page html qu'on appel on fait un get quand je fais un post pour envoyer une information
qui prend l'information et récupère la vue
get : recoie l'info je veux recevoir toute les infos de l'url
post: le serveur ecoute et recoie une info
 */

@Controller
public class MeteoControler {
    @PostMapping("/meteo")
    public String meteo(@RequestParam(name ="address", required = true)String meteoA){
        System.out.println(meteoA);
        return "meteo";

    }
}


