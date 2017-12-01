<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html lang="english">
    <head>
        <title>Java-Bean Cafe</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="stylesheet" href="/css/homeStyle.css"/>
    </head>
    <body>
        <header id="title" class="container-fluid" style="padding-bottom: 40px">
                <ul class="nav">
                    <sec:authorize access="isAnonymous()">
                        <li class="nav-item"><a data-toggle="modal" class="btn btn-primary" id="register" href="#" data-target="#registerModal">Register</a></li>
                        <li class="nav-item"><a class="nav-link" id="login" href="/login">Login</a></li>
                    </sec:authorize>

                    <sec:authorize access="isAuthenticated()">
                            <li class="nav-item"><a class="btn btn-primary" id="logout" href="/logout" >Logout</a></li>
                    </sec:authorize>
                </ul>
            <div id="logoTitle" class="row align-items-center">
                <div class="col"></div>
                <div class="col">
                    <img id="logo" width="200" src="http://logodatabases.com/wp-content/uploads/2012/03/java-logo-large.png"/>
                    <h1 id="titleContent">Java-Beans Cafe</h1>
                </div>
                <div class="col"></div>
            </div>
        </header>
        <jsp:include page="menuModal.jsp"/>
        <jsp:include page="voteModal.jsp"/>
        <jsp:include page="contactModal.jsp"/>
        <jsp:include page="RegisterModal.jsp"/>
        <section id="mainBody" class="container-fluid">
            <div class="row align-items-center">
                <div class="col"></div>
                <div class="col" align="center">
                    <div id="menu" class="card" style="width: 20rem;">
                        <img class="card-img-top" src="resources/menu.png" alt="Menu">
                        <div class="card-body">
                            <h4 class="card-title">Menu</h4>
                            <p class="card-text">Check and see what's brewin' at the Java Cafe. Lorem Ipsum Dolor</p>
                            <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#menuModal">Go</a>
                        </div>
                    </div>
                </div>
                <div class="col" align="center">
                    <div id="coffeeVote" class="card" style="width: 20rem;">
                        <img class="card-img-top" src="resources/survey.jpg" alt="Vote Ballot">
                        <div class="card-body">
                            <h4 class="card-title">Beverage of the Week</h4>
                            <p class="card-text">Got a preference as strong as our coffee? Vote and be heard</p>
                            <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#voteModal">Go</a>
                        </div>
                    </div>
                </div>
                <div class="col" align="center">
                    <div id="contact" class="card" style="width: 20rem;">
                        <img class="card-img-top" src="resources/email.jpg" alt="Envelope">
                        <div class="card-body">
                            <h4 class="card-title">Contact Us</h4>
                            <p class="card-text">Want to get in touch? Send us a message and tell us how we're doing!</p>
                            <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#contactModal">Go</a>
                        </div>
                    </div>
                </div>
                <div class="col"></div>
            </div>
        </section>
        <section id="carouselBody" class="container-fluid" style="margin-top: 4em;">
            <div class="row align-items-center" style="padding-top:2em; padding-bottom:2em;">
                <div class="col" align="center">
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class="d-block img-fluid" src="resources/coffee1.jpg" alt="Cup of Coffee">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block img-fluid" src="resources/coffee2.jpg" alt="Cup of Coffee">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block img-fluid" src="resources/coffee3.jpg" alt="Cup of Coffee">
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>
</html>
