package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userDao implements AutoCloseable {
	private Connection con;

	public userDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int add(User user) throws SQLException {
		String sql = "Insert into users values(default,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, user.getFirst_name());
			stmt.setString(2, user.getLast_name());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			stmt.setDate(5, user.getDob());
			stmt.setBoolean(6, user.getStatus());
			stmt.setString(7, user.getRole());
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close()
	}

	public List<User> display() throws SQLException {
		List<User> userList = new ArrayList<>();
		String sql = "Select * from users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fName = rs.getString("first_name");
					String lName = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					Date dob = rs.getDate("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id, fName, lName, email, password, dob, status, role);
					userList.add(u);
				} // while.close();

			} // rs.close()
		} // stmt.close()
		return userList;
	}

	public int update(User user) throws SQLException {
		String sql = "Update users SET first_name= ?, last_name = ? where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, user.getFirst_name());
			stmt.setString(2, user.getLast_name());
			stmt.setInt(3, user.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close()
	}

	public int delete(int id) throws SQLException {
		String sql = "delete from users where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close()
	}
}
