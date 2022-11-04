<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<h1>json 응답처리</h1>
	<button id="btn1">/ex47/sub01 json 응답</button> <br>
	<button id="btn2">/ex47/sub01 json 응답</button> <br>
	<button id="btn3">/ex47/sub03 json 응답</button> <br>
	<button id="btn4">/ex47/sub04 30번 customerID json 응답</button> <br>
	<button id="btn5">/ex47/sub04 34번 supplierID json 응답</button> <br>
	
	<button id="btn6">/ex47/sub06/customerId, customer json 응답 </button>
	<input type="number" placeholder="고객번호" id="customerIdInput1" value="1"> <br>
	
	<button id="btn7">/ex47/sub06/supplierId, supplier json 응답</button>
	<input type="number" placeholder="공급자번호" id="supplierIdInput1" value="7"><br>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
const ctx = "${pageContext.request.contextPath}";

document.querySelector("#btn7").addEventListener("click", () => {
	const supplierId = document.querySelector("#supplierIdInput1").value;
	fetch(ctx+"/ex47/sub07/"+supplierId)
	.then(response => response.json())
	.then(supplier => {
		console.log("id", supplier.id);
		console.log("name", supplier.name);
		console.log("productName", supplier.productName);
		console.log("product", supplier.product);
		console.log("contactName", supplier.contactName);
		console.log("postalCode", supplier.postalCode);
		console.log("country", supplier.country);
		console.log("phone", supplier.phone);
	});
});


document.querySelector("#btn6").addEventListener("click", function() {
	const customerId = document.querySelector("#customerIdInput1").value;
	fetch(ctx + "/ex47/sub06/" + customerId)
	.then(res => res.json())
	.then(cus => {
		console.log("id", cus.id);
		console.log("name", cus.name);
		console.log("contactName", cus.contactName);
		console.log("address", cus.address);
		console.log("city", cus.city);
		console.log("postalCode", cus.postalCode);
		console.log("country", cus.country);
	});
})

document.querySelector("#btn5").addEventListener("click", () => {
	fetch(ctx+"/ex47/sub05")
	.then(response => response.json())
	.then(supplier => {
		console.log("id", supplier.id);
		console.log("name", supplier.name);
		console.log("productName", supplier.productName);
		console.log("product", supplier.product);
		console.log("contactName", supplier.contactName);
		console.log("postalCode", supplier.postalCode);
		console.log("country", supplier.country);
		console.log("phone", supplier.phone);
	});
});


document.querySelector("#btn4").addEventListener("click", () => {
	fetch(ctx+"/ex47/sub04")
	.then(response => response.json())
	.then(customer => {
		console.log("id", customer.id);
		console.log("address", customer.address);
		console.log("contactName", customer.contactname);
		console.log("address", customer.address);
		console.log("city", customer.city);
		console.log("postalCode", customer.postalCode);
		console.log("country", customer.country);
	});
});

document.querySelector("#btn3").addEventListener("click", () => {
	fetch(ctx + "/ex47/sub03")
	.then((res) => res.json())
	.then((data) => {
		console.log(data.color[0]);
		console.log(data.color[1]);
		console.log(data.model);
		console.log(data.location);
	});
});

document.querySelector("#btn2").addEventListener("click", () => {
	fetch(ctx + "/ex47/sub01")
	.then((res) => res.json())
	.then((data) => {
		console.log(data.name);
		console.log(data.job);
		console.log(data.address);
	});
});

document.querySelector("#btn1").addEventListener("click", () => {
	fetch(ctx + "/ex47/sub01")
	.then((res) => res.json())
	.then((data) => console.log(data));
});
</script>
</body>
</html>