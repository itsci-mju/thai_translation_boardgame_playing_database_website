package bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.exolab.castor.types.DateTime;

@Entity
@Table(name = "Playgame")
public class Playgame {
	@Id()
	@Column(length = 50)
	private String roomId;
	@Column(length = 50)
	private LocalDateTime date_time;
	@Column(length = 50)
	private String add_play_game;
	@Column(length = 50)
	private String player;
	@Column(length = 50)
	private String match_result;
	@Column(length = 50)
	private String player_win;
	@Column(length = 50)
	private String player_loss;

	
	  @ManyToOne
	  @JoinColumn(name="memberId ", nullable=false,referencedColumnName = "memberId" ) 
	  private Member remember ;
				  
		  @ManyToOne
		  @JoinColumn(name="boardgameId ", nullable=false ) 
		  private Boardgame bog ;
		 
	 

	public Playgame() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Playgame(String roomId, LocalDateTime date_time, String match_result, String player_win, String player_loss,
			Member remember, Boardgame bog) {
		super();
		this.roomId = roomId;
		this.date_time = date_time;
		this.match_result = match_result;
		this.player_win = player_win;
		this.player_loss = player_loss;
		this.remember = remember;
		this.bog = bog;
	}



	public String getRoomId() {
		return roomId;
	}



	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}



	public LocalDateTime getDate_time() {
		return date_time;
	}



	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}



	public String getMatch_result() {
		return match_result;
	}



	public void setMatch_result(String match_result) {
		this.match_result = match_result;
	}



	public String getPlayer_win() {
		return player_win;
	}



	public void setPlayer_win(String player_win) {
		this.player_win = player_win;
	}



	public String getPlayer_loss() {
		return player_loss;
	}



	public void setPlayer_loss(String player_loss) {
		this.player_loss = player_loss;
	}



	public Member getRemember() {
		return remember;
	}



	public void setRemember(Member remember) {
		this.remember = remember;
	}



	public Boardgame getBog() {
		return bog;
	}



	public void setBog(Boardgame bog) {
		this.bog = bog;
	}






}
