package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;
import com.ltts.model.Auction;
import com.ltts.model.Team;

public class AuctionDao {
	
	
	public List<Auction> AuctionDao()
	{
		List<Auction> li= new ArrayList<Auction>();
		return li;
	}
	public Auction getAuctionById(int id)
	{
		Auction p=new Auction();
		return p;
	}
	
	
	
	
	public boolean insertAuction(Auction p) throws Exception {
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?)");
		ps.setInt(1, p. getAuc_id());
		ps.setInt(2, p. getPlayer_id());
		ps.setInt(3, p.getTeam_id());
		ps.setInt(4, p.getAmount());
		
		
		return ps.execute();
	}
	
	public List<Auction> getAllAuction() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection mc=MyConnection.getConnection();
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from auction");
	
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1), rs.getInt(2),rs.getInt(3),rs.getInt(4)));
			
		}
		return li;
}
}