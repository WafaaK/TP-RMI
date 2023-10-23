# TP-RMI
# Application de Gestion de machines et de salles
Ce projet a pour but de créer un système de gestion de salles et de machines en utilisant une interface graphique Swing. Il utilise Hibernate, et pour permettre 
la communication entre différentes parties du système, il utilise RMI (Remote Method Invocation), qui est une technologie permettant d'appeler des fonctions à distance.
Ce projet est composee de deux parties : 
     1) Le serveur RMI : C'est le composant central qui stocke les informations sur les chambres et les machines. Il offre des services aux clients RMI et gère les opérations
 de base, telles que l'ajout, la modification ou la suppression de données.
     2) Le client RMI : Il s'agit de l'interface utilisateur où les utilisateurs interagissent avec le système. Ils peuvent visualiser et manipuler les informations sur
les chambres et les machines à l'aide de l'interface graphique Swing. Le client communique avec le serveur RMI pour effectuer ces opérations.
# Les technologies utilisées
Ce projet utilise Java pour sa mise en œuvre et intègre MySQL pour la gestion de la base de données. Hibernate est utilisé pour la couche de persistance des données,
et RMI assure la communication entre le client et le serveur.
# Les operations CRUD
Voici l'interface de gestion : 
<img width="585" alt="1" src="https://github.com/WafaaK/TP-RMI/assets/147450674/0e214ef6-88f3-440a-9272-3638b43be0b3">
Pour faire une gestion de machine, nous avons : 
<img width="829" alt="2" src="https://github.com/WafaaK/TP-RMI/assets/147450674/8ea1df33-45db-4c28-b60d-f061d155f2b1">
- Ajout d'une machine :
<img width="809" alt="3" src="https://github.com/WafaaK/TP-RMI/assets/147450674/acd23ac6-6646-4474-b4e7-3a57355f63b5">
- Suppression d'une machine :
<img width="834" alt="4" src="https://github.com/WafaaK/TP-RMI/assets/147450674/f43bd17d-1f86-417c-9cc6-62ed32d9b8fb">
<img width="796" alt="5" src="https://github.com/WafaaK/TP-RMI/assets/147450674/668d995c-1852-4999-a043-2fc5fdce5ff5">
- Modification d'une machine :
<img width="794" alt="6" src="https://github.com/WafaaK/TP-RMI/assets/147450674/7ff4f768-456c-4789-bda6-3f341dc7c32a">

Pour faire la gestion des salles nous avons : 
L'interface : 
<img width="765" alt="7" src="https://github.com/WafaaK/TP-RMI/assets/147450674/f6531878-1193-4bbf-8b1e-59e63d360ed3">
Ajout d'une salle: 
<img width="723" alt="8" src="https://github.com/WafaaK/TP-RMI/assets/147450674/5106c1bd-5049-4e6a-a45f-7a6277d96ad5">
Modification d'une salle :
<img width="749" alt="9" src="https://github.com/WafaaK/TP-RMI/assets/147450674/e145aba2-3311-48ec-908b-a3eb7aec311f">
Supression d'une salle : 
<img width="760" alt="10" src="https://github.com/WafaaK/TP-RMI/assets/147450674/ba6c950d-550f-450c-bcfd-1f5bf5d12e12">
<img width="826" alt="11" src="https://github.com/WafaaK/TP-RMI/assets/147450674/04e816c3-2e7d-4144-8881-78175af572fc">
