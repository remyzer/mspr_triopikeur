<template>
  <div class="container" >
    <div v-show="show">
      <updateClient />
    </div>
    <h2>Users</h2>
    <b-table class="table table-bordered" id="tableau_clients">
      <thead>
      <tr>
        <th>Id</th>
        <th>Prénom</th>
        <th>Nom</th>
        <th>E-mail</th>
        <th>Téléphone</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="client in Clients" :key="client.id">
        <td>{{ client.id }}</td>
        <td>{{ client.prenom }}</td>
        <td>{{ client.nom }}</td>
        <td>{{ client.email }}</td>
        <td>{{ client.tel }}</td>
        <td><button @click="deleteClient(client)">Supprimer</button></td>
        <td><button  @click="updateClient()">Modifier</button></td>
      </tr>
      </tbody>
    </b-table>
  </div>
</template>

<script>
import axios from "axios";
import updateClient from "@/main/webapp/components/updateClient";

const instance = axios.create({baseURL:"http://localhost:8081"})

export default {
  name: 'listClient',
  props: ['listClient'],
  components: {
    updateClient
  },
  data() {
    return {
      Clients:[],
      show: false
    }
  },
  mounted() {
    instance.get('/public/listClient')
        .then(response => {
          this.Clients = response.data.data
        })
  },
  methods: {
    deleteClient: function (client){
      instance.post("/public/deleteClient", client.id, {headers: {
          'Content-Type': 'application/json'
        }})
          .then(response => {
            if (response.data.success) {
              this.$forceUpdate()
            }
          })
    },
    updateClient: function () {
      this.show = !this.show
    }
  }
}
</script>