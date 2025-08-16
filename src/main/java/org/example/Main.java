package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * Copyright (c) 2025 Cristofer Luchtenberg
 * Licensed under MIT License (https://opensource.org/licenses/MIT)
 */

import static org.example.core.HtmlFactory.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        try (PrintWriter out = new PrintWriter("src/main/html/index.html")) {

            var inputUser = input().id("username").name("username");

            html(
                head(
                    title("Example")
                ),
                body(
                    form(
                        inputUser
                   )
                )
            ).build(out);

        }
    }
}