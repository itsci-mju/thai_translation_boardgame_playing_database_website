package bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
@Entity
public class LoginMember implements Serializable{
	
	private static final long serialVersionUID = 1L;


	@Column(length=50)
	private String username;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id", referencedColumnName = "memberId")
	private Member mbid;
	public LoginMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginMember(String username, Member mbid) {
		super();
		this.username = username;
		this.mbid = mbid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Member getMbid() {
		return mbid;
	}
	public void setMbid(Member mbid) {
		this.mbid = mbid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
