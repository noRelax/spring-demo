/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Spring_jdbc.java 
 * @Package: com.norelax.www
 * @date: 2016年4月8日-下午3:54:10
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.norelax.www;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.relax.www.tx.entity.User;

/**
 * @ClassName: Spring_jdbc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年4月8日 下午3:54:10
 * 
 */
public class Spring_jdbc {
	private static ApplicationContext applicationContext;
	private static JdbcTemplate jdbcTemplate;

	static {
		applicationContext = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
	}

	@Test
	public void test() throws SQLException {
		try {
			// DataSource dataSource=(DataSource)
			// applicationContext.getBean("dataSource");
			// Connection connection = dataSource.getConnection();
			String sql = " insert into user(user_name,user_pwd,user_address) values(?,?,?)";
			int[] batchUpdate = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					System.out.println(ps);
					ps.setString(1, "no_relax");
					ps.setString(2, "123");
					ps.setString(3, "henacsssss");
				}

				@Override
				public int getBatchSize() {

					return 0;
				}
			});
			System.out.println(batchUpdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String sql = " select * from user where user_id>? ";
		// RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
		Map<String, Object> map = new HashMap<>();
		// BeanPropertyRowMapper<? extends Map> rowMapper = new
		// BeanPropertyRowMapper<>(map.getClass());
		// User user = jdbcTemplate.queryForObject(sql, rowMapper, 4);
		// List<? extends Map> usersMap = jdbcTemplate.query(sql, rowMapper,2);
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql, 2);
		System.out.println(queryForList);
	}

	// 获取list集合
	@Test
	public void test1() {
		String sql = " select * from user where user_id>? ";
		RowMapper<User> userMapper = new BeanPropertyRowMapper<>().newInstance(User.class);
		List<User> users = jdbcTemplate.query(sql, userMapper, 2);
		System.out.println(users.get(0).toString());
	}

	// 获取一个map
	@Test
	public void test2() {
		String sql = " select * from user where user_id=? ";
		Map<String, Object> queryForMap = jdbcTemplate.queryForMap(sql, 1);
		Set<Entry<String, Object>> entrySet = queryForMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
