# Vagrank

#####  WIP - DO NOT USE THIS IN PRODUCTION!

Proposal:
-
Vagrank is supposed to be a script host to vagrant, 
the idea is create a typesafe, idiomatic and simple
DSL for vagrantfile and a CLI to execute them.

The project isn't done yet, you can contribute cloning 
the project and creating a pull-request 🙂.

Structure
-
The project has 3 modules:
* **script-definition** - has the script definitions, 
the api, etc

* **script-host** - has the host for script, will
manage the compiled script, etc

* **cli** - has the command logic and will call the 
**script-host**

* **intellij** - has the intellij plugin to manage
 the imports of **script-definition**(not created yet)

Inspirations
-
My inspirations for the project:

* [Bukkript](https://github.com/DevSrSouza/Bukkript) -
is a script adapter for Bukkit(minecraft plugin api) 
 and [KotlinBukkitAPI](https://github.com/DevSrSouza/Bukkript)
 
* [Kiobs.script](https://github.com/DevNatan/kiobs.script) -
is a script project also that loads kotlin scripts.