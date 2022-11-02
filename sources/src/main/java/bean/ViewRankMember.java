package bean;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
@Entity

public class ViewRankMember implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(length=50)
	private String gamename;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="memberId", nullable=false,unique=true,referencedColumnName = "memberId")
	private Member mbid;

	public ViewRankMember(String gamename, Member mbid) {
		super();
		this.gamename = gamename;
		this.mbid = mbid;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
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
