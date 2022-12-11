package fr.efrei.domain;
public class Job {
    private String title;
    private int positionCode;

    public Job() {
    }

    public Job(Builder builder) {
        this.title = builder.title;
        this.positionCode = builder.positionCode;
    }


    public String getTitle() {
        return title;
    }

    public int getPositionCode() {
        return positionCode;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", positionCode=" + positionCode +
                '}';
    }

    public static class Builder {
        private String title;
        private int positionCode;
        
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPositionCode(int positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder copy(Job job){
            this.title = job.title;
            this.positionCode = job.positionCode;
            return this;
        }


        public Job build() {
            return new Job(this);
        }
    }
}