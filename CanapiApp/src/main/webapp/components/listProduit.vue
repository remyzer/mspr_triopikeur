<template>
  <div class="container" >
    <div v-show="show" >
      <updateProduit :id-produit="idProduit" />
    </div>
    <h2>Produits</h2>
    <b-table class="table table-bordered" id="tableau_clients">
      <thead>
      <tr>
        <th>Id</th>
        <th>Libellé</th>
        <th>Prix</th>
        <th>Quantité</th>
        <th>Type</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="produit in produits" :key="produit.id">
        <td>{{ produit.id }}</td>
        <td>{{ produit.libelle }}</td>
        <td>{{ produit.prix }}</td>
        <td>{{ produit.quantite }}</td>
        <td>{{ produit.type_produit_id }}</td>
        <td> <button @click="deleteProduit(produit)">Supprimer</button> </td>
        <td><button @click="updateProduit(produit)">Modifier</button></td>
      </tr>
      </tbody>
    </b-table>
  </div>
</template>

<script>
import axios from "axios";
import updateProduit from "@/main/webapp/components/updateProduit";
const instance = axios.create({baseURL:"http://localhost:8081",})
export default {
  name: "listProduit",
  props: ["listProduit"],
  components: {
    updateProduit
  },
  data() {
    return {
      produits: [],
      typesProduit: [],
      idProduit: 0,
      show: false
    }
  },
  mounted() {
    instance.get("/public/listProduit")
        .then( response => {
          this.produits = response.data.data
        })
  },
  methods: {
    deleteProduit: function (produit) {
      instance.post("/public/deleteProduit", produit.id ,{headers: {
          'Content-Type': 'application/json'
        }})
          .then(response => {
            if (response.data.success) {
             this.$forceUpdate()
            }
            console.log(response)
          })
          .catch(error => {
            console.log(error.response)
          });
    },
    updateProduit: function (produit) {
      this.show = !this.show
      this.idProduit = produit.id
    }
  }
}
</script>