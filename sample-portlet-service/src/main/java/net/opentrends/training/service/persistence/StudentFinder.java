package net.opentrends.training.service.persistence;

public interface StudentFinder {
    public java.util.List<java.lang.Object[]> findByGroupId(long groupId,
        int begin, int end);
}
