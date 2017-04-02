package nz.co.westpac.automation.famework;

/**
 * This class keeps the status of the result and the error messages
 */
public class Result {
	public static Result instance = null;
	private boolean status = true;
	private StringBuffer message = new StringBuffer();
	
	private Result(){
		
	}
	
	public static Result result(){
		if(instance==null){
			instance = new Result();
		}
		return instance;
	}
	
	public void setStatus(boolean status){
		this.status = this.status && status;
	}
	
	public void appendMessage(String message){
		this.message.append(message);
	}
	public boolean getStatus(){
		return status;
	}
	public String getMessage(){
		return message.toString();
	}
	

}
