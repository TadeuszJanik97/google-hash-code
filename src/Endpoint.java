import java.util.ArrayList;
import java.util.HashMap;

public class Endpoint {
    private int ID;
    private int d_latency;
    private ArrayList<Video> videos;
    private ArrayList<int> requests;
    private Hashmap<Video, int> hash_map;

    public Endpoint (int ID, int d_latency, ArrayList<Video> videos, ArrayList<int> requests){
        this.ID = ID;
        this.d_latency = d_latency;
        hash_map = createHashMap(videos, requests);
    }

    private Hashmap<Video, int> createHashMap(ArrayList<Video> videos, ArrayList<int> requests){
        int size = videos.size();
        Hashmap<Video, int> hash_map = new HashMap(size);
        for (int i = 0; i < size; i++){

        }
    }

    public int getID (){
        return ID;
    }

    public int getLatency (){
        return d_latency;
    }
    public static int getAmount (){

    }

    public

    //method hasvideo. getamout(video) = requests
}