<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/import.jsp"%>
<html>
<head>
<title>工作地区</title>
<link href="<%=request.getContextPath()%>/styles/css/common.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/js/commonjs.js"></script>
<script src="<%=request.getContextPath() %>/js/jquery-1.11.1.js"></script>
<script>
	$(function(){
		$("#gzdq_dwszs").load("../service/zj/getProvince");
		$("#gzdq_dwszq").load("../service/zj/getCity",{code:"110000000000"});
		$("#gzdq_dwszj").load("../service/zj/getVillage",{code:"110101000000"});
		//省变化
		$("#gzdq_dwszs").change(function(){
			$("#gzdq_dwszq").empty();
			$("#gzdq_dwszj").empty();			
			$.get("../service/zj/getCity",{code:$("#gzdq_dwszs").val()},function(data){
				$("#gzdq_dwszq").html(data);
				$.get("../service/zj/getVillage",{code:data.substr(15,12)},function(data){
					$("#gzdq_dwszj").html(data);
					$("#dqmc").val($("#gzdq_dwszj").find("option:selected").text());
					$("#dqdm").val($("#gzdq_dwszj").val());
				})
			})
            
		})
		//市变化
		$("#gzdq_dwszq").change(function(){
				$.get("../service/zj/getVillage",{code:$(this).val()},function(data){
					$("#gzdq_dwszj").html(data);
					$("#dqmc").val($("#gzdq_dwszj").find("option:selected").text());
					$("#dqdm").val($("#gzdq_dwszj").val());
				})
		})
		//区变化
		$("#gzdq_dwszj").change(function(){
			$("#dqmc").val($(this).find("option:selected").text());
			$("#dqdm").val($(this).val());
		})
		var gzdq=window.dialogArguments;
		
		if(gzdq!=null){
			$.get("../service/zj/grqz/qzdj_1.do",{code:"dwszs_2",dq:gzdq},function(data){$("#gzdq_dwszs").html(data);})
			$.get("../service/zj/grqz/qzdj_1.do",{code:"dwszq_2",dq:gzdq},function(data){$("#gzdq_dwszq").html(data);})
			$.get("../service/zj/grqz/qzdj_1.do",{code:"dwszj_2",dq:gzdq},function(data){$("#gzdq_dwszj").html(data);})
			
			$("#dqdm").val(gzdq);
			$.get("../service/zj/grqz/qzdj_1.do",{code:"dq_name",dq_id:gzdq},function(data){$("#dqmc").val(data)})
			
		}
		
		
		
		
		//确定提交+校验 
		$("#qued").click(function(){
			if($("#gzdq_dwszs").val()==""){
				alert("省必填");
				return;						
			}
			
			var selectedValue=$("#dqdm").val();
			var selectedText=$("#dqmc").val();
			
			//var option_1=$("<option></option>");
			var opt=$("<option></option><option selected value="+selectedValue+">"+selectedText+"</option>");									
			window.returnValue=opt;
			window.close();			
		})
		
		
	})

</script>
</head>
<body leftmargin="0" topmargin="0" onkeypress="escQuit();">
<form name="form1" style="method">
<table  border="0" cellpadding="0" cellspacing="0" align="center"  width="100%">
	<tr class ="line4"> 
	  <td >&nbsp;</td>
	  <td >&nbsp;</td>
	  <td >&nbsp;</td>
	  <td >&nbsp;</td>
	</tr>
	<tr class ="line1"> 
	  <td align="right" >省&nbsp;&nbsp;&nbsp;&nbsp;</td>
	  <td id="gzdq_dwszstd">
		<select id="gzdq_dwszs" name="gzdq_dwszs"  style="width:120px"  onchange="initGz1()"></select>
	  </td>
	  <td  align="right" >市&nbsp;&nbsp;&nbsp;&nbsp;</td>
	  <td width="40%" id="gzdq_dwszqtd">
		<select id="gzdq_dwszq" name="gzdq_dwszq" style="width:120px"  onchange="initGz2()"></select>
	  </td>
	  
	</tr>
	
	<tr class ="line2" > 
	 <td  align="right" >区&nbsp;&nbsp;&nbsp;&nbsp;</td>
	  <td id="gzdq_dwszjtd">
		<select id="gzdq_dwszj" name="gzdq_dwszj" style="width:120px" onchange="initGz3()"></select>
	  </td>	  
	</tr>
	<tr class ="line2">
	  <td  align="right" >地区代码</td>
	  <td ><input type=text id="dqdm" name="dqdm" value="110101001000" readonly style="width:10em" maxlength="7">
	  </td>
	  <td  align="right" >地区名称</td>
	  <td  ><input type="text" id="dqmc" name="dqmc" value="东华门街道" readonly style="width:10em">
	  </td>
	</tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
  	<tr class ="line2">
	  <td  align="center">&nbsp;</td>
	</tr>
	<tr class ="line2">
	  <td  align="center"><input type="button" id="qued" name="qued" value="确&nbsp;定" class="BUTTONs3"  style="cursor:hands"></td>
	</tr>
  </table>
 </form> 
</body>
</html>	