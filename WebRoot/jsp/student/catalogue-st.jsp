<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ds.model.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>EVERY CATALOGUE</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="everyCatalogue">
	<meta http-equiv="description" content="This is everyCatalogue">
	
	<link rel="stylesheet" type="text/css" href="css/student/catalogueSR.css">
	
  </head>
  
  <body onload="onloadss()">  
  
      <% 
         List<FinishDatabase> list = (List<FinishDatabase>) request.getAttribute("list"); 
         FinishDatabase q1 = list.get(0);
         FinishDatabase q2 = list.get(1);
         FinishDatabase q3 = list.get(2);
         FinishDatabase q4 = list.get(3);
         FinishDatabase q5 = list.get(4);
         FinishDatabase q6 = list.get(5);
         FinishDatabase q7 = list.get(6);
         FinishDatabase q8 = list.get(7);
         FinishDatabase q9 = list.get(8);
         FinishDatabase q10 = list.get(9);
      %>
      
              <form class="questions" action="checkPaper.action" name="questionss">
              
                  <div class="captitle">　
                                                                      第<%= q1.getSection() %>章单元测试
                  </div>
                                      
	              <div class="tips">
	              
	                 <table class="intips">
	                   <tr><td class="rows">总　分　　100</td></tr>
	                   <tr><td class="rows">题　数　　10 </td></tr>
	                   <tr><td class="rows">时　长　　2小时</td></tr>
	                   <tr><td class="rows">开　始　　<%= session.getAttribute("startTime") %></td></tr>
	                   <tr><td class="rows" id="timess">用　时　　00:00:00</td></tr>
	                   <tr><td class="sprs">提　示　　本考试只允许考一次，请认真作答，提交将结束考试</td></tr>
	                 </table>
	              </div>
	              
	              <div class="partone">
	                  <table>
	                    <tr><td class="partonet">　第一部分　选择题</td><td class="partoneb">　总题数　7</td></tr>
	                  </table>	              
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　1　【单选题】(10分)</p>
	                      <p>　　　　　<%= q1.getQuestion() %>
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose1" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q1.getA() %><br>
	                  <input type="radio" 
	                         name="choose1" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q1.getB() %><br>
	                  <input type="radio" 
	                         name="choose1" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q1.getC() %><br>
	                  <input type="radio" 
	                         name="choose1" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q1.getD() %><br>
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　2　【单选题】(10分)</p>
	                      <p>　　　　　<%= q2.getQuestion() %>
	                                　
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose2" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q2.getA() %><br>
	                  <input type="radio" 
	                         name="choose2" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q2.getB() %><br>
	                  <input type="radio" 
	                         name="choose2" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q2.getC() %><br>
	                  <input type="radio" 
	                         name="choose2" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q2.getD() %><br>
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　3　【单选题】(10分)</p>
	                      <p>　　　　　<%= q3.getQuestion() %>
	                                
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose3" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q3.getA() %><br>
	                  <input type="radio" 
	                         name="choose3" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q3.getB() %><br>
	                  <input type="radio" 
	                         name="choose3" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q3.getC() %><br>
	                  <input type="radio" 
	                         name="choose3" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q3.getD() %><br>
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　4　【单选题】(10分)</p>
	                     <p>　　　　　<%= q4.getQuestion() %>
	                                　
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose4" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q4.getA() %><br>
	                  <input type="radio" 
	                         name="choose4" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q4.getB() %><br>
	                  <input type="radio" 
	                         name="choose4" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q4.getC() %><br>
	                  <input type="radio" 
	                         name="choose4" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q4.getD() %><br>
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　5　【单选题】(10分)</p>
	                      <p>　　　　　<%= q5.getQuestion() %>
	                                
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose5" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q5.getA() %><br>
	                  <input type="radio" 
	                         name="choose5" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q5.getB() %><br>
	                  <input type="radio" 
	                         name="choose5" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q5.getC() %><br>
	                  <input type="radio" 
	                         name="choose5" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q5.getD() %><br>
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　6　【单选题】(10分)</p>
	                      <p>　　　　　<%= q6.getQuestion() %>
	                               　
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose6" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q6.getA() %><br>
	                  <input type="radio" 
	                         name="choose6" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q6.getB() %><br>
	                  <input type="radio" 
	                         name="choose6" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q6.getC() %><br>
	                  <input type="radio" 
	                         name="choose6" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q6.getD() %><br>
	              </div>
	              
	              <div class="questionpartone">            
	                  <div class="questiononediv">
	                      <p class="inquestiononediv">　7　【单选题】(10分)</p>
	                      <p>　　　　　<%= q7.getQuestion() %>	                        　
	                      </p>
	                  </div>
	                  <input type="radio" 
	                         name="choose7" 
	                         class="select" 
	                         value="A">A.&nbsp;<%= q7.getA() %><br>
	                  <input type="radio" 
	                         name="choose7" 
	                         class="select" 
	                         value="B">B.&nbsp;<%= q7.getB() %><br>
	                  <input type="radio" 
	                         name="choose7" 
	                         class="select" 
	                         value="C">C.&nbsp;<%= q7.getC() %><br>
	                  <input type="radio" 
	                         name="choose7" 
	                         class="select" 
	                         value="D">D.&nbsp;<%= q7.getD() %><br>
	              </div>
	              
	              <div class="parttwo">
	                  <table>
	                    <tr><td class="parttwot">　第二部分　填空题</td><td class="parttwob">　总题数　3</td></tr>
	                  </table>	              
	              </div>
	              
	              <div class="questionparttwo">            
	                  <div class="questiontwodiv">
	                      <p class="inquestiontwodiv">　8　【填空题】(10分)</p>
	                      <p>　　　　　<%= q8.getQuestion() %> </p>
	                  </div>
	                                                       　　我的答案：<input type="text" 
	                                   name="myanswer1" 
	                                   class="myanswer" 
	                                   id="myanswer1">                  
	              </div>
	              
	              <div class="questionparttwo">            
	                  <div class="questiontwodiv">
	                      <p class="inquestiontwodiv">　9　【填空题】(10分)</p>
	                      <p>　　　　　<%= q9.getQuestion() %> </p>
	                  </div>
	                                                       　　我的答案：<input type="text" 
	                                   name="myanswer2" 
	                                   class="myanswer" 
	                                   id="myanswer2">                  
	              </div>
	              
	               <div class="questionparttwo">            
	                  <div class="questiontwodiv">
	                      <p class="inquestiontwodiv">　10　【填空题】(10分)</p>
	                      <p>　　　　　<%= q10.getQuestion() %> </p>
	                  </div>
	                                                       　　我的答案：<input type="text" 
	                                   name="myanswer3" 
	                                   class="myanswer" 
	                                   id="myanswer3">                  
	              </div>
	              <input type="hidden" name="section" value=<%= q1.getSection() %>>
	              <input type="submit" class="examsubmit" value="提交考试">
	              
	              <div class="theend">
	              </div>
              </form>    
  </body>
  
  <script type="text/javascript" src="js/student/catalogue-st.js"></script>
  
</html>
