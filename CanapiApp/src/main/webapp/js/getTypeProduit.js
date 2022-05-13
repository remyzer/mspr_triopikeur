var typeProduit = new Vue({
	el: '#typeProduit',
	data() {
		return {
			typeProduit:[]
		}
	},
	mounted() {
		axios.get('/user/listTypeProduit')
				.then(response => {
					this.typeProduit = response.data.data
				})
	},
	methods: {
		
	}
	});