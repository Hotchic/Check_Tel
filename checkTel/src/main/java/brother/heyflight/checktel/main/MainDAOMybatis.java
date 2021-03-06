package brother.heyflight.checktel.main;

/*import org.apache.ibatis.session.SqlSession;
import com.springbook.biz.util.SqlSessionFactoryBean;*/

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import brother.heyflight.checktel.plan.PlanVO;



@Repository
public class MainDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	/*private SqlSession mybatis;
	
	public BoardDAOMybatis(){
		mybatis = SqlSessionFactoryBean.getSqlSessionInsance();
	}*/
	
	public void insertMain(MainVO mainVO) {
        System.out.println("===> Mybatis로 insertMain() 기능 처리");
        mybatis.insert("MainDAO.insertMain", mainVO); //main-mapping.xml에서 namespace.id 값 vo 를 parameterType에 대입
    }

	public List<MainVO> getPlanList(PlanVO planVO) {
		System.out.println("===> Mybatis로 getPlanList() 기능 처리");
        return mybatis.selectList("MainDAO.getPlanList", planVO);
	}
    public int deleteBlog(int planNo) {
        System.out.println("===> Mybatis로 deleteBlog() 기능 처리");
        return mybatis.delete("MainDAO.deleteBlog", planNo);
    }
    
    public List<MainVO> getBlogL(PlanVO planVO) {
		System.out.println("===> Mybatis로 getBlogL() 기능 처리");
        return mybatis.selectList("MainDAO.getBlogL", planVO);
	}
    
    public List<MainVO> getmyBlogL(PlanVO planVO) {
		System.out.println("===> Mybatis로 getmyBlogL() 기능 처리");
        return mybatis.selectList("MainDAO.getmyBlogL", planVO);
	}
/*    public PlanVO ResPlan(MainVO vo) {	
		System.out.println("===> Mybatis로 ResPlan() 기능 처리");
	    return mybatis.selectOne("PlanDAO.ResPlan", vo);
	}*/

	public int deleteUpd(int planNo) {
		System.out.println("===> Mybatis로 deleteUpd() 기능 처리");
        return mybatis.delete("MainDAO.deleteUpd", planNo);
	}

	public int updPeriod(int planNo) {
		System.out.println("===> Mybatis로 updPeriod() 기능 처리");
        return mybatis.update("MainDAO.updPeriod", planNo);
		
	}

	public void blogHit(HitVO hitVO) {
		System.out.println("===> Mybatis로 blogHit() 기능 처리");
		mybatis.insert("HitDAO.blogHit", hitVO);
	}

	public void deleteHit(HitVO hitVO) {
		System.out.println("===> Mybatis로 deleteHit() 기능 처리");
		mybatis.insert("HitDAO.deleteHit", hitVO);
		
	}

	public void hitUpd(HitVO hitVO) {
		System.out.println("===> Mybatis로 hitUpd() 기능 처리");
        mybatis.update("PlanDAO.hitUpd", hitVO);
		
	}

	public void updTitle(BlogVO blogVO) {
		System.out.println("===> Mybatis로 updTitle() 기능 처리");
		mybatis.update("MainDAO.updTitle", blogVO);		
	}
}
