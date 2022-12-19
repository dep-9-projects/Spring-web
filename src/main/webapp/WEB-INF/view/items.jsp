<%@ page import="java.util.List" %>
<%@ page import="lk.ijse.dep9.controller.ItemController" %><%--
  Created by IntelliJ IDEA.
  User: pradeep
  Date: 12/19/22
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Items</title>
</head>
<body>
    <h1>Items</h1>
    <table>
        <thead>
            <tr>
                <th>Code</th>
                <th>Description</th>
                <th>Qty</th>
                <th>Unite price</th>
            </tr>
        </thead>
        <tbody>
            <%  /*Scriplet <= can code from java inside scriplet*/
                List<ItemController.Item> items =(List<ItemController.Item>) request.getAttribute("itemList");
                for (int i = 0; i < items.size(); i++) {
            %>
                <tr>
                    <td><%= items.get(i).getCode()%></td>
                    <td><%= items.get(i).getDescription()%></td>
                    <td><%= items.get(i).getQty()%></td>
                    <td><%= items.get(i).getUnitPrice()%></td>
                </tr>
            <%
                }
            %>
        </tbody>
    </table>

</body>
</html>
