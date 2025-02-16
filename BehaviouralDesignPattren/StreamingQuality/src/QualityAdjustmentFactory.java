public class QualityAdjustmentFactory {
    public static QualityAdjustmentStrategy adjustQuality(VideoQuality videoQuality,Video video){
//        QualityAdjustmentStrategy qualityAdjustmentStrategy;
//        if(videoQuality.equals(VideoQuality.HIGH)){
//            qualityAdjustmentStrategy = new HIGH();
//        }
//        else if(videoQuality.equals(VideoQuality.MEDIUM)){
//            qualityAdjustmentStrategy = new MEDIUM();
//        }
//        else{
//            qualityAdjustmentStrategy = new LOW();
//        }
//        return qualityAdjustmentStrategy;
//        Both are acceptable but in other compiler the below one doesnt worked so tried in intellij.
        if(videoQuality.equals(VideoQuality.HIGH)){
            return new HIGH();
        }
        else if(videoQuality.equals(VideoQuality.MEDIUM)){
            return new MEDIUM();
        }
        else{
            return new LOW();
        }

    }
}
