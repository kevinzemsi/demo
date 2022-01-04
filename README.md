@RequestParam(name="nameGET",required = false,defaultValue = "World")
nous permet de parametrer l'url d'appel.

return "greeting"; permet de retourner le fichier html choisi

model.addAttribute("nameGET", nameGET); : envoie le nom a qui nous disons bonjour 

Etape 6:

1- oui, il faut une clé car les appels vers l'API nécessite une authentification et 
une autorisation grace à une clé d'API appellé TOKEN 

2- l'url à appeler est : https://api.meteo-concept.com/api/

3- La methode url d'URL utilisé est la méthode GET 

4-les paramètres d'appels sont passés dans l'url par exemple dans
cette url  https://api.meteo-concept.com/api/forecast/nextHours?token=MON_TOKEN
on a le  token qui est passé en paramètre 

5- Pour afficher la temperature du lieu vise par les coordonnees GPS:
GET /climatology/day/around
https://api.meteo-concept.com/api/climatology/day/around?token=MON_TOKEN&insee=35238&radius=50

6- Pour afficher la prevision de meteo du lieu vise par les coordonnees GPS:
GET /forecast/daily/{day}/period/{period}/bbox
https://api.meteo-concept.com/api/forecast/daily/0/period/3/bbox?token=MON_TOKEN&north=48.55&south=48.45&west=-5&east=5