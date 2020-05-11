//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="nfl_players")
//public class Players {
//
//	@Id
//	@Column(name="id")
//	private int id;
//	
//	@Column(name="name")
//	private String playerCard;
//	
//	@Column(name="passing_yards")
//	private int passingYards;
//	
//	@Column(name="passing_touchdowns")
//	private int passingTouchdowns;
//	
//	@Column(name="picks")
//	private int picks;
//	
//	@Column(name="rushing_yards")
//	private int rushYards;
//	
//	@Column(name="lost_fubles")
//	private int lostFumbles;
//	
//	@Column(name="fantasyPoints")
//	private int fantasyPoints;
//	
//	
//	
//	public Players() {
//		
//	}
//
//
//
//	public Players(String playerCard, int passingYards, int passingTouchdowns, int picks, int rushYards,
//			int lostFumbles, int fantasyPoints) {
//		this.playerCard = playerCard;
//		this.passingYards = passingYards;
//		this.passingTouchdowns = passingTouchdowns;
//		this.picks = picks;
//		this.rushYards = rushYards;
//		this.lostFumbles = lostFumbles;
//		this.fantasyPoints = fantasyPoints;
//	}
//
//
//
//	public int getId() {
//		return id;
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//
//	public String getPlayerCard() {
//		return playerCard;
//	}
//
//
//
//	public void setPlayerCard(String playerCard) {
//		this.playerCard = playerCard;
//	}
//
//
//
//	public int getPassingYards() {
//		return passingYards;
//	}
//
//
//
//	public void setPassingYards(int passingYards) {
//		this.passingYards = passingYards;
//	}
//
//
//
//	public int getPassingTouchdowns() {
//		return passingTouchdowns;
//	}
//
//
//
//	public void setPassingTouchdowns(int passingTouchdowns) {
//		this.passingTouchdowns = passingTouchdowns;
//	}
//
//
//
//	public int getPicks() {
//		return picks;
//	}
//
//
//
//	public void setPicks(int picks) {
//		this.picks = picks;
//	}
//
//
//
//	public int getRushYards() {
//		return rushYards;
//	}
//
//
//
//	public void setRushYards(int rushYards) {
//		this.rushYards = rushYards;
//	}
//
//
//
//	public int getLostFumbles() {
//		return lostFumbles;
//	}
//
//
//
//	public void setLostFumbles(int lostFumbles) {
//		this.lostFumbles = lostFumbles;
//	}
//
//
//
//	public int getFantasyPoints() {
//		return fantasyPoints;
//	}
//
//
//
//	public void setFantasyPoints(int fantasyPoints) {
//		this.fantasyPoints = fantasyPoints;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Players [id=" + id + ", playerCard=" + playerCard + ", passingYards=" + passingYards
//				+ ", passingTouchdowns=" + passingTouchdowns + ", picks=" + picks + ", rushYards=" + rushYards
//				+ ", lostFumbles=" + lostFumbles + ", fantasyPoints=" + fantasyPoints + "]";
//	}
//	
//	
//	
//	
//	
//}
