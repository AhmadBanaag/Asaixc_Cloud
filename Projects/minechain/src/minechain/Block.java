package minechain;
import java.util.Date;

public class Block {
	
	private String hash;
	private String previousHash;
	private String data; // Simple message
	private long timeStamp; // as number of milliseconds
	
	// Block Constructor
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); // Making sure we do this after we set the other values
	}
	
	public String getHash() {
		return hash;
	}
	
	public String getPreviousHash() {
		return previousHash;
	}
	
	public String calculateHash() {
		String calculatedHash = StringUtil.applySha256(
				previousHash + 
				Long.toString(timeStamp) + 
				data
				);
		return calculatedHash;
	}
}
