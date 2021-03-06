package brother.heyflight.checktel.review;

import java.util.List;

public interface ReviewService {
	void insertReview(ReviewVO vo);
	public int deleteReview(int ReviewVO);	
	List<ReviewVO> getReviewList(ReviewVO vo);
	ReviewVO getReview(ReviewVO vo);
	void updateReview(ReviewVO vo);
}