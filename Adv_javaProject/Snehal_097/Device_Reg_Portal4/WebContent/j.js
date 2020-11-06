function validate(){
    var f=document.getElementById("form");
   
    var hasPasswordError = validatePassword(f);
    var hasUserNameError = UserNameValidate(f);
    
    if( !hasPasswordError || !hasUserNameError)
    	return false;
    	else
    	return true;
    	}
    


 function  validatePassword(form){
    var error1=document.getElementById("passwordError");
    error1.innerHTML="Give Password";

    var password=form["password"].value;

    error1.innerHTML="";
  

    if( password==null || password==""){
        error1.innerHTML="Give Password";
    }

    else if(password.length<5 || password.length>3){
        error1.innerHTML="Password has to be 5 to 10 chars"
    }
    
    if(error.innerHTML.length > 0)
    	return false;
    	else
    	return true;
    	


}

function UserNameValidate(form){
 var error=document.getElementById("UserNameError");

    var firstName=form["firstName"].value;

    error.innerHTML="";

    if( fName==null || firstName==""){
        error.innerHTML="Input Your FirstName";
    }

    else if(!isNaN(id)){
        error.innerHTML="Name Can Not be a number";
    }

    else if(UserName.length<5 || firstName.length>10){
        error1.innerHTML="Name has to be 5 to 10 chars"
    }
    
    if(error.innerHTML.length > 0)
    	return false;
    	else
    	return true;
    	}

    


