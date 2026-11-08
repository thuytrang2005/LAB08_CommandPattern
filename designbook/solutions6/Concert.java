package designbook.solutions6;

import java.util.Objects;

class Concert implements Show {

    private String aTitle;
    private String aArtist;
    private int aRunningTime;

    public Concert(String pTitle, String pArtist, int pRunningTime) {
        assert pTitle != null && pArtist != null;

        aTitle = pTitle;
        aArtist = pArtist;
        aRunningTime = pRunningTime;
    }

    @Override
    public String description() {
        return aTitle + " by " + aArtist;
    }

    @Override
    public int runningTime() {
        return aRunningTime;
    }

    @Override
    public Show copy() {
        return new Concert(aTitle, aArtist, aRunningTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aArtist, aRunningTime);
    }

    @Override
    public boolean equals(Object pObject) {
        if (this == pObject) return true;
        if (pObject == null || getClass() != pObject.getClass()) return false;

        Concert other = (Concert) pObject;

        return aRunningTime == other.aRunningTime
                && Objects.equals(aTitle, other.aTitle)
                && Objects.equals(aArtist, other.aArtist);
    }
}