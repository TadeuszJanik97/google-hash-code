import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Tadek on 23/02/2017.
 */
public class Main {



    public Video[] get

    public Cache biggestDeltaCache(Cache[] caches, Video[] videos) {

        int c = caches.length;
        int v = videos.length; 
        for (int i=0;i<n;i++) {
            int capacity = caches[i].capacity;
            float[] deltas = new float[v];
            float index = 0;
            for (int j=0;j<v;j++) {
                deltas[i] = cache[i].video_delta(videos[j]);
            }
            int used = 0;
            while (used <= capacity) {
                
            }
        }

    }

    public static void main(String[] args){
        File file = new File("src/kittens.in");
        try {
            Scanner scanner = new Scanner(file);
            int videosNumber = 0, endpointsNumber = 0, requests = 0, caches = 0, cacheSize = 0;
            videosNumber = scanner.nextInt();
            endpointsNumber = scanner.nextInt();
            requests = scanner.nextInt();
            caches = scanner.nextInt();
            cacheSize = scanner.nextInt();
            ArrayList<>
            ArrayList<Video> videos = new ArrayList<>();
            Cache[] cachesArray = new Cache[caches];

            for(int i=0; i<caches; i++){
                cachesArray[i] = new Cache(i, cacheSize);
            }
            for (int i = 0; i < videosNumber; i++) {
                int videoSize = scanner.nextInt();
                Video video = new Video(i, videoSize);
                videos.add(video);
            }
            for(int i=0; i<endpointsNumber; i++){
                int databaseLatency = scanner.nextInt();
                int connectedCaches = scanner.nextInt();
                HashMap<Endpoint, Integer> cacheLatencies = new HashMap<>();
                for(int j=0; j<connectedCaches; j++){
                    int cacheID = scanner.nextInt();
                    int latency = scanner.nextInt();
                }
                Endpoint endpoint = new Endpoint(i, databaseLatency);
            }
            for(int i=0; i<requests; i++){
                int videoID = scanner.nextInt();
                int endpointID = scanner.nextInt();
                int amount = scanner.nextInt();
            }

        } catch(Exception e){
            System.err.println(e);
        }
    }

}
