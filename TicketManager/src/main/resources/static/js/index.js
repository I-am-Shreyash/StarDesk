const loginBtn = document.getElementById('loginBtn');

const loginForm = document.getElementById('form-wrapper');

const closeBtn = document.getElementById('close');

const bg = document.getElementById('row-div');

const inputField = document.getElementById('loginId-input');
        
        loginBtn.addEventListener('click', () => {
            loginForm.style.display="flex";
            bg.style.filter="blur(2px)";
        });
        
        closeBtn.addEventListener('click', () => {
            loginForm.style.display="none";
             bg.style.filter="blur(0px)";
        });
 
  