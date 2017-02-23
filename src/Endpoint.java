import java.util.ArrayList;
import java.util.HashMap;

public class Endpoint {
    private int ID;
    private int d_latency;
    private ArrayList<Video> videos;
    private ArrayList<Integer> requests;
    private HashMap<Video, Integer> hash_map;

    public Endpoint (int ID, int d_latency){
        this.ID = ID;
        this.d_latency = d_latency;
        //hash_map = createHashMap(videos, requests);
    }

    private HashMap<Video, Integer> createHashMap(ArrayList<Video> videos, ArrayList<Integer> requests){
        int size = videos.size();
        HashMap<Video, Integer> hash_map = new HashMap(size);
        for (int i = 0; i < size; i++){
            hash_map.put(videos.get(i), requests.get(i));
        }
        return hash_map;
    }

    public int getID (){ return ID;}

    public int getLatency (){ return d_latency;}

    public boolean hasVideo (){ return this.hash_map.isEmpty();}

    public int getAmount (Video video){ return this.hash_map.get(video);}
}