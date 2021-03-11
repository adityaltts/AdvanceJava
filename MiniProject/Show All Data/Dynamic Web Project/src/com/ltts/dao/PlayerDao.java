package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	public List<Player> getAllPlayers()
	{
		List<Player> li= new ArrayList<Player>();
		return li;
	}
	public Player getPlayerById(int id)
	{
		Player p=new Player();
		return p;
	}
	
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getName());
		ps.setString(3, p.getDateOfBirth());
		ps.setString(4, p.getNationality());
		ps.setString(5, p.getSkills());
		ps.setInt(6, p.getRuns());
		ps.setInt(7, p.getWickets());
		ps.setInt(8, p.getNumber_of_matches());
		ps.setInt(9, p.getTeam_id());
		return ps.execute();
	}
	public List<Player> getAllPlayers1() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from player");
	
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9)));
			
		}
		return li;
	}
}