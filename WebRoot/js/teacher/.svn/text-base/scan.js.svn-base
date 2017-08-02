function s1(){
	window.location.href="allList.action?section=1";
}

function s2() {
	window.location.href="allList.action?section=2";
}

function s3() {
	window.location.href="allList.action?section=3";
}

function i1() {
	window.location.href ="jsp/teacher/scan.jsp?section=1";
}

function i2() {
	window.location.href ="jsp/teacher/scan.jsp?section=2";
}

function i3() {
	window.location.href ="jsp/teacher/scan.jsp?section=3";
}

function ck(){
	var list1 = document.getElementsByName("question");
	var list2 = document.getElementsByName("answerA");
	var list3 = document.getElementsByName("answerB");
	var list4 = document.getElementsByName("answerC");
	var list5 = document.getElementsByName("answerD");
	var list6 = document.getElementsByName("result");
	for(var d=0;list1[d].value!=undefined&&list1[d].value!="";d++){
		if(list2[d].value ==""||list3[d].value ==""||list4[d].value ==""||list5[d].value ==""||list6[d].value ==""){
			alert("将题目信息填写完整后再提交");
			return false;
		}
	}
	var list7 = document.getElementsByName("question2");
	var list8 = document.getElementsByName("result2");
	for(var d=0;list7[d].value!=undefined&&list7[d].value!="";d++){
		if(list8[d].value == ""){
			alert("将题目信息填写完整后再提交");
			return false;
		}
	}
	var a = document.getElementById("sec").innerText;
	if(a==null){
		alert("请先选择批量录入第几章");
		return false;
	}else{
		alert("录入成功");
		document.getElementById("cc").value=a;
		return true;
	}
	return false;
}



