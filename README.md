**

Development mode

* leiningen requied

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

lein figwheel

To start the DevCards build run

lein figwheel devcards

Figwheel will automatically push cljs changes to the browser. The server will be available at http://localhost:3449 once Figwheel starts up. To view your devcards, type (switch-to-build devcards) at the Figwheel REPL and navigate to http://localhost:3449/cards.

Figwheel also starts nREPL using the value of the :nrepl-port in the :figwheel config found in project.clj. By default the port is set to 7002.

The figwheel server can have unexpected behaviors in some situations such as when using websockets. In this case it's recommended to run a standalone instance of a web server as follows:

lein do clean, run

The application will now be available at http://localhost:3000.
