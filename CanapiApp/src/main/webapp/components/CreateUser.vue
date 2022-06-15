<template>
  <div class="container">
    <div class="row">
      <div class="col-md-7 mrgnbtm">
        <h2>Create User</h2>
        <form>
          <div class="row">
            <div class="form-group col-md-6">
              <label htmlFor="exampleInputEmail1">First Name</label>
              <input type="text" class="form-control" v-model="firstName" name="firstname" id="firstname" aria-describedby="emailHelp" placeholder="First Name" />
            </div>
            <div class="form-group col-md-6">
              <label htmlFor="exampleInputPassword1">Last Name</label>
              <input type="text" class="form-control" v-model="lastName" name="lastname" id="lastname" placeholder="Last Name" />
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
            <div class="form-group col-md-4">
              <label htmlFor="exampleInputNumero">Numero</label>
              <input type="text" class="form-control" v-model="numero" name="numero" id="numero" aria-describedby="numeroHelp" placeholder="Numero de rue" />
            </div>
            <div class="form-group col-md-8">
              <label htmlFor="exampleInputAdresse">Adresse</label>
              <input type="text" class="form-control" v-model="adresse" name="adresse" id="adresse" aria-describedby="adresseHelp" placeholder="Adresse" />
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-4">
              <label htmlFor="exampleInputPostCode">Code Postal</label>
              <input type="text" class="form-control" v-model="postcode" name="postcode" id="postcode" aria-describedby="postcodeHelp" placeholder="Code Postal" />
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
      firstName: '',
      lastName: '',
      email: '',
      tel: '',
      numero: '',
      adresse: '',
      postcode: '',
      ville: '',
      id_adresse_client: ''
    }
  },
  methods: {
    createUser() {
      instance.get('/public/getIdAdresse')
          .then(response => {
            this.id_adresse_client = response.data.data
            console.log(this.id_adresse_client)
          })
      const adresse = {
        numero: this.numero,
        adresse: this.adresse,
        postcode: this.postcode,
        ville: this.ville
      }
      const client = {
        firstName: this.firstName,
        lastName: this.lastName,
        email: this.email,
        tel: this.tel,
        id_adresse_client: this.id_adresse_client +1
      }
      /*instance.post('/public/addAdresse', adresse)
      instance.post('/public/addClient',client)*/
      this.clearForm();
    },
    clearForm() {
      this.firstName = "";
      this.lastName = "";
      this.email = "";
      this.tel = "";
      this.numero = "";
      this.adresse = "";
      this.postcode = "";
      this.ville = "";
    }
  }
}
</script>