package com.example.helloservice;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HelloServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Initialize the gRPC server
        Server server = ServerBuilder.forPort(8080)
                .addService(new HelloServiceImpl())
                .build();

        // Start the server
        server.start();
        System.out.println("Server started on port 8080");

        // Keep the server running
        server.awaitTermination();
    }
}
