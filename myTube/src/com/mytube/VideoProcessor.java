package com.mytube;

public class VideoProcessor {

    private IVideoEncoder encoder;
    private IVideoDatabase database;
    private IEmailService service;

    public VideoProcessor(IVideoEncoder encoder, IVideoDatabase database, IEmailService service) {
        this.encoder = encoder;
        this.database = database;
        this.service = service;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        service.sendEmail(video.getUser().getEmail());
    }
}

