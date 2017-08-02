function check() {
	document.getElementById("name_div").style.visibility ="hidden";
	document.getElementById("password_div").style.visibility ="hidden";
	document.getElementById("repassword_div").style.visibility ="hidden";
	var name = document.getElementById("name").value;
	var password = document.getElementById("password").value;
	var repassword = document.getElementById("repassword").value;
	var regname=/^[\u4e00-\u9fa5]{0,5}$/;
	var regname1=/^(?!^\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{6,10}$/;
	if(!regname.test(name)){
		document.getElementById("name_div").style.visibility ="visible";
		return false;
	}
	if(!regname1.test(password)){
		document.getElementById("password_div").style.visibility ="visible";
		return false;
	}
	if(password != repassword){
		document.getElementById("repassword_div").style.visibility ="visible";
		return false;
	}
	return true;
}