<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- css -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/themes/icon.css">

<script type="text/javascript" src="<%=request.getContextPath()%>/my97/WdatePicker.js"></script>
<!-- js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.easyui.min.js"></script>
</head>
<body>
	<input type	="button" value="查询" onclick="test()" >
	<div id="eee" ></div>
	
</body>
<script type="text/javascript">

	function test(){
		$.ajax({
			url:"<%=request.getContextPath()%>/text/queryWhere.action",
			type:"post",
			dataType:"json",
			success:function(data){
				var str ='';
				for (var i = 0; i < data.length; i++) {
					str += '<a href="#" onclick="tiao('+data.userId+')">'+data.userName+'</a><br>';
				}
				$("#eee").html(str);
			},
			error:function(){
				$.messager.alert('我的消息','添加失败！','info');
			}
		})
	}
	function tiao(id){
		location.href = "<%=request.getContextPath()%>/html/测试"+id+"html.html";
	}

</script>
</html>