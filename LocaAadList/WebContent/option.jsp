<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Option page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
		<div class="row">
			<div class="col-md-6 offset-2">
				<div class="card" style="background-color: #f6f6f6;">
					<div class="card-body">
						<form action="/ProcessServlet" method="post">
							<h5 class="card-title">What type of posting is this:
								${sessionScope.questions[sessionScope.startIndex].question}</h5>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='a'
									name="answer"> <label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionA} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='b'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionB} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='c'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionC} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='d'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionD} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='e'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionE} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='f'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionF} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='g'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionG} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='h'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionH} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='i'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionI} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='j'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionJ} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='k'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionK} </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" value='l'
									name="answer"><label class="form-check-label">
									${sessionScope.questions[sessionScope.startIndex].optionL} </label>
							</div>
							<div class="card-footer"
								style="margin-left: 0px; padding-left: 0px;">
								<c:if test="${sessionScope.startIndex lt 3 }">
									
								</c:if>
								<a href ="index.jsp" type="button">Continue</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>