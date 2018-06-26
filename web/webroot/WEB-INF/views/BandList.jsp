<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!doctype html>
<html>
    <title>Band List</title>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.css"> <!-- thats important for animation effects -->
  <link href="https://fonts.googleapis.com/css?family=Arbutus" rel="stylesheet"> <!-- Demo -->
  <style><%@ include file="/static/css/bandlist.css" %></style>
   <style><%@ include file="/static/css/comment.css" %></style> 
<script><%@ include file="/static/javascript/bandlist.js" %></script>
    </head>
    <body>
    <header>      
        <div class="container">
            <div class="row">
                <div class="col-md-12" data-aos="fade-left" data-aos-duration="2600" data-aos-once="true" >
                    <h1>${country}</h1>
                    <p><strong> Available bands in your country</strong></p>
                </div>
                <div class="col-md-12" data-aos="fade-right" data-aos-duration="2600" data-aos-once="true" ><center>
                <c:forEach var="band" items="${bands}">
                    <a class="btn btn-link" href="${country}/bands/${band.id}">${band.name}</a>
                     </c:forEach>
                 </center>
                </div>
            </div>
        </div>    
</header>
<script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.js"></script> <!-- Important for animation -->  
</body>
</html>