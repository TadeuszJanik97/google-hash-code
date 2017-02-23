
import java.util.HashMap;

public class Cache {
    
    public int id;
    public int capacity;
    public Endpoint[] endpoints;
    public HashMap<Endpoint,Integer> endpoints_latency;

    public Cache(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    // Calculating delta for a specific video
    public float video_delta(Video video) {
   
        int n = this.endpoints.length;
        int delta = 0;
  
        for (int i=0;i<n;i++) {
            Endpoint e = endpoints[i];
            if (e.hasVideo(video)) {
                int requests = e.getAmount(video);
                delta += requests*(this.endpoints_latency.get(e)-e.d_latency);
            }
        }
        
        float res = delta/video.size;
        
        return res;
        
    }
    
}
