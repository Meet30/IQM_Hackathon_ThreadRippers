// --------------------------

function addNode(nodename,neigh) {

    // add node
    let data = {
        "pointName": nodename,
    }


    fetch("http://localhost:8080/points/", {

        // Adding method type
        method: "POST",
        mode: "cors",
        // Adding body or contents to send
        body: JSON.stringify(data),

        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    })


    // Add neighbour
    fetch("http://localhost:8080/road/" + (nodename + "," + neigh), {

        // Adding method type
        method: "POST",
        mode: "cors",
        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    })
}

document.getElementById('node-submit').onclick = function () {
    const nodename = document.getElementById('nodename').value;
    const neigh = document.getElementById('neighb').value;

    document.getElementById('nodename').value = '';
    document.getElementById('neighb').value = '';

    addNode(nodename,neigh);
}


document.onkeyup = function(e){
    if(e.key === 'Enter'){
        const nodename = document.getElementById('nodename').value;
        const neigh = document.getElementById('neighb').value;

        document.getElementById('nodename').value = '';
        document.getElementById('neighb').value = '';

        addNode(nodename,neigh);
    }
 }