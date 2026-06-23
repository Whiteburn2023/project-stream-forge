package io.hammerhall.streamforge.domain.world;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class City {

	private int id;
	private String name;
	private String countryCode;
	private int population;

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
		City other = (City) obj;

        return id == other.id;
    }

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countryCode + "]";
	}

}
