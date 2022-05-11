var app = new Vue({
	el: '#app',
	data() {
		return {
			produit: {}
		}
	},
	mounted() {
	},
	methods: {
			submit(){
				axios.post('/user/produit', this.produit)
				.then(response => {
					
				})
			}
		}
		
	});