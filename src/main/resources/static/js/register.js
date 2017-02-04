var password = document.getElementById("formPassword")
, confirm_password = document.getElementById("formPassword2");

function validatePassword(){
  if (password.value.length < 6) {
    password.setCustomValidity("Hasło jest za krótkie!");
  }
  else {
    password.setCustomValidity('');
  }
  if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Hasła są różne!");
  } else {
    confirm_password.setCustomValidity('');
  }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;