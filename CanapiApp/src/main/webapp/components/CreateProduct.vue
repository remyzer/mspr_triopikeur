<template>
  <div class="container">
    <div class="row">
      <div class="col-md-7 mrgnbtm card add_product_card d-flex justify-content-center" id="add_product">
        <h2>Ajouter un produit</h2>
        <form>
          <div class="row">
            <div class="form-group col-md-6">
              <label htmlFor="libelleInput">Libelle</label>
              <input type="text" class="form-control" v-model="libelle" name="libelle" id="libelle" aria-describedby="emailHelp" placeholder="Libellé du produit" />
            </div>
            <div class="form-group col-md-6">
              <label htmlFor="prixInput">Prix</label>
              <input type="number" class="form-control" v-model="prix" name="prix" id="prix" placeholder="Prix" />
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-12">
              <label htmlFor="quantiteInput">Quantité</label>
              <input type="number" class="form-control" v-model="quantite" name="quantite" id="quantite" aria-describedby="emailHelp" placeholder="Quantité" />
            </div>
            <div class="form-group col-md-12">
              <label htmlFor="categoryIdInput">ID de catégorie</label>
              <!--<input type="number" class="form-control" v-model="type_produit_id" name="idcategory" id="idcategory" aria-describedby="idcategoryHelp" placeholder="ID de catégorie" />-->
              <select v-model="type_produit_id">
                <option v-for="type_produit in type_produit_list"  :value="parseInt(type_produit.id)">{{ type_produit.id }} - {{ type_produit.libelle }}</option>
              </select>
            </div>
          </div>
          <button type="button" style="margin-top: 20px" @click='createProduct()' class="btn btn-success">Create</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
const instance = axios.create({baseURL:"http://localhost:8081"})

export default {
  name: 'CreateProduct',
  data() {
    return {
      libelle: '',
      prix: '',
      quantite: '',
      type_produit_id: '',
      type_produit_list: {}
    }
  },
  mounted() {
    instance.post("/public/listTypeProduit")
        .then(response => {
          this.type_produit_list = response.data.data
        })
  },
  methods: {
    createProduct() {
      const produit = {
        libelle: this.libelle,
        prix: this.prix,
        quantite: this.quantite,
        type_produit_id: this.type_produit_id,
      }
     instance.post("/public/addProduit",produit)
         .then(response => {
           console.log(response)
         })
         .catch(error => {
           console.log(error.response)
         });
      this.clearForm();
    },
    clearForm() {
      this.libelle = "";
      this.prix = "";
      this.quantite = "";
      this.type_produit_id = "";
    }
  }
}

</script>

<style>
.container {
  margin-top: 100px;
  width: 60%;
}

.add_product_card {
  padding: 40px;
}
</style>