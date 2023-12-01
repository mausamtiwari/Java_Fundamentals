package be.intecbrussel.Project2;

import java.util.Objects;

public class PostCard {
    String Country;
    String Continent;

    public PostCard(String country, String continent) {
        Country = country;
        Continent = continent;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    @Override
    public String toString() {
        return "PostCard{" +
                "Country='" + Country + '\'' +
                ", Continent='" + Continent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostCard postCard)) return false;
        return getCountry().equals(postCard.getCountry()) && getContinent().equals(postCard.getContinent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getContinent());
    }
}
