<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>
	<my:navBar></my:navBar>

	
	<div class="container-md">
		<div class="row">
			<div class="col">
				<h1>${board.id}번게시물 수정</h1>
				<form id="modifyForm" action="" method="post" enctype="multipart/form-data">
					<input type="hidden" name="id" value="${board.id }">
					<div class="mb-3">
						<label class="form-label"> 제목 </label> 
						<input class="form-control" type="text" name="title" value="${board.title }">
					</div>
					<div class="mb-3">
						<label class="form-label"> 본문 </label>
						<textarea rows="5" class="form-control" name="content" readonly>${board.content }</textarea>
					</div>
					
					<!-- 이미지 출력 -->
						
					<div class="mb-3">
						<c:forEach items="${board.fileName }" var="name">
	
							<div class="row">
								<div class="col-2">
									<%-- 삭제 여부 체크박스 --%>
									삭제
									<input type="checkbox" name="removeFiles" value="${name }">
								</div>
								<div class="col-10">
									<div>
										<img class="img-fluid img-thumbnail" src="/image/${board.id }/${name}" alt="">
									</div>
								</div>
							</div>
						</c:forEach>		
					</div>

					
					<div class="mb-3">
						<label class="form-label"> 작성자 </label> 
						<input class="form-control" type="text" name="writer" value="${board.writer}">
					</div>
					<div>
						<label class="form-label"> 작성일시 </label> 
						<input class="form-control" type="datetime-local" value="${board.inserted}" readonly>
					</div>
				</form>
				<input class="btn btn-warning" type="submit" value="수정" data-bs-toggle="modal" data-bs-target="#modifyModal">
				
				<c:url value="/board/remove" var="removeLink"></c:url>
				<form id="deleteForm" action="${removeLink }" method="post">
					<input type="hidden" name="id" value="${board.id }">
				</form>
				<input class="btn btn-danger" type="submit" value="삭제" data-bs-toggle="modal" data-bs-target="#deleteModal">
					
			</div>
		</div>
	</div>






	<!-- Modal -->
	<div class="modal fade" id="modifyModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">수정</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">수정하시겠습니까?</div>
				<div class="modal-footer">
					<button id="modifyConfirmButton" type="button"
						class="btn btn-secondary" data-bs-dismiss="modal">확인</button>
					<button type="button" class="btn btn-primary"
						data-bs-dismiss="modal">취소</button>
				</div>
			</div>
		</div>
	</div>


	<div class="modal fade" id="deleteModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">삭제</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">삭제하시겠습니까?</div>
				<div class="modal-footer">
					<button id="deleteConfirmButton" type="button"
						class="btn btn-secondary" data-bs-dismiss="modal">확인</button>
					<button type="button" class="btn btn-primary"
						data-bs-dismiss="modal">취소</button>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
	<script>
		document.querySelector("#modifyConfirmButton").addEventListener(
				"click", function() {
					document.querySelector("#modifyForm").submit();
				});

		document.querySelector("#deleteConfirmButton").addEventListener(
				"click", function() {
					document.querySelector("#deleteForm").submit();
				});
	</script>
</body>
</html>