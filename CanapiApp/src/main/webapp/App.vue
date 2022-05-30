<template>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Canapi CRM">
    <meta name="author" content="MSPR Triopikeur">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Bienvenue sur Canapi</title>
</head>

<body>
    <aside>
        <div id="app" class="container-fluid">
            <div class="row flex-nowrap">
                <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 aside_content">
                    <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                        <a href="home.html"
                            class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                            <span class="fs-5 d-none d-sm-inline" style="text-align: center;">
                                <img class="logo_canapi" alt="logo_canapi"
                                    src="./ressources/canapi_transparent.png">
                            </span>
                        </a>
                        <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start" id="menu">
                            <li>
                                <a href="#submenu1" data-bs-toggle="collapse" class="nav-link px-0 align-middle" style="margin-top: 30px;">
                                    <i class="fs-4 bi-speedometer2"></i> <span class="ms-1 d-none d-sm-inline">Commandes à traiter</span> </a>
                             
                            </li>
                            <li>
                                <a href="#" class="nav-link px-0 align-middle" style="margin-top: 30px;">
                                    <i class="fs-4 bi-table"></i> <span class="ms-1 d-none d-sm-inline">Tableau</span></a>
                            </li>
                        </ul>
                        <span class="email_btn">
                            <button type="button" class="btn btn-outline-primary send_email_button">Envoyer un email</button>
                        </span>
                    </div>
                </div>
                <div class="content">
                    <h1 class="welcome_title">Bonjour User</h1>
                </div>
            </div>
        </div>

    </aside>

</body>

</html>
</template>
<script>

</script>