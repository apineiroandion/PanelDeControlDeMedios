package BibliotecaDePrueba;
import FuncionamientoApp.*;

public class IniciarBiblioteca {
    public static Biblioteca iniciarBiblioteca(Biblioteca biblioteca){
        biblioteca.getVideos().add(new Video("Video0", 310));
        biblioteca.getVideos().add(new Video("Video1", 420));
        biblioteca.getVideos().add(new Video("Video2", 520));
        biblioteca.getVideos().add(new Video("Video3", 120));
        biblioteca.getVideos().add(new Video("Video4", 130));
        biblioteca.getVideos().add(new Video("Video5", 140));
        biblioteca.getVideos().add(new Video("Video6", 250));
        biblioteca.getVideos().add(new Video("Video7", 680));
        biblioteca.getVideos().add(new Video("Video8", 790));
        biblioteca.getVideos().add(new Video("Video9", 110));
        biblioteca.getVideos().add(new Video("Video10", 300));
        biblioteca.getVideos().add(new Video("Video11", 300));
        biblioteca.getVideos().add(new Video("Video12", 300));
        biblioteca.getVideos().add(new Video("Video13", 200));
        biblioteca.getVideos().add(new Video("Video14", 200));
        biblioteca.getVideos().add(new Video("Video15", 250));
        biblioteca.getVideos().add(new Video("Video16", 100));
        biblioteca.getVideos().add(new Video("Video17", 100));
        biblioteca.getVideos().add(new Video("Video18", 200));
        biblioteca.getVideos().add(new Video("Video19", 800));
        biblioteca.getVideos().add(new Video("Video20", 900));
        biblioteca.getVideos().add(new Video("Video21", 100));
        biblioteca.getVideos().add(new Video("Video22", 100));
        biblioteca.getVideos().add(new Video("Video23", 200));
        biblioteca.getVideos().add(new Video("Video24", 300));

        return biblioteca;
    }
}
