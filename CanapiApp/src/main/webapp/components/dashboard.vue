<template>
  <div class="content">
    <span><a class="logout" href="#">Deconnexion</a></span>
    <h1 class="welcome_title">Bonjour User</h1>
    <div class="card dashboard">
      <div class="card-header dashboard_header">
        Tableau de bord
      </div>
      <div class="card-body">
        <div class="boutons_acces_principaux d-flex justify-content-around">
          <a href="#" class="btn btn-outline-secondary main_access_btn">Portefeuille Client</a>
          <a href="#" class="btn btn-outline-secondary main_access_btn">Listing Produits</a>
          <a href="#" class="btn btn-outline-secondary main_access_btn">Listing Commandes</a>
          <a href="#" class="btn btn-outline-secondary main_access_btn">Stats Commerciales</a>
        </div>
        <h5 class="card-title">Accéder rapidement :</h5>
        <div class="boutons_acces_options d-flex justify-content-evenly" id="first_option_line">
          <button @click="show = !show" class="btn btn-secondary option_access_btn btn-sm">Ajouter un client</button>
          <a href="#add_product" class="btn btn-secondary option_access_btn btn-sm">Ajouter un produit</a>
          <a href="#" class="btn btn-secondary option_access_btn btn-sm">Réassort produits</a>
        </div>
        <div class="boutons_acces_options d-flex justify-content-evenly" id="second_option_line">
          <a href="#" class="btn btn-secondary option_access_btn btn-sm">Nouvelle commande</a>
          <a href="#" class="btn btn-secondary option_access_btn btn-sm">Lister les commandes</a>
          <a href="#" class="btn btn-secondary option_access_btn btn-sm">Effectif interne</a>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "dashboard"
}

</script>

<style scoped>

</style>