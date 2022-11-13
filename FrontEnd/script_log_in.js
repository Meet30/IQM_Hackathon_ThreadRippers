

function Auth_user(data,cur_pass){
    let original_pass = data['password'];
    console.log(data);
    if(cur_pass !== original_pass){
        alert("Wrong Password");
    }
    else{
        console.log("reached here");
        window.location.href = "/index.html";
    }
}

function fetchUser(adminname, pass){
    fetch( "http://localhost:8080/admin/" + adminname)
        .then((response) => {
            if (!response.ok) {
                alert("No User found Please Register youself first");
                throw new Error("No user found");
            }
            return response.json();
        })
        .then((data) => Auth_user(data,pass));
}

document.getElementById('login-btn').onclick = function() {
    const login_email = document.getElementById('login-email').value;
    const login_pass = document.getElementById('login-pass').value;

    document.getElementById('login-email').value = '';
    document.getElementById('login-pass').value = '';

    fetchUser(login_email, login_pass);
}

document.onkeyup = function(e){
    if(e.key === 'Enter'){
        const login_email = document.getElementById('login-email').value;
        const login_pass = document.getElementById('login-pass').value;

        document.getElementById('login-email').value = '';
        document.getElementById('login-pass').value = '';

        fetchUser(login_email, login_pass);
    }
 }





