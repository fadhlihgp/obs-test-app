<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h2>Login</h2>
<form id="loginForm" action="login" method="post">
    <div style="margin-bottom: 1rem">
        <label for="username">User ID:</label>
        <input type="text" id="username" name="username"><br>
        <div id="errorMessageUsername" style="color: red"></div>
    </div>

    <div style="margin-bottom: 1rem">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br>
        <div id="errorMessagePassword" style="color: red"></div>
    </div>

    <input type="submit" value="Login">
</form>
</body>
<script type="text/javascript">
    $(document).ready(function() {
        $('#username').click(function() {
            $('#errorMessageUsername').empty();
            $('#errorMessagePassword').empty();
        });

        $('#password').click(function() {
            $('#errorMessageUsername').empty();
            $('#errorMessagePassword').empty();
        });

        $('#loginForm').submit(function(event) {
            // Prevent form submission
            event.preventDefault();

            const errorMessage = '<%= request.getAttribute("error") %>';
            if (errorMessage !== "") {
                alert(errorMessage);
            }

            // Clear previous error messages
            $('#errorMessageUsername').empty();
            $('#errorMessagePassword').empty();

            // Get input values
            const username = $('#username').val();
            const password = $('#password').val();

            // Validate if fields are empty
            if (password === '' && username === '') {
                $('#errorMessageUsername').text('Username is required');
                $('#errorMessagePassword').text('Password is required');
                return;
            }
            if (username === '') {
                $('#errorMessageUsername').text('Username is required');
                return
            }
            if (password === '') {
                $('#errorMessagePassword').text('Password is required');
                return;
            }

            // If all validations pass, submit the form
            this.submit();
        });

    });
</script>
</html>
