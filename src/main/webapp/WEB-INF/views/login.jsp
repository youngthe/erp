<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login Page</h1>
<form action="login" method="post">
    <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required />
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required />
    </div>
    <div>
        <button type="submit">Login</button>
    </div>
    <div style="color: red;">
        <%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %>
    </div>
</form>
</body>
</html>
