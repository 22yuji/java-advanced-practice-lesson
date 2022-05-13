<%--
  GameAppクラス作成後、下記の記述が必要です。
  <%@ page import="app.GameApp"%>
 --%>

<%--@page import="app.GameApp"--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%--
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");

    String result = "未実施";
    
    GameApp gameapp = new GameApp();

    if (name != null && !name.isEmpty()) {
    	// このif分の中で、GameAppクラスのstartメソッドを呼び出し、
    	// 戻り値をresultに代入してください。
    	result = gameapp.start(name);
    }
--%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Java応用_演習問題1</title>
		<style>
		body {
		  border: solid 2px #000080;
		  padding: 5px;
		}
		
		.result {
		  background: #fffacd;
		  display: inline-block;
		  margin: 5px;
		  padding: 10px;
		}
		</style>
	</head>
	
	<body>
	
		<h1>Java応用 - 演習問題1</h1>
		
		<h2>ゲームアプリ実行ページ</h2>
		
		<c:if test="${not empty result}">
		  	<div class="result">
		    	<h3>アプリの実行結果</h3>
		    	<p>${requestScope.result}</p>
		    	<br>
		    	<p>実行時間：${requestScope.playtime}</p>
		    </div>
	 	</c:if>
	  
		<form action="StartAppServlet" method="post">
		    <label>ユーザ名：</label>
		    <input type="text" name="name">
		    <br>
		    
		    <label>アプリ：</label>
		    <label><input type="radio" name="app" value="trump" checked>トランプ</label>
		    <label><input type="radio" name="app" value="darts">ダーツ</label>
		    <label><input type="radio" name="app" value="clock">時計</label>
		    <label><input type="radio" name="app" value="others">その他</label>
		    <br>
		    
		    <button type="submit">実行</button>
		</form>
	</body>
</html>