<template>
  <div class="container">
    <div class="row">
      <div class="col-md-7 mrgnbtm card add_client d-flex justify-content-center" id="add_client">
        <h2>Ajouter un client</h2>
        <form>
          <div class="row">
            <div class="form-group col-md-6">
              <label htmlFor="exampleInputEmail1">Prénom</label>
              <input type="text" class="form-control" v-model="nom" name="firstname" id="firstname" aria-describedby="emailHelp" placeholder="First Name" />
            </div>
            <div class="form-group col-md-6">
              <label htmlFor="exampleInputPassword1">Nom</label>
              <input type="text" class="form-control" v-model="prenom" name="lastname" id="lastname" placeholder="Last Name" />
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-12">
              <label htmlFor="exampleInputEmail1">Email</label>
              <input type="text" class="form-control" v-model="email" name="email" id="email" aria-describedby="emailHelp" placeholder="Email" />
            </div>
            <div class="form-group col-md-12">
              <label htmlFor="exampleInputEmail2">Telephone</label>
              <input type="text" class="form-control" v-model="tel" name="tel" id="tel" aria-describedby="telHelp" placeholder="tel" />
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-8">
              <label htmlFor="exampleInputAdresse">Adresse</label>
              <input type="text" class="form-control" v-model="adresse" name="adresse" id="adresse" aria-describedby="adresseHelp" placeholder="Adresse" />
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-4">
              <label htmlFor="exampleInputPostCode">Code Postal</label>
              <input type="text" class="form-control" v-model="code_postal" name="postcode" id="postcode" aria-describedby="postcodeHelp" placeholder="Code Postal" />
            </div>
            <div class="form-group col-md-8">
              <label htmlFor="exampleInputVille">Ville</label>
              <input type="text" class="form-control" v-model="ville" name="ville" id="ville" aria-describedby="villeHelp" placeholder="Ville" />
            </div>
          </div>
          <button type="button" @click='createUser()' class="btn btn-danger">Create</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
const instance = axios.create({baseURL:"http://localhost:8081"})


export default {
  name: 'CreateUser',
  data() {
    return {
      nom: '',
      prenom: '',
      email: '',
      tel: '',
      adresse: '',
      code_postal: '',
      ville: '',
    }
  },
  methods: {
    createUser() {
      const client= {
        nom: this.nom,
        prenom: this.prenom,
        email: this.email,
        tel: this.tel,
        adresse: this.adresse,
        code_postal: this.code_postal,
        ville: this.ville
      }
      instance.post('/public/addClient', client)
          .then(response => {
            console.log(response)
          })
          .catch(error => {
            console.log(error.response)
          });
      this.clearForm();
    },
    clearForm() {
      this.nom = "";
      this.prenom = "";
      this.email = "";
      this.tel = "";
      this.adresse = "";
      this.code_postal = "";
      this.ville = "";
    }
  }
}
</script>