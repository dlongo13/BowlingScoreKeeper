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
			this.frames.add(frame);
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		for(int i = 0; i < frames.size(); i++){
			if(isNextFrameBonus()){
			this.score += (frames.get(i).score()+frames.get(i+1).bonus());
				if(frames.get(i+1).isStrike()){
					this.score +=  frames.get(i+2).score();
				}
			}else{
				this.score += frames.get(i).score();
			}
		}		
		return score;
	}
	
	public boolean isNextFrameBonus(){
		return(frames.get(frames.size()).bonus() != 0);
	}
}
