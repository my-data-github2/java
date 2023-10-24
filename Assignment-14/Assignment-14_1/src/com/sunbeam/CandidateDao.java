package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {
	private Connection con;

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				System.out.println("HIi");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 add new candidate
	public int add(String newName, String newParty) throws SQLException {
		int cnt;
		String sql = "INSERT INTO candidates VALUES(default,?,?,0)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, newName);
			stmt.setString(2, newParty);
			cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// delete given candidate
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// update candidate
	public int update(String newName, int newId) throws SQLException {
		String sql = "UPDATE candidates SET name = ? WHERE id = ?";
		try (PreparedStatement stmt = con.prepareCall(sql)) {
			stmt.setString(1, newName);
			stmt.setInt(2, newId);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// get all candidates
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// increment candidate vote
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// get all candidates of given party
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// get partywise vote count
	public List<PartyVotes> partyVotes() throws SQLException {
		List<PartyVotes> list = new ArrayList<>();
		String sql = "select party, sum(votes) from candidates group by party";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String newParty = rs.getString("party");
					int newVotes = rs.getInt("sum(votes)");
					PartyVotes pv = new PartyVotes(newParty, newVotes);
					list.add(pv);
				} // while.close();
			} // rs.close();
		} // stmt.close();
		return list;
	}

	//get votes by given partywise 
	public List<PartyVotes> getCandidatesFromGivenParty(String newParty) throws SQLException{
		List<PartyVotes> list = new ArrayList<>();
		String sql = "Select party, sum(votes) from candidates where party = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, newParty);
			try (ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("sum(votes)");
					PartyVotes pv = new PartyVotes(party, votes);
					list.add(pv);
				}
				
			}//rs.close();
		}//stmt.close();
		return list;
	}

}
