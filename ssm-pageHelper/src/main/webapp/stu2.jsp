<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" ></script>
<script type="text/javascript">
	$(document).ready(function(){
		show();
	});
	//ajax请求得到List<stu>
	var pageNum = 1;
	function show() {
		$.ajax({
			type : "post",  //请求方式有"post"和"get"
			url : "getAllStuByPage2.do", //请求的url
			dataType : "text", //接收到的数据类型
			data:{
				pageNum:pageNum
			},
			success: function(json) {//成功执行后的回调函数
				var obj = JSON.parse(json);
			 	var inf = "<table border='1'>";
			 	inf +="<tr><td>id</td><td>name</td><td>sex</td><td>age</td></tr>";
			 	var list = obj.list;
			 	for(var i=0; i<list.length; i++) {
			 		var stu = list[i];
			 		inf += "<tr><td>"+stu.id+"</td><td>"+stu.name+"</td><td>"+stu.sex+"</td><td>"+stu.age+"</td></tr>";
			 	}
			 	inf += "</table>";
			 	inf += "<a href='javascript:last()'>上一页</a>";
			 	inf += "当前第<span>"+obj.pageNum+"/"+obj.totalPageNum+"</span>页";
			 	inf += "<a href='javascript:next("+obj.totalPageNum+");'>下一页</a>";
			 	$("#myDiv").html(inf);
			},
			error : function(msg) {//失败执行后的回调函数
				alert("失败");
			}
		}); 
	}
	function last() {
		if(pageNum>1){
			pageNum--;
			show();
		}else {
			alert("已经是第一页")
		}
	}
	function next(totalPageNum) {
		if(pageNum<totalPageNum){
			pageNum++;
			show();
		}else {
			alert("已经是最后一页")
		}
	}
</script>
</head>
<body>
	<div id="myDiv">
	</div>
</body>
</html>








