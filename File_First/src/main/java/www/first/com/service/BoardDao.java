package www.first.com.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	private SqlSessionTemplate sst;
	
	public void insert(Board board) {//쿼리 있는곳과 쿼리 아이디적으면된다
		sst.insert("www.first.com.service.BoardMapper.insert", board);
	}
}