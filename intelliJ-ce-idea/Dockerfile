FROM mvpjava/intellij-ce-2020.3-base-image:ubuntu-openjdk11

MAINTAINER Andy Luis "MVP Java - mvpjava.com, triomni-it.com"

ARG USER=mvpjava      

ENV HOME=/home/${USER}
ENV USER_ID=1000
ENV GROUP_ID=1000

RUN apt-get install sudo -y && \
    useradd ${USER} && \
    export uid=${USER_ID} gid=${GROUP_ID} && \
    mkdir -p /etc/sudoers.d && \
    echo "${USER}:x:${USER_ID}:${GROUP_ID}:${USER},,,:${HOME}:/bin/bash" >> /etc/passwd && \
    echo "${USER}:x:${USER_ID}:" >> /etc/group && \
    echo "${USER} ALL=(ALL) NOPASSWD: ALL" > /etc/sudoers.d/${USER} && \
    chmod 0440 /etc/sudoers.d/${USER} 

RUN mkdir -p ${HOME}/.config/JetBrains/java_dev_data &&     \
    mkdir -p ${HOME}/.local/share/JetBrains/java_dev_data &&   \
    mkdir -p ${HOME}/.local/share/JetBrains/consentOptions &&   \
    mkdir -p ${HOME}/.java/.userPrefs && \
    chown -R ${USER}:${USER} ${HOME} &&  \
    chmod 2764 -R ${HOME}

USER ${USER}
WORKDIR ${HOME}

ENTRYPOINT  ["sh", "-c", "${IJ_SETUP_SCRIPT_DIR_CNTR}/idea.sh"]
