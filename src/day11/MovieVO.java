package day11;

public class MovieVO {

    private String title;
    private String ReleaseDate;
    private String Person;
    private String actor;
    private int runningTime;
    private int grade;

    public MovieVO() {
    }

    public MovieVO(String title, String releaseDate, String person, String actor, int runningTime, int grade) {
        this.title = title;
        ReleaseDate = releaseDate;
        Person = person;
        this.actor = actor;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getPerson() {
        return Person;
    }

    public void setPerson(String person) {
        Person = person;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", ReleaseDate='" + ReleaseDate + '\'' +
                ", Person='" + Person + '\'' +
                ", actor='" + actor + '\'' +
                ", runningTime=" + runningTime +
                ", grade=" + grade +
                '}';
    }
}
