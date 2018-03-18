FROM daggerok/jboss:4.2.3.GA
ENV JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 "
EXPOSE 5005
HEALTHCHECK --timeout=2s --retries=22 \
        CMD wget -q --spider http://127.0.0.1:8080/web/ \
         || exit 1
ADD ./build/libs/*.ear ${JBOSS_HOME}/server/default/deploy/
