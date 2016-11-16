package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score = 0;
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() == 10){
			throw new BowlingException();
		}else{
			if(isNextFrameBonus()){
				setBonus(frame.getFirstThrow(),frame.getSecondThrow());
				score();
			}
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		return(frames.get(frames.size()).bonus() != 0);
	}
}
