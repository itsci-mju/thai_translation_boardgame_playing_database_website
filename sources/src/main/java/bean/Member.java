package bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private Long memberId;
	@Column(length=50, nullable=false)
	private String name;
	//@Column(columnDefinition="DATETIME",nullable=false)
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(length=50,nullable=false)
	private String password;
	@Column(nullable=false)
	private LocalDate birthday;
	@Column(length=50,nullable=false)
	private String phone;
	@Column(length=50,nullable=false)
	private String email;
	@Column(length=100,nullable=false)
	private String memberimages;
	@Column(length=50,nullable=false)
	private String ranked_result;
	@Column(length=50,nullable=false)
	private String status;
	
    @OneToOne(mappedBy = "lgmb.mbid")
    private Login lg;
	/*
	 * @OneToMany private List<Boardgame> bgmem = new ArrayList();
	 */

	 @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "createroom", 
	        joinColumns = { @JoinColumn(name = "memberId") }, 
	        inverseJoinColumns = { @JoinColumn(name = "boardgamId") }
	    )
	 private List<Boardgame> bg = new ArrayList();
	 
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member( String name, String password, LocalDate birthday, String phone, String email,
			String memberimages, String ranked_result, String status) {
		super();

		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.memberimages = memberimages;
		this.ranked_result = ranked_result;
		this.status = status;

	}
	public Member(Long memberId, String name, String password, LocalDate birthday, String phone, String email,
			String memberimages, String ranked_result, String status, Login lg, List<Boardgame> bg) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.memberimages = memberimages;
		this.ranked_result = ranked_result;
		this.status = status;
		this.lg = lg;
		this.bg = bg;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemberimages() {
		return memberimages;
	}

	public void setMemberimages(String memberimages) {
		this.memberimages = memberimages;
	}

	public String getRanked_result() {
		return ranked_result;
	}

	public void setRanked_result(String ranked_result) {
		this.ranked_result = ranked_result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Boardgame> getBg() {
		return bg;
	}

	public void setBg(List<Boardgame> bg) {
		this.bg = bg;
	}

	public Login getLg() {
		return lg;
	}

	public void setLg(Login lg) {
		this.lg = lg;
	}
	

	

}
