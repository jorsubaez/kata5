package software.ulpgc.kata5.application.remote;

import software.ulpgc.kata5.application.database.Desktop;
import software.ulpgc.kata5.application.database.RemoteStore;
import software.ulpgc.kata5.application.database.TsvMovieParser;
import software.ulpgc.kata5.architecture.model.Movie;
import software.ulpgc.kata5.architecture.viewmodel.Histogram;
import software.ulpgc.kata5.architecture.viewmodel.HistogramBuilder;

import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Desktop.create(new RemoteStore(TsvMovieParser::from))
                .display()
                .setVisible(true);
    }

}