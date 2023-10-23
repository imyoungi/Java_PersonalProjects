package DatabaseConnVer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FotmobDAO {
	private JdbcTemplate jdbcTemplate;

	public FotmobDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	public List<FotmobVo> selectTeam() {
		String sql = "SELECT * FROM fotmob_detail ORDER BY point DESC";
		Connection conn = jdbcTemplate.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;

		List<FotmobVo> result = new ArrayList<>();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				FotmobVo vo = new FotmobVo(
						rs.getString("name"), 
						rs.getString("coach"), 
						rs.getString("hometown"),
						rs.getString("bestplayer"),
						rs.getInt("point"), 
						rs.getString("previousrank"),
						rs.getDouble("mompoint"),
						rs.getInt("play"),
						rs.getInt("id"));
				result.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public int insertTeam(String name, String coach, String hometown, 
			String bestplayer, int point, String previousrank,
			double mompoint, int play, int leagueid) {
		String sql = "INSERT INTO fotmob_detail"
//		(\"NO\", \"NAME\",\"COACH\",\"HOMETOWN\",\"BESTPLAYER\",\"POINT\",\"PREVIOUSRANK\",\"MOMPOINT\",\"PLAY\",\"id\")"
				+ " VALUES (\"detail_seq\".nextval,?,?,?,?,?,?,?,?,?)";

		Connection conn = jdbcTemplate.getConnection();
		PreparedStatement psmt = null;
		
		int result = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, coach);
			psmt.setString(3, hometown);
			psmt.setString(4, bestplayer);
			psmt.setInt(5, point);
			psmt.setString(6, previousrank);
			psmt.setDouble(7, mompoint);
			psmt.setInt(8, play);
			psmt.setInt(9, leagueid);
			
			result = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return result;

	}

}
