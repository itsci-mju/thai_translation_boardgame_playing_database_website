package bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
@Entity
@Table(name="Boardgame")
public class Boardgame {
	@Id
	@Column(length=50)
	private int boardgameId;
	@Column(length=50)
	private String boardgamename;
	@Column(length=50)
	private String gametype;
	@Column(length=50)
	private String player_age;
	@Column(length=50)
	private String play_time;
	@Column(length=50)
	private int number_of_player;
	@Column(length=50)
	private String description;
	@Column(length=50)
	private String status;
	@Column(length=50)
	private String boardgame_type;
	
	
    @ManyToMany(mappedBy = "bg")
    private List<Member> memb = new ArrayList<>();	
    
	
	  @ManyToOne
	  
	  @JoinColumn(name="memberId ", nullable=false ) 
	  private Member mem;
	 
	
	public Boardgame() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Boardgame(int boardgameId, String boardgamename, String gametype, String player_age, String play_time,
			int number_of_player, String description, String status, String boardgame_type, List<Member> memb,
			Member mem) {
		super();
		this.boardgameId = boardgameId;
		this.boardgamename = boardgamename;
		this.gametype = gametype;
		this.player_age = player_age;
		this.play_time = play_time;
		this.number_of_player = number_of_player;
		this.description = description;
		this.status = status;
		this.boardgame_type = boardgame_type;
		this.memb = memb;
		this.mem = mem;
	}


	public int getBoardgameId() {
		return boardgameId;
	}


	public void setBoardgameId(int boardgameId) {
		this.boardgameId = boardgameId;
	}


	public String getBoardgamename() {
		return boardgamename;
	}


	public void setBoardgamename(String boardgamename) {
		this.boardgamename = boardgamename;
	}


	public String getGametype() {
		return gametype;
	}


	public void setGametype(String gametype) {
		this.gametype = gametype;
	}


	public String getPlayer_age() {
		return player_age;
	}


	public void setPlayer_age(String player_age) {
		this.player_age = player_age;
	}


	public String getPlay_time() {
		return play_time;
	}


	public void setPlay_time(String play_time) {
		this.play_time = play_time;
	}


	public int getNumber_of_player() {
		return number_of_player;
	}


	public void setNumber_of_player(int number_of_player) {
		this.number_of_player = number_of_player;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getBoardgame_type() {
		return boardgame_type;
	}


	public void setBoardgame_type(String boardgame_type) {
		this.boardgame_type = boardgame_type;
	}


	public List<Member> getMemb() {
		return memb;
	}


	public void setMemb(List<Member> memb) {
		this.memb = memb;
	}


	public Member getMem() {
		return mem;
	}


	public void setMem(Member mem) {
		this.mem = mem;
	}

	

	
	
	

}
