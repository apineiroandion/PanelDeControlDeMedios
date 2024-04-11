package BibliotecaDePrueba;
import FuncionamientoApp.*;

public class IniciarBiblioteca {
    public static Biblioteca iniciarBiblioteca(Biblioteca biblioteca){
        biblioteca.getVideos().add(new Video("Video0", 3.10f));
        biblioteca.getVideos().add(new Video("Video1", 4.20f));
        biblioteca.getVideos().add(new Video("Video2", 5.20f));
        biblioteca.getVideos().add(new Video("Video3", 1.20f));
        biblioteca.getVideos().add(new Video("Video4", 1.30f));
        biblioteca.getVideos().add(new Video("Video5", 1.40f));
        biblioteca.getVideos().add(new Video("Video6", 2.50f));
        biblioteca.getVideos().add(new Video("Video7", 6.80f));
        biblioteca.getVideos().add(new Video("Video8", 7.90f));
        biblioteca.getVideos().add(new Video("Video9", 1.10f));
        biblioteca.getVideos().add(new Video("Video10", 3.00f));
        biblioteca.getVideos().add(new Video("Video11", 3.00f));
        biblioteca.getVideos().add(new Video("Video12", 3.00f));
        biblioteca.getVideos().add(new Video("Video13", 2.00f));
        biblioteca.getVideos().add(new Video("Video14", 2.00f));
        biblioteca.getVideos().add(new Video("Video15", 2.50f));
        biblioteca.getVideos().add(new Video("Video16", 1.00f));
        biblioteca.getVideos().add(new Video("Video17", 1.00f));
        biblioteca.getVideos().add(new Video("Video18", 2.00f));
        biblioteca.getVideos().add(new Video("Video19", 8.00f));
        biblioteca.getVideos().add(new Video("Video20", 9.00f));
        biblioteca.getVideos().add(new Video("Video21", 1.00f));
        biblioteca.getVideos().add(new Video("Video22", 1.00f));
        biblioteca.getVideos().add(new Video("Video23", 2.00f));
        biblioteca.getVideos().add(new Video("Video24", 3.00f));

        return biblioteca;
    }
}
