var faktura = new Vue({
  el: '#faktura',
  data: {
    dropdownYes: false
  },
  methods: {
    dropdownChange: function() {
        this.dropdownYes = facture.value;
        console.log(facture.value);
        console.log(this.dropdownYes);
    }
  }
})