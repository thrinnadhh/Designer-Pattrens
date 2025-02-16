package DatabaseConnection;

@WithBuilder
public class   QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;



    public static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public Builder select(String select){
            this.select = select;
            return this;
        }

        public Builder from(String from){
            this.from = from;
            return this;
        }

        public Builder where(String where){
            this.where = where;
            return this;
        }

        public Builder join(String join){
            this.join = join;
            return this;
        }

        public Builder orderBy(String orderBy){
            this.orderBy = orderBy;
            return this;
        }

        public Builder groupBy(String groupBy){
            this.groupBy = groupBy;
            return this;
        }

        public QueryBuilder build(){
//            return new QueryBuilder(this);
            QueryBuilder queryBuilder = new QueryBuilder();
            queryBuilder.select = this.select;
            queryBuilder.from = this.from;
            queryBuilder.groupBy = this.groupBy;
            queryBuilder.join = this.join;
            queryBuilder.where = this.where;
            queryBuilder.orderBy = this.orderBy;
            return queryBuilder;
        }
    }
}