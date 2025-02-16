package src;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    public static volatile FileBasedConfigurationManagerImpl instance;

    private FileBasedConfigurationManagerImpl() {
        // TODO Auto-generated constructor stub
        super();
    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        try{
            return properties.getProperty(key);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        }
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        String value = properties.getProperty(key);
        if(value == null){
            return null;
        }
        try{
            return convert(value,type);
        }catch (Exception e){
            throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        }
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        properties.setProperty(key,value);
//        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        properties.setProperty(key,value.toString());
//        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        properties.remove(key);
//        throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();

//        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(instance == null){
            synchronized (FileBasedConfigurationManagerImpl.class){
                if(instance == null){
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        instance = null;
    }

}