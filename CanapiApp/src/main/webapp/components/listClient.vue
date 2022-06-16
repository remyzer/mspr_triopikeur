<template>
  <div class="container" >
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
      </tr>
      </tbody>
    </b-table>
  </div>
</template>

<script>
import axios from "axios";

const instance = axios.create({baseURL:"http://localhost:8081"})

export default {
  name: 'listClient',
  props: ['listClient'],
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
  }
}
</script>