### Basic Commands
- FROM - specifies the base(parent) image. Alpine version is the minimal docker image based on Alpine Linux which is only 5mb in size.
- RUN - runs a Linux command. Used to install packages into container, create folders, etc
- ENV - sets environment variable. We can have multiple variables in a single dockerfile.
- COPY - copies files and directories to the container.
- EXPOSE - expose ports
- ENTRYPOINT - provides command and arguments for an executing container.
- CMD - provides a command and arguments for an executing container. There can be only one CMD.
- VOLUME - create a directory mount point to access and store persistent data.
- WORKDIR - sets the working directory for the instructions that follow.
- LABEL - provides metada like maintainer.
- ADD - Copies files and directories to the container. Can unpack compressed files.
- ARG - Define build-time variable.

### COPY vs. ADD
Both commands serve a similar purpose, to copy files into the image.

- COPY - let you copy files and directories from the host.
- ADD - does the same. Additionally it lets you use URL location and unzip files into image.


### ENTRYPOINT vs. CMD

- CMD - allows you to set a default command which will be executed only when you run a container without specifying a command. If a Docker container runs with a command, the default command will be ignored.
- ENTRYPOINT - allows you to configure a container that will run as an executable. ENTRYPOINT command and parameters are not ignored when Docker container runs with command line parameters.

### VOLUME
You declare VOLUME  in your Dockerfile to denote where your container will write application data. When you run your container using -v   you can specify its mounting point.

