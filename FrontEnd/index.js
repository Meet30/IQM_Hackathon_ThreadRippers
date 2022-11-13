

function RenderAlgo(data) {
    var parsed = "";
    var myObj = data;

    for(i = 0; i < myObj.length; i++){
        var myobj = myObj[i];
        parsed += "BUS " + (i+1) + " :   ";
        for(var p in myobj){
            parsed += myobj[p] + "   ";
        }
        parsed += "\n";
    }

    console.log(parsed);

    document.getElementById("display-area").innerText = parsed;
}

function fetchAlgo() {
    fetch( "http://localhost:8080/algorithm/")
    .then((response) => {
        if (!response.ok) {
            alert("Zero Output");
            throw new Error("Zero Output");
        }
        return response.json();
    })
    .then((data) => RenderAlgo(data));
}

document.getElementById('algo-submit').onclick = function() {
    fetchAlgo();
}

document.onkeyup = function(e){
    if(e.key === 'Enter'){
        fetchAlgo();
    }
 }