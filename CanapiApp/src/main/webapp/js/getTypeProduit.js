var typeProduit = new Vue({
	el: '#typeProduit',
	data() {
		return {
			typeproduit: {}
		}
	},
	mounted() {
	},
	methods: {
			submit(){
				axios.post('/user/listTypeProduit', this.typeproduit)
				.then(response => {
					
				})
			}
		}
		
	});