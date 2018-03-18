FROM daggerok/jboss:4.2.2.GA
ENV JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 "
EXPOSE 5005
ADD ./build/libs/*.ear ${JBOSS_HOME}/server/default/deploy/
