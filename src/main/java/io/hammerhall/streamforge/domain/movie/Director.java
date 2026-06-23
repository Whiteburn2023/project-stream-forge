package io.hammerhall.streamforge.domain.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Director {

	private int id;
	private String name;
	private String imdb;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Director other = (Director) obj;
        return id == other.id;
    }

	@Override
	public String toString() {
		return "Director [id=" + id + ", name=" + name + ", imdb=" + imdb + "]";
	}

}
