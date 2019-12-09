<%-- 
    Document   : index
    Created on : Sep 19, 2019, 9:43:28 PM
    Author     : cristhiandgz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="app/lib/boostrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="app/assets/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">

            <h2 class="h1 text-center m-4">Students</h2>

            <div class="row">
                <div class="col-md-5">
                    <div class="card">
                        <h3 class="card-title text-center">Create student</h3>

                        <div class="card-body">
                            <form id="frm_students">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="name" placeholder="Input name" autofocus/>
                                </div>

                                <div class="form-group">
                                    <input type="text" class="form-control" id="lastname" placeholder="Input lastname"/>
                                </div>

                                <div class="form-group">
                                    <input type="text" class="form-control" id="document_number" placeholder="Input document number"/>
                                </div>

                                <div class="form-group">
                                    <input type="password" class="form-control" id="password" placeholder="Input password"/>
                                </div>

                                <button class="btn btn-primary btn-block">Send</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-md-7">
                    <table class="table">
                        <thead>
                            <th>Name</th>
                            <th>Lastname</th>
                            <th>Document number</th>
                        </thead>
                        <tbody id="students_data">
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <script src="app/lib/jquery/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="app/lib/popper.js/popper.min.js" type="text/javascript"></script>
        <script src="app/lib/boostrap/js/bootstrap.min.js" type="text/javascript"></script>
	    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
        <script src="app/assets/js/main.js" type="text/javascript"></script>
    </body>
</html>
