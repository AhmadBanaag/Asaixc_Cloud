package minechain;

import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class MineChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	
	public static void main(String[] args) {
		
	blockchain.add(new Block("Hi I am the FIRST block", "0"));
	blockchain.add(new Block("Hi I am the SECOND block", blockchain.get(blockchain.size()-1).getHash()));
	blockchain.add(new Block("Hi I am the THIRD block", blockchain.get(blockchain.size()-1).getHash()));
	
	String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
			System.out.println(blockchainJson);
	}
	
	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		
		for (int i = 1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i - 1);
			
			
			if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
				System.out.println("CURRENT HASHES NOT EQUALS!");
				return false;
			}
			
			if (!previousBlock.getHash().equals(currentBlock.getPreviousHash())) {
				System.out.println("PREVOUS HASH NOT EQUAL!");
				return false;
			}
		}
		
		return true;
	}
	
}
