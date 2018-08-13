FROM java:8

ENV APP_ENV dev

RUN mkdir -p /app

WORKDIR /app

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

CMD ["/app/run.sh"]
