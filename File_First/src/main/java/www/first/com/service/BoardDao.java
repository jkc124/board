package www.first.com.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	private SqlSessionTemplate sst;
	
	public void insert(Board board) {//���� �ִ°��� ���� ���̵�������ȴ�
		sst.insert("www.first.com.service.BoardMapper.insert", board);
	}
}