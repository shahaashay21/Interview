import java.util.ArrayList;
import java.util.LinkedList;

public class StackList {
	private Integer tos;
	LinkedList<Object> array = new LinkedList<>();
	
	public StackList(){
		this.tos = null;
	}
	
	public void push(Integer data){
		array.add(data);
	}
	
	public Object pop(){
		Object temp = array.get(array.size()-1);
		array.remove(array.size()-1);
		return temp;
	}
	
	public Object peak(){
		return(array.get(array.size()-1));
	}
	
	public boolean isEmpty(){
		if(array.size() == 0){
			return true;
		}else{
			return false;
		}
	}
}
