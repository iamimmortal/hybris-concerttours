<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!doctype html>
<html>
    <title>Band List</title>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style><%@ include file="/static/comment.css" %></style>
    </head>
    <body>

        <h1>Band List</h1>
     <ul>
         <div class="list-group" id="bands">
     <c:forEach var="band" items="${bands}">
     <a href="${country}/bands/${band.id}"class="list-group-item list-group-item-action">${band.name}</a>
      </c:forEach>
              </div>
      </ul>
   <!-- ${pageContext.request.contextPath } -->
    </body>
</html>