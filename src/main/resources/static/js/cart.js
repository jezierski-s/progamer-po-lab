var butBuy = new Vue({
  el: '#butBuy',
  data: {
    cartArray: cart.gameList
  },
    methods: {
      removeItem: function (ind) {
          var xhttp = new XMLHttpRequest();
          xhttp.open("GET", "/api/removeFromCart?ind="+ind, false);
          //xhttp.setRequestHeader("Content-type", "application/json");
          xhttp.send(null);
          var response = xhttp.responseText;
          console.log(response);
          this.cartArray.splice(ind, 1);
        },
        removeAll: function () {
                  var xhttp = new XMLHttpRequest();
                  xhttp.open("GET", "/api/removeAllFromCart", false);
                  //xhttp.setRequestHeader("Content-type", "application/json");
                  xhttp.send(null);
                  var response = xhttp.responseText;
                  console.log(response);
                  this.cartArray.splice(0, this.cartArray.length);
                }
  }
})
