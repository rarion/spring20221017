<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<style>
		.sample{
            display: flex;
            text-align: center;
            padding: 20px 10px;
        }
        .a{
            border-radius: 30px;
            margin: auto;
            margin-bottom: 10px;
            width:200px;
    
            
        }

        .sample1{
            background-color: blanchedalmond;
        }
        .sample2{
            margin: 0px;
            background-color: navy;
        
        }
        .sample2>div {
            color : #333;
            background-color: aliceblue;
            margin: 30px;
        }
        @media (max-width: 600px){
            .row{
                display: block;
            }
        }
        
    </style>
</head>
<body>
	<div class="sample">
        <div class="sample1" style="flex: 1;">
            <div style="font-size: 24px; font-weight: bold;"> STILL DOLL</div>
            <div>still you do not answer</div>
            <div class="a" style="background-color: lightgreen; color: black;">Hi</div>
            <div class="a" style="background-color: green; color:white;">Hello</div>
            <div class="a" style="background-color: skyblue; color:black;">silence</div>
            <div class="a" style="background-color: blue; color:white;" >darkness</div>
        </div>
        <div class="sample2" style="flex: 1;">
            <div>
                Hi ms Alice
                <br>
                still you do not answer
                <br>
                a world of darkness
                <br>
                a world of silence
                <br>
                still you do not answer

            </div>
        </div>
    </div>
</body>
</html>
