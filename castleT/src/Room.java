

import java.util.HashMap;

public class Room {
    private String description;
    HashMap<String,Room> exit = new HashMap<String,Room>();
    
    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String description,Room room) 
    {
        exit.put(description, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    //维持接口，可以改变内容
    public Room getExit(String direction){
    	 
    	 return exit.get(direction);
         }

    
    public String getExitDes(){
    	StringBuffer s=new StringBuffer();
    		for(String dir:exit.keySet())
    		{
    			s.append(dir);
    			s.append(' ');
    		}
    	return s.toString();
    }
}
