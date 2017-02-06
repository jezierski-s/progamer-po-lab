var search = document.getElementById("search");

function tableFilter(){
  console.log(search.value);
}

search.onchange = tableFilter;

var badge = new Vue({
  el: '#badge',
  data: {
    message: 'Hello Vue!',
    itemCount: 0
  }
})

var butBuy = new Vue({
  el: '#butBuy',
  data: {
    searchString: '',
    gameArray: games
  },
  methods: {
    addItem: function (ind) {
        badge.itemCount++;
        var xhttp = new XMLHttpRequest();
        xhttp.open("POST", "api/addToCart", false);
        xhttp.setRequestHeader("Content-type", "application/json");
        xhttp.send(JSON.stringify(this.gameArray[ind]));
        //var response = JSON.parse(xhttp.responseText);
}
  }
})

var searchFilter = new Vue({
  el: '#searchFilter',
  data: {
    searchString: ''
  },
  methods: {
    doFilter: function () {
        butBuy.searchString = this.searchString;

    }
  }
})