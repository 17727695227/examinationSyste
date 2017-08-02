var h=0;//hours
var m=0;//mins
var s=0;//secs
var t ;



function onloadss(){
	settime();
	stoptime();
}


function settime(){
	h=parseInt(s/3600);
	m=parseInt(s/60);
	t=s%60;
	h=checkTime(h);
	m=checkTime(m);
	t=checkTime(t);
	document.getElementById("timess").innerHTML="用　时　　"+h+":"+m+":"+t;
	s += 1;
	setTimeout('settime()',1000);
}

function checkTime(i){
	if (i<10) 
	{
		i="0" + i;
	}
	return i;
}


function stoptime(){
	setTimeout('stop()',7200000);
}

function stop(){
	alert("考试时间已到，正在提交答卷！");
	/*
	var a= new  Array();
	a[0] = document.getElementsByName("choose1");
	a[1] = document.getElementsByName("choose2");
	a[2] = document.getElementsByName("choose3");
	a[3] = document.getElementsByName("choose4");
	a[4] = document.getElementsByName("choose5");
	a[5] = document.getElementsByName("choose6");
	a[6] = document.getElementsByName("choose7");
	a[7] = document.getElementsByName("myanswer1");
	a[8] = document.getElementsByName("myanswer2");
	a[9] = document.getElementsByName("myanswer3");
	for(var i = 0; i < a.length ; i++)
	{
		for(var j = 0 ; j < a[i].length ; j ++)
		{
			a[i][j].disabled = true;
		}
	}
	*/
	document.questionss.submit();
}
