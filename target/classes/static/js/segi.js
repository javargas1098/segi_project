function setTable() {
	
	axios.get('/segi/intelmqjson').then(function (response) {
// console.log(response.data);
    	var json = response.data;
    	console.log(json);
    	
// var par = document.getElementById("actual2");
//     
// $("#actual2").empty();
//        
// for (m in json) {
// // console.log(m);
// var fila = document.createElement("button");
// fila.setAttribute("class", "dropdown-item");
// fila.setAttribute("onclick","renameInputDropdown('"+m+"'); return false;");
// fila.innerHTML = m + ": " + json[m];
// par.appendChild(fila);
// // console.log(response.data[m]);
// }
//        
// var par = document.getElementById("actualButton");
        
    
            
        
    });
	
}