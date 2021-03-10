package com.ltts.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.configure.MyConnection;

import com.ltts.model.Team;

public class TeamDao {
	public boolean insertTeam(Team t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?,?)");
		ps.setInt(1, t.getTeamId());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnerName());
		ps.setString(4, t.getCoachName());
		ps.setInt(5, t.getPlayerId());
		return ps.execute();
		//return false;
}
}