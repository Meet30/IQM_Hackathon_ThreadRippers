// --------------------------

function addUser(username, contact, nodal_point) {

    let data = {
        "nodalPoint": nodal_point,
        "contactNo": contact,
        "studentName": username
    }

    fetch("http://localhost:8080/student/", {

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
}

document.getElementById('user-submit').onclick = function () {
    const username = document.getElementById('user-id').value;
    const contact = document.getElementById('c-id').value;
    const nodal_point = document.getElementById('pickup').value;

    document.getElementById('user-id').value = '';
    document.getElementById('c-id').value = '';
    document.getElementById('pickup').value = '';


    addUser(username,contact,nodal_point);
}

document.onkeyup = function(e){
    if(e.key === 'Enter'){
        const username = document.getElementById('user-id').value;
        const contact = document.getElementById('c-id').value;
        const nodal_point = document.getElementById('pickup').value;

        document.getElementById('user-id').value = '';
        document.getElementById('c-id').value = '';
        document.getElementById('pickup').value = '';

        addUser(username,contact,nodal_point);
    }
 }
