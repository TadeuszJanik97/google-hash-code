import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tadek on 23/02/2017.
 */
public class Main {

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
            ArrayList<Video> videos = new ArrayList<>();
            for (int i = 0; i < videosNumber; i++) {
                int videoSize = scanner.nextInt();
                Video video = new Video();
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

        } catch(Exception e){
            System.err.println(e);
        }
    }

}
