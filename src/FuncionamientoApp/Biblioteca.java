package FuncionamientoApp;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Video> videos = new ArrayList<>();

    public Biblioteca() {}

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
}
