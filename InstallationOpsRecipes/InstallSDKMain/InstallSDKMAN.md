## Install SDKMAN
```
curl -s "https://get.sdkman.io" | bash
```
* Curl will fetch the script hosted at get.sdkman.io
* -s is for silent mode
* The output is piped to bash shell instance, which executes the fetched script: downloading, verifying, and installing SDKMAN on your system.

### The Script
* The script sets up sdkman folders and files.
* Adds sdkman to shell configuration file (.bashrc for bash shell).
  * You can also do it manually by adding this line to .bashrc : ` source "$HOME/.sdkman/bin/sdkman-init.sh" ` .

* The script sets up SDKMAN_DIR environment variable and adds that to PATH. 

### After Running the Curl command
* Reload your shell using ` source ~/.bashrc ` .
* run ` sdkman version ` to verify the installation. 
