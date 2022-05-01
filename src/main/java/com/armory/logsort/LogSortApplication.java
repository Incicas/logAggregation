package com.armory.logsort;

import com.armory.logsort.generator.LogGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class LogSortApplication {

    public static void main(String[] args) throws IOException {
        // generate log files
        new LogGenerator(100, 100).generate("./src/main/resources/generated/logs/");


        // read log files
        final List<File> logFiles = Arrays.asList(Objects.requireNonNull(new File("./src/main/resources/generated/logs/").listFiles()));

        final Instant start = Instant.now();

        new LogPrinter().printLogs(logFiles);

        final Instant finish = Instant.now();
        System.out.println("\nLog sorting and printing took: " + (finish.toEpochMilli() - start.toEpochMilli()) + "ms");
    }

}
