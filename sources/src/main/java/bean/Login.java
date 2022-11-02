package bean;

import javax.persistence.*;


@Entity
@Table(name="Login")
public class Login {
	
	@EmbeddedId
	private LoginMember lgmb;
	@Column(length=50)
	private String password;
	
	@Column(length=50)
	private String member_type;
	
	public Login() {
		super();
		
	}

	public Login(LoginMember lgmb, String password, String member_type) {
		super();
		this.lgmb = lgmb;
		this.password = password;
		this.member_type = member_type;
	}
	
	public Login(String username ,String password, String member_type) {
		super();
		lgmb=new LoginMember();
		lgmb.setUsername(username);
		this.password = password;
		this.member_type = member_type;
	}


	public LoginMember getLgmb() {
		return lgmb;
	}

	public void setLgmb(LoginMember lgmb) {
		this.lgmb = lgmb;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMember_type() {
		return member_type;
	}

	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}
	
	
	

}
