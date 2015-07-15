<%--
  Created by IntelliJ IDEA.
  User: dean
  Date: 14/07/15
  Time: 11:46
  author: randomQuote.author + "," + randomQuote.year, content: randomQuote.content
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Hey!</title>
</head>

<body>
<p>${quote.content}</p>
<br/><br/>
<p>-${quote.author}, ${quote.year}</p>
</body>
</html>