
public class HIGH implements QualityAdjustmentStrategy {

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
        // TODO Auto-generated method stub
    }

    @Override
    public Video adjust(Video video) {
        // TODO Auto-generated method stub
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }

}
