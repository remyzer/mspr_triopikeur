<template>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="Canapi CRM">
  <meta name="author" content="MSPR Triopikeur">
  <title>Bienvenue sur Canapi</title>
</head>

<body>
<div class="container-fluid">
  <div class="row flex-nowrap">

    <!--Navbar Aside-->
    <div class="col-auto col-md-3 col-xl-3 px-sm-2 px-0 aside_content">
      <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 min-vh-100">
        <a href="#" class="d-flex align-items-center pb-3 mb-md-0 me-md-auto">
            <span class="fs-5 d-none d-sm-inline" style="text-align: center;">
              <img class="logo_canapi" alt="logo_canapi" src="./ressources/canapi_transparent.png">
            </span>
        </a>
        <!--Tableaux de données-->
        <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2"
             style="margin: 0 auto; width: 100%;">
          <table class="table">
            <h2>Commandes à traiter</h2>
            <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">DATE</th>
              <th scope="col">CLIENT ID</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <th scope="row">1</th>
              <td>13/08</td>
              <td>00189</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>17/07</td>
              <td>00190</td>
            </tr>
            <tr style="border-bottom: hidden;">
              <th scope="row">3</th>
              <td>24/09</td>
              <td>00191</td>
            </tr>
            </tbody>
          </table>
        </div>
        <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2"
             style="margin: 0 auto; width: 100%;">
          <h2>Client</h2>
          <table class="table table2">
            <thead>
            <tr style="font-size: 0.7em;">
              <th scope="col">PRODUIT ID</th>
              <th scope="col">TYPE PRODUIT ID</th>
              <th scope="col">QUANTITE</th>
            </tr>
            </thead>
            <tbody>
           <!-- <tr v-for="client in Clients">
              <th scope="row">{{ client.nom }}</th>
              <td>{{ client.prenom }}</td>
              <td>{{ client.email }}</td>
            </tr>-->
            </tbody>
          </table>
        </div>
        <span class="email_btn">
            <a class="mail btn btn-outline-primary send_email_button" href="mailto:quentin.derriennic@epsi.fr">Envoyer un email</a>
          </span>
      </div>
    </div>
    <div>
      <dashboard />
      <CreateUser />
      <CreateProduct />
    </div>
  </div>
</div>
</body>
</html>
</template>

<script>
import axios from "axios";
import CreateUser from "./components/CreateUser";
import Dashboard from "@/main/webapp/components/dashboard";
import CreateProduct from "@/main/webapp/components/CreateProduct";

const instance = axios.create({baseURL:"http://localhost:8081"})


export default {
  name: 'App',
  components: {
    Dashboard,
    CreateUser,
    CreateProduct,
  },
  data() {
    return {
      Clients:[],
    }
  },

  mounted() {
    instance.get('/public/listClient')
        .then(response => {
          this.Clients = response.data.data
        })
  },

  methods :{

    }

}

</script>


<style>
@import "./css/style.css";
</style>