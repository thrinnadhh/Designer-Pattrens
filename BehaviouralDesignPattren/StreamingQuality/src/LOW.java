
public class LOW implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType() {
        // TODO Auto-generated method stub
        return VideoQuality.LOW;
    }

    @Override
    public Video adjust(Video video) {
        // TODO Auto-generated method stub
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;

    }

}
