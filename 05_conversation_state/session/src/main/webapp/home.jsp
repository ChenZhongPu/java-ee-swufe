<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Session: User Login</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/bootstrap.css" rel="stylesheet">
<style>
    /* Sticky footer styles
-------------------------------------------------- */
    html {
        position: relative;
        min-height: 100%;
    }
    body {
        /* Margin bottom by footer height */
        margin-bottom: 60px;
    }
    .footer {
        position: absolute;
        bottom: 0;
        width: 100%;
        /* Set the fixed height of the footer here */
        height: 60px;
        line-height: 60px; /* Vertically center the text there */
        background-color: #f5f5f5;
    }


    /* Custom page CSS
    -------------------------------------------------- */
    /* Not required for template or sticky footer method. */

    body > .container {
        padding: 60px 15px 0;
    }

    .footer > .container {
        padding-right: 15px;
        padding-left: 15px;
    }

    code {
        font-size: 80%;
    }

</style>
</head>

<body>

<header>
    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">My website</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
           </ul>
           <a class="btn btn-outline-success my-2 my-sm-0" href="${requestScope.buttonLink}">${requestScope.buttonName}</a>
        </div>
    </nav>
</header>

<!-- Begin page content -->
<main role="main" class="container">
    <h1 class="mt-5">This is a test home page</h1>
    <p class="lead"> Welcome, ${requestScope.name} </p>
</main>

<footer class="footer">
    <div class="container">
        <span class="text-muted">SWUFE Java EE.</span>
    </div>
</footer>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/jquery-3.js"></script>
<script src="assets/popper.min.js"></script>
<script src="assets/popper.js"></script>
<script src="assets/bootstrap.js"></script>
</body>
</html>


