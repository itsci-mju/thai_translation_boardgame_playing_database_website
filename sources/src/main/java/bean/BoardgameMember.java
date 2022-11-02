package bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Entity
@Table(name="creatroomkey")

public class BoardgameMember implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(length=50)
	private int boardgameId;
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="memberId", nullable=false,unique=true,referencedColumnName = "memberId")
	private Member mbid;
	
    @OneToMany
    @JoinColumn(name="memberId", nullable=false)
    private Member mem;

	public BoardgameMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardgameMember(int boardgameId, Member mbid) {
		super();
		this.boardgameId = boardgameId;
		this.mbid = mbid;
	}

	public int getBoardgameId() {
		return boardgameId;
	}

	public void setBoardgameId(int boardgameId) {
		this.boardgameId = boardgameId;
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
