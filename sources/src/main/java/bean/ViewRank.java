package bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="View_Rank")
public class ViewRank {

	@EmbeddedId
	private ViewRankMember vrmb;
	@Column(length=50)
	private LocalDate date_play;
	@Column(length=50)
	private double win_percentage;
	public ViewRank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ViewRank(ViewRankMember vrmb, LocalDate date_play, double win_percentage) {
		super();
		this.vrmb = vrmb;
		this.date_play = date_play;
		this.win_percentage = win_percentage;
	}
	public ViewRankMember getVrmb() {
		return vrmb;
	}
	public void setVrmb(ViewRankMember vrmb) {
		this.vrmb = vrmb;
	}
	public LocalDate getDate_play() {
		return date_play;
	}
	public void setDate_play(LocalDate date_play) {
		this.date_play = date_play;
	}
	public double getWin_percentage() {
		return win_percentage;
	}
	public void setWin_percentage(double win_percentage) {
		this.win_percentage = win_percentage;
	}
	
	
	

}
