package minechain;

public class MineChain {
	
	public static void main(String[] args) {
		
		Block genesisBlock = new Block("Hi I am the FIRST BLOCK!", "0");
		System.out.println("Hash for block 1: " + genesisBlock.hash);
		
		Block secondBlock = new Block("I am the SECOND BLOCK!", "1");
		System.out.println("Hash for block 1: " + secondBlock.hash);
		
		Block thirdBlock = new Block("Well, I am the THIRD BLOCK!", "2");
		System.out.println("Hash for block 2: " + thirdBlock.hash);
		
	}

}
