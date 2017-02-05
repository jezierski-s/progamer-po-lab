var search = document.getElementById("search");

function tableFilter(){
  console.log(search.value);
}

search.onchange = tableFilter;