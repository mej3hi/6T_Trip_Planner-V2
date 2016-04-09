package tourHopur;
        /* 
        private String[] type = {"adventure", "city walk", "horseriding", "hiking",  "sightseeing"};
        private String[] difficulty = {"easy", "medium", "hard"};
        private String[] area = {"Capital region", "east", "north", "south", "west"};
        private String[] language = {"danish", "english", "german", "icelandic", "spanish"};
        */
public class Tours {
	private int id;
	private double duration;
	private String type;
	private String difficulty;
	private String area;
	private int price;
	private int seatsTotal;
	private int seatsBooked;
	private String[] language;
	private boolean pickup;
	private boolean handicap;
	private int date;
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public String getArea() {
		return area;
	}
	
	public boolean getPickup() {
		return pickup;
	}
	
	public boolean getHandicap() {
		return handicap;
	}
	
	public String[] getLanguage() {
		return language;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSeatsT() {
		return seatsTotal;
	}
	
	public int getSeatsB() {
		return seatsBooked;
	}
	
	public void setPrice(int n) {
		price = n;
	}
	
	public void setType(String n) {
		type = n;
	}
	
	public void setDuration(int n) {
		duration = n;
	}
	
	public void setArea(String n) {
		area = n;
	}
	
	public void setPickup(boolean isPickup) {
		pickup = isPickup;
	}
	
	public void setHandicap(boolean isHandy) {
		handicap = isHandy;
	}
	
	public void setLanguage(String[] lang) {
		language = lang;
	}
	
	public void setDifficulty(String diff) {
		difficulty = diff;
	}
	
	public void setId(int n) {
		id = n;
	}
	
	public void setSeatsB(int n) {
		seatsBooked = n;
	}
	
	public void setSeatsT(int n) {
		seatsTotal = n;
	}
}
