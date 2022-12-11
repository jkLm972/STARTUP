package fr.efrei.repository;
import fr.efrei.domain.Job;
import java.util.ArrayList;
import java.util.List;

public class JobRepository implements IJobRepository {
    private static JobRepository repository = null;
    private List<Job> jobDB = null;

    private JobRepository() {
        jobDB = new ArrayList<Job>();
    }

    public static JobRepository getRepository() {
        if (repository == null){
            return new JobRepository();
        }
        return repository;
    }

    @Override
    public Job create(Job job) {
        boolean success = jobDB.add(job);
        if (success){
            return job;
        }
        else {
            return null;
        }
    }

    @Override
    public Job read(String s) {
        return null;
    }

    public Job read(int s) {
        for (Job i : jobDB){
            if (i.getPositionCode() == s){
                return i;
            }
        }
        return null;
    }

    @Override
    public Job update(Job job) {
        Job oldJob = read(job.getPositionCode());
        if (job != null){
            jobDB.remove(oldJob);
            jobDB.add(job);
            return job;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Job jobToDelete = read(s);
        if (jobToDelete == null) {
            return false;
        }
        jobDB.remove(jobToDelete);
        return true;
    }

    @Override
    public List<Job> getAll() {
        return jobDB;
    }
}