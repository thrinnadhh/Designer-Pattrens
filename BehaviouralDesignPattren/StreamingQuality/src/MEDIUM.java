public class MEDIUM implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType() {
        // TODO Auto-generated method stub
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video adjust(Video video) {
        // TODO Auto-generated method stub
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }

}
