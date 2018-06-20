<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>
<title>Band Details</title>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style><%@ include file="/static/comment.css" %></style>
<script type="text/javascript">
function onClick(){
document.getElementById("myForm").reset();
}
</script>
</head>
<body>
    <h1>Band Details</h1>
    Band Details for ${band.name}
    <p>${band.description}</p>
    <p>Music type:</p>
    <ul>
        <c:forEach var="genre" items="${band.genres}">
            <li>${genre}</li>
        </c:forEach>
    </ul>
    <p>Tour History:</p>
    <ul>
        <c:forEach var="tour" items="${band.tours}">
            <li><a href="../tours/${tour.id}">${tour.tourName}</a>(number of concerts: ${tour.numberOfConcerts})</li>
        </c:forEach>
    </ul>
    <a href="../bands">Back to Band List</a>
    
     <h1 style="text-align:center;">Comment..</h1>
      <!-- for popup window  -->    
      
      <div class='container-fluid'>
      <div class="comments">
      <form method="POST" action="${band.id }/addComment" class="form-horizontal" id="myForm">
       <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name:</label>
    <div class="col-sm-10">
      <input type="text" Class="input your-name" placeholder='Type your name here...' id="name" name="name" required/>
      </div>
      </div>
      
       <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Comment:</label>
    <div class="col-sm-10">
      <input type="text" Class="input your-msg" placeholder='Type your message here...' id="comment" name="comment" required/>
      </div>
      </div>
      
       <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-info btn-lg send-msg" data-toggle="modal" data-target="#myModal" >Submit</button>
      <button type="button" class="btn btn-info btn-lg" onclick="onClick()">Clear</button>
      </div>
      </div>
      </form>
    <%-- <form:form action="/addComment" name="bandCommentForm" method="POST" modelAttribute="bandCommentModel" cssClass="form-horizontal" id="myForm" commandName="bandCommentModel">
    <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name:</label>
    <div class="col-sm-10">
      <form:input cssClass="input your-name" placeholder='Type your name here...'  path="name"></form:input>
      </div>
      </div>
      
      <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Comment:</label>
    <div class="col-sm-10">
      <form:textarea cssClass="input your-msg" placeholder='Type your message here...' path="comment"></form:textarea>
      </div>
      </div>
      <form:button class='send-msg'>Send message</form:button>
       <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-info btn-lg send-msg" data-toggle="modal" data-target="#myModal">Submit</button>
      <button type="button" class="btn btn-info btn-lg" onclick="onClick()">Clear</button>
      </div>
      </div> 
      </form:form>--%>
      
      <%--  <form class="form-horizontal" action="" method="get"  >
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name:</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" placeholder="Enter your name..">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="comment">Comment:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="comment" placeholder="Enter your comment..">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label><input type="checkbox"> Remember me</label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form>  --%>
      
  </div>
  </div>
   
   <!-- for comment header -->
   <div class="container-fluid">
   <div class="header">
   <h1>Recent comments...</h1>
   </div>
  <div class="panel-body list-group" id="commentDisplay">
  <c:forEach var="comm" items="${comments}">
    <div class="list-group-item " id="li">
    <div style="height:10px; width:10px;"><img src="http://bootdey.com/img/Content/user_1.jpg" style="height:75px;width:75px"></div>
    <p style="margin-right:100px; color:black;"><b> ${comm.date}</b></p>
    <p style="margin-right:100px; color:green;"><b>${comm.name} says:</b> ${comm.comment}</p>
    <p style="float:right; color:grey;"><b>Band: ${band.name}</b></p>
    
    </div>
     </c:forEach>
</div>
</div>
  <%-- <ul>
        <c:forEach var="comm" items="${comments}">
            <li>${comm.comment}<br></li>
        </c:forEach>
    </ul> --%>
        <!-- Modal -->
<%-- <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Result</h4>
      </div>
      <div class="modal-body">
        <p>      ${result} comment added...</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
      </div>
    </div>

  </div>
</div> --%>
</body>
</html>