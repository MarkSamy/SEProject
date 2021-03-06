package swe425.project.MIUScheduler.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import swe425.project.MIUScheduler.model.Course;
import swe425.project.MIUScheduler.model.Faculty;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
