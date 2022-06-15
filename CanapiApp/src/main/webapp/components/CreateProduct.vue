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
              <input type="number" class="form-control" v-model="idcategory" name="idcategory" id="idcategory" aria-describedby="idcategoryHelp" placeholder="ID de catégorie" />
            </div>
          </div>
          <button type="button" style="margin-top: 20px" @click='createUser()' class="btn btn-success">Create</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'CreateProduct',
  data() {
    return {
      libelle: '',
      prix: '',
      quantite: '',
      idcategory: '',
    }
  },
  methods: {
    createProduct() {
      console.log(this.libelle)
      const payload = {
        libelle: this.libelle,
        prix: this.prix,
        quantite: this.quantite,
        idcategory: this.idcategory,
      }
      this.$emit('createProduct', payload)
      this.clearForm();
    },
    clearForm() {
      this.libelle = "";
      this.prix = "";
      this.quantite = "";
      this.idcategory = "";
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