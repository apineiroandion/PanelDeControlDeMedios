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
    public ArrayList<String> getVideosNames() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < videos.size(); i++) {
            names.add("ID: "+i+" Nombre: "+videos.get(i).getTitulo());
        }
        return names;
    }
}
