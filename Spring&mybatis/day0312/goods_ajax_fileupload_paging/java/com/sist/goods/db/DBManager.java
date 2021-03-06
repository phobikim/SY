package com.sist.goods.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sist.goods.vo.GoodsVo;



public class DBManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/sist/goods/db/dbConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
			System.out.println("sqlSesscionFactory 객체 생성됨!");
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	public static int getTotalRecord() {
		SqlSession session = factory.openSession();
		int count = session.selectOne("goods.totalRecord");
		session.close();
		return count;
	}
	
	
	public static List<GoodsVo> findAll(int start, int end){
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("end", end);
		
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.findAll", map);
		session.close();
		System.out.println("Manager의 findAll동작함");
		return list;
	}


	public static int insert(GoodsVo g) {
		// TODO Auto-generated method stub
		SqlSession session = factory.openSession();
		int re = session.insert("goods.insert", g);
		session.commit();
		session.close();
		return re;
	}


	public static GoodsVo selectGoods(int no) {
		// TODO Auto-generated method stub
		SqlSession session = factory.openSession();
		GoodsVo g= session.selectOne("goods.selectGoods", no);
		session.close();
		return g;
	}


	public static int deleteGoods(int no) {
		// TODO Auto-generated method stub
		SqlSession session = factory.openSession();
		int re = session.delete("goods.deleteGoods", no);
		session.commit();
		session.close();
		return re;
	}


	public static int updateGoods(GoodsVo g) {
		SqlSession session = factory.openSession(true);
		int re = session.update("goods.updateGoods", g);
		//session.commit();
		session.close();
		return re;
	}
}



















