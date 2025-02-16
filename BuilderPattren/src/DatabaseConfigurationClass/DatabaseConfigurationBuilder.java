package DatabaseConfigurationClass;

@WithBuilder
public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

//    private DatabaseConfigurationBuilder(Builder builder) {
//        this.databaseUrl = databaseUrl;
//        this.username = username;
//        this.password = password;
//        this.maxConnections = maxConnections;
//        this.enableCache = enableCache;
//        this.isReadOnly = isReadOnly;
//    }

    public static  class Builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public Builder databaseUrl(String databaseUrl){
            this.databaseUrl = databaseUrl;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder maxConnections(int maxConnections){
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder enableCache(boolean enableCache){
            this.enableCache = enableCache;
            return this;
        }

        public Builder isReadOnly(boolean isReadOnly){
            this.isReadOnly = isReadOnly;
            return this;
        }

        public DatabaseConfigurationBuilder build(){
//          return new DatabaseConfigurationBuilder(this);
            DatabaseConfigurationBuilder databaseConfigurationBuilder = new DatabaseConfigurationBuilder();
            databaseConfigurationBuilder.databaseUrl = this.databaseUrl;
            databaseConfigurationBuilder.username = this.username;
            databaseConfigurationBuilder.password = this.password;
            databaseConfigurationBuilder.maxConnections = this.maxConnections;
            databaseConfigurationBuilder.enableCache = this.enableCache;
            databaseConfigurationBuilder.isReadOnly = this.isReadOnly;
            return databaseConfigurationBuilder;
        }
    }
}