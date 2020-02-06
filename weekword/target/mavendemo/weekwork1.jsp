<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2020/2/6
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>jQuery练习</title>
<style type="text/css">
    .div1{
        float: left;
        width: 50px;
        line-height: 30px;
        background-color: lightgray;
        margin-left: 10px;
        text-align: center;
        vertical-align: middle;
    }
    .div2{
        width: 300px;
        height: 300px;
        border: solid gray 1px;
        margin-top: 60px;
        color: red;
    }
    .div2Blue{
        background-color: blue;
    }
</style>


</head>
<body>
<h2>请选择背景颜色</h2>
<div>
    <div id="blue" class="div1">蓝色</div>
    <div id="green" class="div1">绿色</div>
</div>
<div class="div2" id="bg">
</div>
<div>输入颜色首字母： <input type="text" name="color"></div>
<script type="text/javascript" src="webapp/jquery-3.3.1.js"></script>
<script type="text/javascript">
    alert("欢迎来到颜色调节页面!");

    // 点击蓝色：下方div变成蓝色，并且显示文字"蓝色"
    $("#blue").click(function(){
        // 先删除
        $("div.div2").removeAttr("style");
        $("#bg").css("background-color","blue");
        $("#bg").text("蓝色背景");
    });

    // 点击绿色，下方div变成绿色,字体加粗和斜体
    $("#green").click(function(){
        // 先删除之前的样式
        $("div.div2").removeAttr("style");
        $("#bg").css({"background-color":"green","font-style":"italic","font-weight":"bold"});
        $("#bg").text("绿色背景");
    });

    $("input[name='color']").keypress(function(event){
        if(event.keyCode == 66){
            $("#bg").empty();
            $("#bg").css("background-color","blue");
        }else if(event.keyCode == 71){
            $("#bg").empty();
            $("#bg").css("background-color","green");
        }

    });
</script>
</body>
</html>
