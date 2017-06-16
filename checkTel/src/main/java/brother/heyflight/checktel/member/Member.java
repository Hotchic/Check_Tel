package brother.heyflight.checktel.member;

import org.springframework.util.StringUtils;

import brother.heyflight.checktel.utils.SecureUtils;

/**
 * MemberVO Class
 * */
public class Member {

	private String memberNo;
	private String memberName;
	private String memberEmail;
	private String memberPw;
	private String memberNick;
	private String memberBirth;
	private String memberSex;
	private String memberCategory;
	private static final String DEFAULT_PASSPHRASE = "!@#!@#%^!(#$!@#asl1aoS9Va021@#";
	
	@SuppressWarnings("unused")
	protected Member(){}
	
	public Member(String memberName, String memberPw, String memberEmail, String memberNick, String memberBirth, String memberSex) {
		super();
		this.memberName = memberName;
		if(StringUtils.isEmpty(memberPw)){
			this.memberPw = SecureUtils.getPasswordHash(DEFAULT_PASSPHRASE, DEFAULT_PASSPHRASE);
		} else {
			this.memberPw = SecureUtils.getPasswordHash(memberPw, memberName);
		}
		this.memberEmail = memberEmail;
		this.memberNick = memberNick;
		this.memberBirth = memberBirth;
		this.memberSex = memberSex;
	}
	
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberSex() {
		return memberSex;
	}
	public void setMemberSex(String memberSex) {
		this.memberSex = memberSex;
	}
	public String getMemberCategory() {
		return memberCategory;
	}
	public void setMemberCategory(String memberCategory) {
		this.memberCategory = memberCategory;
	}
	public boolean isValidPassword(String plainPassword) {
		return SecureUtils.isMatchedPassword(plainPassword, this.memberName, this.memberPw);
	}
	
	@Override
	public String toString() {
		return "MemberVO [memberNo=" + memberNo + ", memberName=" + memberName
				+ ", memberEmail=" + memberEmail + ", memberPw=" + memberPw
				+ ", memberNick=" + memberNick + ", memberBirth=" + memberBirth
				+ ", memberSex=" + memberSex + ", memberCategory="
				+ memberCategory + "]";
	}
	
}