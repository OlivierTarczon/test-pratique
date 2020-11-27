var app = new Vue({
	el: '#app',
	data: {
		chattons: [],
		nom: "",
		age: 0,
		description: ""
	},
	created: function() {
		this.recupererListeChattons();
	},
	methods: {
		recupererListeChattons: function() {
			let vm = this;
			axios.get('/chattons').then(function(reponse) {
				vm.chattons.length = 0;
				reponse.data.forEach(function(chatton) {
					vm.chattons.push(chatton);
				});
			}).catch(function(erreur) {
				alert('Impossible de récupérer la liste des chattons :(');
			});
		},
		ajouterChatton: function() {
			let vm = this;
			axios.post('/chattons', {
				nom: vm.nom,
				age: vm.age,
				description: vm.description
			}).then(function(reponse) {
				vm.nom = "";
				vm.age = 0;
				vm.description = "";
				alert("Chatton ajouté avec succès!")
				
				vm.recupererListeChattons();
			}).catch(function(error, reponse) {
				alert("Impossible d'ajouter un chatton :(");
			});
		}
	}
})