<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers1();
%>
<table>
<tr>
<th>Player_id</th>
<th>Player Name</th>
<th>DateofBirth</th>
<th>Nationality</th>
<th>Skils</th>
<th>Runs</th>
<th>Wickets</th>
<th>No of Matches</th>
<th>Team ID</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p. getPlayer_id() %></td>
<td><%=p.getName() %></td>
<td><%=p.getDateOfBirth() %></td>
<td><%=p.getNationality() %></td>
<td><%=p. getSkills() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getNumber_of_matches() %></td>
<td><%=p.getTeam_id() %></td>
</tr>
<%} %>
</table>
</body>
</html>