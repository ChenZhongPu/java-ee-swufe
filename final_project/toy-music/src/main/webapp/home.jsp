<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link rel="icon" href="assets/image/logo.png" type="image/png">
    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
        main > .container {
            padding: 60px 15px 0;
        }
        .quote {
            margin: 0;
            background: #eee;
            padding: 1em;
            border-radius: 1em;
        }
        .quote figcaption,
        .quote blockquote {
            margin: 1em;
        }
    </style>
    <title>SWUFE Music</title>
</head>
<body class="d-flex flex-column h-100">

<header>
    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">SWUFE Music</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav me-auto mb-2 mb-md-0">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sign up</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Log in</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="admin">Admin</a>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</header>

<!-- Begin page content -->
<main class="flex-shrink-0">
    <div class="container">
        <figure class="quote">
            <blockquote>
                Without music life would be a mistake.
            </blockquote>
            <figcaption>
                &mdash; Jeremy Keith, <cite>Mental models</cite>  </figcaption>
        </figure>
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            <c:forEach var="song" items="${songs}">
                <div class="col">
                    <a href="song?id=${song.id}">
                        <div class="card shadow-sm" style="width: 18rem;">
                            <img src="${song.imageURL}" class="card-img-top bd-placeholder-img" height="225" width="100%">
                            <div class="card-body">
                                <p class="card-text">${song.title} <span class="badge bg-success">by</span> ${song.singer}</p>
                            </div>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
</main>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

</body>
</body>
</html>