
function deleteUser(username, contact) {

    fetch("http://localhost:8080/student/" + contact, {
        method: 'DELETE', // Method itself
        mode: "cors",
        headers: {
         'Content-type': 'application/json; charset=UTF-8' // Indicates the content
        },
    })
}

document.getElementById('delete-user').onclick = function () {
    const username = document.getElementById('user-name').value;
    const contact = document.getElementById('con-num').value;

    document.getElementById('user-name').value = '';
    document.getElementById('con-num').value = '';

    deleteUser(username,contact);
}

document.onkeyup = function(e){
    if(e.key === 'Enter'){
        const username = document.getElementById('user-name').value;
        const contact = document.getElementById('con-num').value;

        document.getElementById('user-name').value = '';
        document.getElementById('con-num').value = '';

        deleteUser(username,contact);
    }
 }