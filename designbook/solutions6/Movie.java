package designbook.solutions6;

import java.util.Objects;

class Movie implements Show {

    private String aTitle;
    private int aYear;
    private int aRunningTime;

    public Movie(String pTitle, int pYear, int pRunningTime) {
        assert pTitle != null;

        aTitle = pTitle;
        aYear = pYear;
        aRunningTime = pRunningTime;
    }

    @Override
    public String description() {
        return aTitle + " (" + aYear + ")";
    }

    @Override
    public int runningTime() {
        return aRunningTime;
    }

    @Override
    public Show copy() {
        return new Movie(aTitle, aYear, aRunningTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aYear, aRunningTime);
    }

    @Override
    public boolean equals(Object pObject) {
        if (this == pObject) return true;
        if (pObject == null || getClass() != pObject.getClass()) return false;

        Movie other = (Movie) pObject;

        return aYear == other.aYear
                && aRunningTime == other.aRunningTime
                && Objects.equals(aTitle, other.aTitle);
    }
}