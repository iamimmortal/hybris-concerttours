<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>
<title>Band Details</title>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%-- <style><%@ include file="/static/css/comment.css" %></style> --%>
<style><%@ include file="/static/css/bandDetails.css" %></style>
<script>
<%@ include file="/static/javascript/bandlist.js" %>
</script>

<script>
<%@ include file="/static/javascript/bandDetails.js" %>
</script>
<script type="text/javascript">
function onClick(){
document.getElementById("myForm").reset();
}

function detail()
{
	 $('.detail').modal();
	}
	
function comment()
{
	 $('.comment').modal();
	}
	
function profile()
{
	 $('.profile').modal();
	}
</script>
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
    
});
</script>
</head>
<body>

<header> 
<%--     <h1>Band Details</h1>
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
    <a href="./">Back to Band List</a>
    
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
      </form> --%>
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
      
 <!--  </div>
  </div> -->
   
   <!-- for comment header -->
  <%--  <div class="container-fluid">
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
</div> --%>
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
<div class="container">
	<div class="row">
      <div class="col-md-4 col-md-offset-4">
        <div class="material-button-anim">
          <ul class="list-inline" id="options">
            <li class="option">
              <button class="material-button option1" type="button" onClick="detail()" title="Details" data-placement="top"s>
                <span class="fa fa-braille" aria-hidden="true" style="color:lime;" ></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option2" type="button" onClick="profile()" title="Profile" data-placement="top">
                <span class="fa fa-vcard-o" aria-hidden="true" style="color:lime;"  ></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option3" type="button" onClick="comment()" title="Comment" data-placement="top" data-target="#myModal">
                <span class="fa fa-comments-o" aria-hidden="false" style="color:lime;" ></span>
              </button>
            </li>
          </ul>
          <button class="material-button material-button-toggle" type="button">
            <span class="fa fa-plus" aria-hidden="true" style="color:lime;"></span>
          </button>
        </div>
      </div>
	</div>
</div>


</header>
<!-- modal comment form -->
<div class="modal fade comment" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
  <div class="modal-dialog">
    <div class="modal-content" style="background-color:rgba(206, 130, 58, 0.4);">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title" id="myModalLabel">your name</h4>
      </div>
      <div class="modal-body">
       
       <div class="detailBox">
    <div class="actionBox">
        <ul class="commentList">
        <c:forEach var="comm" items="${comments}">
            <li>
                <div class="commenterImage">
                  <img src="http://placekitten.com/50/50" />
                </div>
                <div class="commentText">
                    <p class="">${comm.comment}</p> <span class="date sub-text">on March 5th, 2014</span>

                </div>
            </li>        
       </c:forEach>
        </ul>
        <%-- <form class="form-inline" role="form">
            <div class="form-group">
                <input class="form-control" type="text" placeholder="Your comments" />
            </div>
            <div class="form-group">
                <button class="btn btn-default">Add</button>
            </div>
        </form> --%>
    </div>
</div>
      </div>
      <div class="modal-footer" >
      <form class="form-inline" role="form" style="float:left;" id="myForm" >
                <input class="form-control" type="text" placeholder="Your comments"  style="width:245%; background-color: rgba(206, 130, 58, 0.7); color:#ffffff"/>
      </form>
      <button type="button" class="btn btn-primary">Add</button>
        <button type="button" class="btn btn-default" data-dismiss="modal" onClick="onClick()">Close</button>
        
      </div>
      
    </div>
  </div>
</div>

<!-- modal for band details -->
<div class="modal fade detail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content" style="background-color:rgba(206, 130, 58, 0.4);">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title" id="myModalLabel">${band.name }</h4>
      </div>
      <div class="modal-body">
       <div class="col-sm">
        <p>${band.description }</p>
       </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" onClick="onClick()">Close</button>
        
      </div>
      
    </div>
  </div>
</div>

<!-- modal for profile details -->
<div class="modal fade profile" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
  <div class="modal-dialog">
    <div class="modal-content" style="background-color:rgba(206, 130, 58, 0.4);">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title" id="myModalLabel">your name</h4>
      </div>
      <div class="modal-body" >
        <div class="content">
    <div class="card" style="background-color:rgba(206, 130, 58, 0.5);">
        <div class="firstinfo"><img src="http://placekitten.com/50/50" />
            <div class="profileinfo">
                <h1>Dharmendra Mourya</h1>
                <h3> FOUNDER,CEO BLOGGER</h3>
                <p class="bio"> <a href="#" target="_blank">Rokz</a> </p>
            </div>
        </div>
    </div>
    <!-- <div class="badgescard"> 
        <span class="fa fa-facebook"></span>
        <span class="fa fa-twitter"> </span>
        <span class="fa fa-google-plus"></span>
        <span class="fa fa-youtube"></span>
        <span class="fa fa-dribble"></span>
        <span class="fa fa-google"></span>
        <span class="fa fa-android"> </span>
    </div> -->
</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" onClick="onClick()" style="background-color:rgba(206, 130, 58, 0.4);">Close</button>
        
      </div>
      
    </div>
  </div>
</div>
</body>
</html>