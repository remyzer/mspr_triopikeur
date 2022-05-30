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
        <div class="container-fluid">
            <div class="row flex-nowrap">
                <div class="col-auto col-md-3 col-xl-3 px-sm-2 px-0 aside_content">
                    <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 min-vh-100">
                        <a href="home.html"
                            class="d-flex align-items-center pb-3 mb-md-0 me-md-auto">
                            <span class="fs-5 d-none d-sm-inline" style="text-align: center;">
                                <img class="logo_canapi" alt="logo_canapi"
                                    src="./ressources/canapi_transparent.png">
                            </span>
                        </a>
                        <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2" style="margin: 0 auto; width: 100%;">
                            <table class="table">
                                <h2>Commandes à traiter</h2>
                                <thead>
                                  <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">DATE</th>
                                    <th scope="col">CLIENT ID</th>
                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <th scope="row">1</th>
                                    <td>13/08</td>
                                    <td>00189</td>
                                  </tr>
                                  <tr>
                                    <th scope="row">2</th>
                                    <td>17/07</td>
                                    <td>00190</td>
                                  </tr>
                                  <tr style="border-bottom: hidden;">
                                    <th scope="row">3</th>
                                    <td>24/09</td>
                                    <td>00191</td>
                                  </tr>
                                </tbody>
                              </table>
                        </div>
                        <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2" style="margin: 0 auto; width: 100%;">
                            <table class="table table2">
                                <h2>Stock Faible</h2>
                                <thead>
                                  <tr style="font-size: 0.7em;">
                                    <th scope="col">PRODUIT ID</th>
                                    <th scope="col">TYPE PRODUIT ID</th>
                                    <th scope="col">QUANTITE</th>
                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <th scope="row">6</th>
                                    <td>3</td>
                                    <td>0001</td>
                                  </tr>
                                  <tr>
                                    <th scope="row">8</th>
                                    <td>3</td>
                                    <td>0002</td>
                                  </tr>
                                  <tr style="border-bottom: hidden;">
                                    <th scope="row">2</th>
                                    <td>3</td>
                                    <td>0000</td>
                                  </tr>
                                </tbody>
                              </table>
                        </div>
                        <span class="email_btn">
                            <button type="button" class="btn btn-outline-primary send_email_button">Envoyer un email</button>
                        </span>
                    </div>
                </div>
                <div class="content">
                    <span><a class="logout" href="#">Deconnexion</a></span>
                    <h1 class="welcome_title">Bonjour User</h1>
                    <div class="card dashboard">
                        <div class="card-header dashboard_header">
                          Tableau de bord
                        </div>
                        <div class="card-body">
                            <div class="boutons_acces_principaux d-flex justify-content-around">
                                <a href="#" class="btn btn-outline-secondary main_access_btn">Fichier Client</a>
                                <a href="#" class="btn btn-outline-secondary main_access_btn">Listing Produits</a>
                                <a href="#" class="btn btn-outline-secondary main_access_btn">Listing Commandes</a>
                                <a href="#" class="btn btn-outline-secondary main_access_btn">Stats Commerciales</a>
                            </div>
                          <h5 class="card-title">Accéder rapidement :</h5>
                        </div>
                      </div>
                </div>
            </div>
        </div>

    </aside>

</body>


</html>
</template>
<script>

</script>